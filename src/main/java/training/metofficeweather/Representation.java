package training.metofficeweather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Representation {
    @JsonProperty("D")
    public String windDirection;
    @JsonProperty("F")
    public String feelsLikeTemp;
    @JsonProperty("G")
    public String windGust;
    @JsonProperty("H")
    public String relativeHumidity;
    @JsonProperty("Pp")
    public String precipitationProbability;
    @JsonProperty("S")
    public String windSpeed;
    @JsonProperty("T")
    public String temperature;
    @JsonProperty("V")
    public String visibility;
    @JsonProperty("W")
    public String weather;
    @JsonProperty("U")
    public String ultraviolet;
    @JsonProperty("$")
    public String minutesAfterMidnight;


    public String getWindDirection() {
        return windDirection;
    }

    public String getFeelsLikeTemp() {
        return feelsLikeTemp;
    }

    public String getWindGust() {
        return windGust;
    }

    public String getRelativeHumidity() {
        return relativeHumidity;
    }

    public String getPrecipitationProbability() {
        return precipitationProbability;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getWeather() {
        return weather;
    }

    public String getUltraviolet() {
        return ultraviolet;
    }

    public String getMinutesAfterMidnight() {
        return minutesAfterMidnight;
    }

    @Override
    public String toString() {
        return "Representation{" +
                "windDirection='" + windDirection + '\'' +
                ", feelsLikeTemp='" + feelsLikeTemp + '\'' +
                ", windGust='" + windGust + '\'' +
                ", relativeHumidity='" + relativeHumidity + '\'' +
                ", precipitationProbability='" + precipitationProbability + '\'' +
                ", windSpeed='" + windSpeed + '\'' +
                ", temperature='" + temperature + '\'' +
                ", visibility='" + visibility + '\'' +
                ", weather='" + weather + '\'' +
                ", ultraviolet='" + ultraviolet + '\'' +
                ", minutesAfterMidnight='" + minutesAfterMidnight + '\'' +
                '}';
    }
}
