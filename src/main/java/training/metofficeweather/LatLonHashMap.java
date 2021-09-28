package training.metofficeweather;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class LatLonHashMap {
public static void main(String[] args) {
    Map<String, LatLong> latLongHashMap = new HashMap<>();
    for (int i = 0; i < 6002; i++) {
        LatLong latLong = new LatLong(1,2);
        latLongHashMap.put("Cambridge", latLong );
    }
}

}