package training.metofficeweather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.MediaType;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.util.HashMap;
import java.util.Map;


@Controller
public class WeatherController {



    @RequestMapping("/weather") // page for user to enter place ID
    String home(Model myModel) {
        String [] fakeLocations = {"Cambridge", "London", "Bath"};
        myModel.addAttribute("locations", fakeLocations);
        return "hello";
    }

    @RequestMapping(
            value = "/weatherForLocation",
            method= RequestMethod.POST,
            consumes = MediaType.ALL_VALUE
    )
    ModelAndView weatherForLocation(@RequestParam Map<String, String> body) {
        System.out.println("just:" + body);
        return new ModelAndView("info", "location", body) ;
    }

    @RequestMapping("/weatherInfo") // page for putting result data from place ID
    ModelAndView weatherInfo(@RequestParam("locationId") String locationId) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Client weatherClient = ClientBuilder.newClient();
            String weatherApp = weatherClient.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/" + locationId + "?res=3hourly&key=52452172-a037-42d6-8d10-07c179cccb42")
                    .request(javax.ws.rs.core.MediaType.TEXT_PLAIN)
                    .get(String.class);
            WeatherRoot weatherRoot = objectMapper.readValue(weatherApp, WeatherRoot.class);

            return new ModelAndView("info", "weatherInfo", weatherRoot);

        } catch(JsonProcessingException jpe) {
            return new ModelAndView("error", HttpStatus.valueOf(jpe.getMessage()));
        }

    }
}

/*
HashMap<String, String> weatherHashMap = new HashMap<String, String>() {
    put(
}

 */