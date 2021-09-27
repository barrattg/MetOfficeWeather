package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Period {

    @JsonProperty("Rep")
    private ArrayList<Representation> representations;
    String type;
    String value;
    public ArrayList<Representation> getRepresentations() {
        return representations;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
