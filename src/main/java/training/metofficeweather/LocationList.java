package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;


public class LocationList {
    @JsonProperty("Location")
    ArrayList<MapData> mapData;

    @Override
    public String toString() {
        return "Locations{" +
                "locations=" + mapData +
                '}';
    }
}

