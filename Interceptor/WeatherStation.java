public class WeatherStation {
    // weather data
    private float temperature;
    private float humidity;
    private float pressure;

    // weather data dispatcher
    public Dispatcher dispatcher;

    public WeatherStation(){
        dispatcher = new Dispatcher();
    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
    }

    public void setHumidity(float humidity){
        this.humidity = humidity;
    }

    public void setPressure(float pressure){
        this.pressure = pressure;
    }
}
