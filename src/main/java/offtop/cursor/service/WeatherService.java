package offtop.cursor.service;

import offtop.cursor.exceptions.IncorrectCityNameException;
import offtop.cursor.model.Weather;
import static offtop.cursor.service.ApiConstants.CITY_REGEX;

public interface WeatherService {
    
    Weather getByCityName(String city);
    
    default void validateCityName(String city) {
        
        if (!city.matches(CITY_REGEX)) {
            throw new IncorrectCityNameException(String.format("Incorrect city name %s", city));
        }
    }
}
