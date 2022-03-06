package cr.weather_bot.service.impl;

import cr.weather_bot.model.Weather;
import static cr.weather_bot.service.ApiConstants.NOT_FOUND_STATUS_CODE;
import static cr.weather_bot.service.ApiConstants.OK_STATUS_CODE;
import cr.weather_bot.service.WeatherService;
import java.util.HashMap;
import java.util.Map;

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
//        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private WeatherResponse fakeHttpClient(String cityName) {
        
        Weather lviv = new Weather("Lviv", "UA", 18);
        Weather kyiv = new Weather("Kyiv", "UA", 20);
        Weather odesa = new Weather("Odesa", "UA", 25);
        Weather kharkiv = new Weather("Kharkiv", "UA", 28);
        
        Map<String, Weather> fakeData = new HashMap<>();
        
        fakeData.put("lviv", lviv);
        fakeData.put("kyiv", kyiv);
        fakeData.put("odesa", odesa);
        fakeData.put("kharkiv", kharkiv);
        
//        throw new UnsupportedOperationException("Not supported yet.");

        Weather weather = fakeData.get(cityName);
        
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