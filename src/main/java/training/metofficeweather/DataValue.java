package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataValue {
    String dataDate;
    String type;
    @JsonProperty("Location")
    DataLocationWeather location;

    @Override
    public String toString() {
        return "DataValue{" +
                "dataDate='" + dataDate + '\'' +
                ", type='" + type + '\'' +
                ", location=" + location +
                '}';
    }

    public String getDataDate() {
        return dataDate;
    }

    public String getType() {
        return type;
    }

    public DataLocationWeather getLocation() {
        return location;
    }
}

