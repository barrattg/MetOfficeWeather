package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Period {

    ArrayList<Representation> representations;

    @Override
    public String toString() {
        return "Period{" +
                "representations=" + representations +
                '}';
    }

    public ArrayList<Representation> getRepresentations() {
        return representations;
    }

    public void setRepresentations(ArrayList<Representation> representations) {
        this.representations = representations;
    }

}
