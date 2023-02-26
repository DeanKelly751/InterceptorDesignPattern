public class ContextObject {

    private WeatherStation weatherStation;

    public ContextObject(WeatherStation weatherStation){
        this.weatherStation = weatherStation;
    }

    public float getTemperature() {
        return weatherStation.getTemperature();
    }

    public float getHumidity() {
        return weatherStation.getHumidity();
    }

    public float getPressure() {
        return weatherStation.getPressure();
    }

}
