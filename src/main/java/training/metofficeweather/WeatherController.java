package training.metofficeweather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

@Controller
public class WeatherController {

    @RequestMapping("/weather") // page for user to enter place ID
    ModelAndView home() {
        return new ModelAndView("index");
    }

    @RequestMapping("/weatherInfo") // page for putting result data from place ID
    ModelAndView weatherInfo(@RequestParam("locationId") String locationId) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Client weatherClient = ClientBuilder.newClient();
            String weatherApp = weatherClient.target("http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/" + locationId + "?res=3hourly&key=52452172-a037-42d6-8d10-07c179cccb42")
                    .request(MediaType.TEXT_PLAIN)
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