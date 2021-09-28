package training.metofficeweather.site;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Root {
    @JsonProperty(value="Locations") // For ObjectMapper
    private Locations locations;

    @Override
    public String toString() {
        return "Root={" +
                "locations=" + locations +
                '}';
    }

    public Locations getLocations() {
        return locations;
    }
}
