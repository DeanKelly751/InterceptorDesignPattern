public class StatisticsDisplay implements Interceptor {
    
    private float maxTemp = Float.MIN_VALUE;    // first reading will always be bigger
    private float minTemp = Float.MAX_VALUE;    // first reading will always be smaller
    private float tempSum = 0;                  // temperature sum starts at zero
    private int numReadings;                    // number of temperature readings (to find mean)

    public void update(ContextObject context) {
        // get current temperature from weather context
        float currentTemp = context.getTemperature();

        // update max temp
        if (currentTemp > maxTemp) {
            maxTemp = currentTemp;
        }

        // update min temp
        if (currentTemp < minTemp) {
            minTemp = currentTemp;
        }

        // calculate mean temp
        tempSum += currentTemp;
        numReadings++;

        // display results
        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = "
            + (tempSum/numReadings)
            + "/" + maxTemp + "/" + minTemp);
    }
}
