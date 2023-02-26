public class WeatherApp {

    private static WeatherStation weatherStation;

    public static void main(String args[]){
        // create a weather station
        weatherStation = new WeatherStation();

        // create displays (interceptors)
        CurrentConditionsDisplay currCondDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statsDisplay = new StatisticsDisplay();
        // register interceptors with dispatcher
        weatherStation.dispatcher.registerInterceptor(currCondDisplay);
        weatherStation.dispatcher.registerInterceptor(statsDisplay);

        // generate events
        takeMeasurements(60, 42, 99);
        takeMeasurements(80, 410, 512);
        takeMeasurements(50, 390, 250);

    }

    // event
    private static void takeMeasurements(float temperature, float humidity, float pressure){
        // update values
        weatherStation.setTemperature(temperature);
        weatherStation.setHumidity(humidity);
        weatherStation.setPressure(pressure);
        
        // create context object
        ContextObject context = new ContextObject(weatherStation);

        // call dispatcher to notify interceptors with context object
        weatherStation.dispatcher.notifyInterceptors(context);
    }
}
