package training.metofficeweather;

public class WeatherInfo {
    private final String locationId;

    public WeatherInfo(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationId() {
        return locationId;
    }
}
