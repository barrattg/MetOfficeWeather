package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataLocationWeather {
    String name;
    @JsonProperty("i")
    String id;
    String lat;
    String lon;
    @JsonProperty("Period")
    private ArrayList<Period> periods;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }

    public ArrayList<Period> getPeriods() {
        return periods;
    }

    @Override
    public String toString() {
        return "DataLocationWeather{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", periods=" + periods +
                '}';
    }
}
