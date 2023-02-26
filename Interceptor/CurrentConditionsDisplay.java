public class CurrentConditionsDisplay implements Interceptor {
    
    private float temperature;
    private float humidity;

    public void update(ContextObject context) {
        // get data from weather context
        this.temperature = context.getTemperature();
        this.humidity = context.getHumidity();

        // display results
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
        + "F degrees and " + humidity + "% humidity");
    }
}
    