package offtop.cursor.service.impl;

import java.util.HashMap;
import java.util.Map;
import offtop.cursor.model.Weather;
import static offtop.cursor.service.ApiConstants.NOT_FOUND_STATUS_CODE;
import static offtop.cursor.service.ApiConstants.OK_STATUS_CODE;
import offtop.cursor.service.WeatherService;

public class FakeWeatherServiceImpl implements WeatherService {
    
    @Override
    public Weather getByCityName(String city) {
        validateCityName(city);
        
        WeatherResponse weatherResponse = fakeHttpClient(city.toLowerCase());
        
        Weather weather = null;
        
        if (weatherResponse.statusCode != NOT_FOUND_STATUS_CODE) {
            weather = weatherResponse.body;
        }
        
        return weather;
    }
    
    private WeatherResponse fakeHttpClient(String cityName) {
        Weather kharkiv = new Weather("Kharkiv", "UA", 25);
        Weather kyiv = new Weather("Kyiv", "UA", 22);
        Weather odesa = new Weather("Odesa", "UA", 23);
        Weather dnepr = new Weather("Dnepr", "UA", 21);
        
        Map<String, Weather> cities = new HashMap<>();
        cities.put("kharkiv", kharkiv);
        cities.put("kyiv", kyiv);
        cities.put("odesa", odesa);
        cities.put("dnepr", dnepr);
        
        Weather weather = cities.get(cityName);
        
        WeatherResponse weatherResponse = null;
        
        if (weather == null) {
            weatherResponse = new WeatherResponse(NOT_FOUND_STATUS_CODE, null);
        } else {
        weatherResponse = new WeatherResponse(OK_STATUS_CODE, weather);
        }
        return weatherResponse;
    }
    
    class WeatherResponse {
        int statusCode;
        Weather body;
        
        public WeatherResponse(int statusCode, Weather body) {
            this.statusCode = statusCode;
            this.body = body;
        }
    }
}