package training.metofficeweather;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {
    private final RestTemplate restTemplate;
    public RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getDataPlainJSON() {
        String url = "http://datapoint.metoffice.gov.uk/public/data/val/wxfcs/all/json/{locationId}?res=3hourly&key=52452172-a037-42d6-8d10-07c179cccb42";
        return this.restTemplate.getForObject(url, String.class);
    }

}