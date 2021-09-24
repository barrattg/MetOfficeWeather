package training.metofficeweather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.xml.stream.Location;
import java.util.*;

import static training.metofficeweather.Greetings.greeter;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Client client = ClientBuilder.newClient();
        String data = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=52452172-a037-42d6-8d10-07c179cccb42")
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);
    //the above is client for location data
        Client weatherClient = ClientBuilder.newClient();
        String weatherApp = weatherClient .target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/310042?res=3hourly&key=52452172-a037-42d6-8d10-07c179cccb42")
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);
    //the above is weather data
        ObjectMapper objectMapper = new ObjectMapper();

        LocationData locations = objectMapper.readValue(data, LocationData.class);
        ArrayList<String> str = new ArrayList<String>();

        for (int i = 0; i < 6002; i++) {
            str.add(locations.getData().getMapData().get(i).getName());



        }


       SiteRep dataValue = objectMapper.readValue(weatherApp, SiteRep.class);

        ArrayList<String> str2 = new ArrayList<String>();
        str2.add(dataValue.getDataValues().getDataLocationWeathers().getPeriods().getRepresentations().getDailyData());

        System.out.println(str2);

         greeter();



        //todo 1. Reads the locations from the site list and prints a list of locations for the user to choose from.

        //todo 2. Asks the user to input the location name they're interested in.
        //we need 2nd web address and use input to change the id code in weblink

    }
}
