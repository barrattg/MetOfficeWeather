package training.metofficeweather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.xml.stream.Location;
import java.util.*;
import java.util.stream.Stream;
public class Main {
    public static void main(String args[]) throws JsonProcessingException {
        Client client = ClientBuilder.newClient();
        String data = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=52452172-a037-42d6-8d10-07c179cccb42")
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);

        //System.out.println(data);
        ObjectMapper objectMapper = new ObjectMapper();

        LocationData locations = objectMapper.readValue(data, LocationData.class);
        ArrayList<String> str = new ArrayList<String>();

        for(int i = 0;i < 6002 ;i++) {
            str.add(locations.getData().getMapData().get(i).getName());
            //data.streamlocationList().sorted(Comparator.comparing(Location::getName)).forEach(
            //location -> System.out.println(location)
            //);


        }
        Collections.sort(str);

        System.out.println(str);

    }

    //todo 1. Reads the locations from the site list and prints a list of locations for the user to choose from.

    //todo 2. Asks the user to input the location name they're interested in.
    //Scanner scan = new Scanner ();
    }

