package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.ArrayList;
@JsonIgnoreProperties(ignoreUnknown = true)

    public class SiteRep {
        @JsonProperty("DV")
        private DataValue dataValues;

    @Override
    public String toString() {
        return "SiteRep{" +
                "dataValues=" + dataValues +
                '}';
    }

    public DataValue getDataValues() {
        return dataValues;
    }
}




