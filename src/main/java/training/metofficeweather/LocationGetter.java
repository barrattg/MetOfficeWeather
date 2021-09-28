package training.metofficeweather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import training.metofficeweather.site.Location;
import training.metofficeweather.site.Root;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import java.sql.Array;
import java.util.ArrayList;

public class LocationGetter {
    public ArrayList<String> getLocation(){


        Client client = ClientBuilder.newClient();
        String data = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=52452172-a037-42d6-8d10-07c179cccb42")
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);
        //the above is client for location data
        ObjectMapper objectMapper = new ObjectMapper();
        Root locations = null;
        try {
            locations = objectMapper.readValue(data, Root.class);


        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        ArrayList<String> str = new ArrayList<String>();

        for (Location location: locations.getLocations().getLocations()) {

            str.add(location.getName());


        }
        //System.out.println(str);

        return str;


    }

}