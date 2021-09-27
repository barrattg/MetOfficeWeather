package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataLocationWeather {
    String name;
    @JsonProperty("Period")
    private ArrayList<Period> periods;

    @Override
    public String toString() {
        return "DataLocationWeather{" +
                "name='" + name + '\'' +
                ", periods=" + periods +
                '}';
    }

    public String getName() {
        return name;
    }

    public ArrayList<Period> getPeriods() {
        return periods;
    }


}
