package training.metofficeweather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class Main {
    public static void main(String args[]) throws JsonProcessingException {
        Client client = ClientBuilder.newClient();
        String data = client.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/sitelist?key=52452172-a037-42d6-8d10-07c179cccb42")
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);

        System.out.println(data);
        ObjectMapper objectMapper = new ObjectMapper();

        LocationData locations = objectMapper.readValue(data, LocationData.class);

        System.out.println(locations);



        //System.out.println(locations);
    }
    //.location.name

    }

