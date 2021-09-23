package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationData {

    @JsonProperty("Locations")
    LocationList data;

    @Override
    public String toString() {
        return "LocationData{" +
                "data=" + data +
                '}';
    }

}
