package cr.weather_bot.service;

import cr.weather_bot.model.Weather;
import static cr.weather_bot.service.ApiConstants.CITY_REGEX;
import cr.weather_bot.exeptions.IncorrectCityNameException;

public interface WeatherService {
    
    Weather getByCityName(String city);
    
    default void validateCityName(String city) {
        
        if (!city.matches(CITY_REGEX)) {
            throw new IncorrectCityNameException(String.format("Incorrect city name %s", city));
        }
    }
}
