public class WeatherAppTest {
    
        public static void main(String[] args) {
            // create a weather station
            WeatherStation weatherStation = new WeatherStation();
    
            // create a current conditions display interceptor
            CurrentConditionsDisplay currCondDisplay = new CurrentConditionsDisplay();
    
            // register interceptor with dispatcher
            weatherStation.dispatcher.registerInterceptor(currCondDisplay);
    
            // print original temperature and humidity values
            System.out.println("Original values:");
            System.out.println("Temperature: " + weatherStation.getTemperature());
            System.out.println("Humidity: " + weatherStation.getHumidity());
    
            // update values
            weatherStation.setTemperature(60);
            weatherStation.setHumidity(42);
    
            // create context object
            ContextObject context = new ContextObject(weatherStation);
    
            // call dispatcher to notify interceptors with context object
            weatherStation.dispatcher.notifyInterceptors(context);
    
            // print updated temperature and humidity values
            System.out.println("Values updated by interceptor:");
            System.out.println("Temperature: " + weatherStation.getTemperature());
            System.out.println("Humidity: " + weatherStation.getHumidity());
    
            // unregister interceptor
            weatherStation.dispatcher.removeInterceptor(currCondDisplay);
    
            // print temperature and humidity values after interceptor is unregistered
            System.out.println("Values after unregistering interceptor:");
            System.out.println("Temperature: " + weatherStation.getTemperature());
            System.out.println("Humidity: " + weatherStation.getHumidity());
        }
    }
    

