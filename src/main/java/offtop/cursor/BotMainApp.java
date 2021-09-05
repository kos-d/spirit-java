package offtop.cursor;

import offtop.cursor.exceptions.IncorrectCityNameException;
import offtop.cursor.model.Weather;
import offtop.cursor.service.WeatherService;
import offtop.cursor.service.impl.FakeWeatherServiceImpl;

public class BotMainApp {
    public static void main(String[] artgs) {
        WeatherService weatherService = new FakeWeatherServiceImpl();
//        Weather info = weatherService.getByCityName("kharkiv");

        Weather info;
        info = weatherService.getByCityName("Kharkiv");

        try {
            System.out.println(info);
        } catch (IncorrectCityNameException ex) {
            System.out.println(ex.getMessage());
        }
    }
}