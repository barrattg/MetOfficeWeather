package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)

public class WeatherRoot {
    @JsonProperty("SiteRep")
    public SiteRep siteRep;
    private Map<String, String> weatherValue = weatherValue();
    private Map<String, String> visibilityValue = visibilityValue();


    public SiteRep getSiteRep() {
        return siteRep;
    }

    @Override
    public String toString() {
        return "WeatherRoot{" +
                "siteRep=" + siteRep +
                '}';
    }
    private Map<String, String> weatherValue() {

        Map<String, String> weatherValue;

            weatherValue = new HashMap<>();
            weatherValue.put("0", "Clear night");
            weatherValue.put("1", "Sunny day");
            weatherValue.put("2", "Partly cloudy (night)");
            weatherValue.put("3", "Partly cloudy (day)");
            weatherValue.put("4", "Not used");
            weatherValue.put("5", "Mist");
            weatherValue.put("6", "Fog");
            weatherValue.put("7", "Cloudy");
            weatherValue.put("8", "Overcast");
            weatherValue.put("9", "Light rain shower (night)");
            weatherValue.put("10", "Light rain shower (day)");
            weatherValue.put("11", "Drizzle");
            weatherValue.put("12", "Light rain");
            weatherValue.put("13", "Heavy rain shower (night)");
            weatherValue.put("14", "Heavy rain shower (day)");
            weatherValue.put("15", "Heavy rain");
            weatherValue.put("16", "Sleet shower (night)");
            weatherValue.put("17", "Sleet shower (day)");
            weatherValue.put("18", "Sleet");
            weatherValue.put("19", "Hail shower (night)");
            weatherValue.put("20", "Hail shower (day)");
            weatherValue.put("21", "Hail");
            weatherValue.put("22", "Light snow shower (night)");
            weatherValue.put("23", "Light snow shower (day)");
            weatherValue.put("24", "Light snow");
            weatherValue.put("25", "Heavy snow shower (night)");
            weatherValue.put("26", "Heavy snow shower (night)");
            weatherValue.put("27", "Heavy snow");
            weatherValue.put("28", "Thunder shower (night)");
            weatherValue.put("29", "Thunder shower (day)");
            weatherValue.put("30", "Thunder");
            weatherValue.put("NA", "Not Available");

            return weatherValue;

        }


    public Map<String, String> getWeatherValue() {
        return weatherValue;
    }

    private Map<String, String> visibilityValue() {

        Map<String, String> visibilityValue;

        visibilityValue = new HashMap<>();
        visibilityValue.put("UN", "Unknown");
        visibilityValue.put("VP", "Very Poor");
        visibilityValue.put("PO", "Poor");
        visibilityValue.put("MO", "Moderate");
        visibilityValue.put("GO", "Good");
        visibilityValue.put("VG", "Very Good");
        visibilityValue.put("EX", "Excellent");

        return visibilityValue;
    }

        public Map<String, String> getVisibilityValue() {
            return visibilityValue;
        }
}

