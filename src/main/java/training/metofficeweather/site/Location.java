package training.metofficeweather.site;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    private int id;
    private String name;
    private String region;
    private String unitaryAuthArea;
    private float elevation;
    private float latitude;
    private float longitude;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getUnitaryAuthArea() {
        return unitaryAuthArea;
    }

    public float getElevation() {
        return elevation;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return id == location.id && Objects.equals(name, location.name) && Objects.equals(region, location.region) && Objects.equals(unitaryAuthArea, location.unitaryAuthArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, region, unitaryAuthArea);
    }

}
