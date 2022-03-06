package cr.weather_bot;

import cr.weather_bot.exeptions.IncorrectCityNameException;
import cr.weather_bot.model.Weather;
import cr.weather_bot.service.WeatherService;
import cr.weather_bot.service.impl.FakeWeatherServiceImpl;

public class BotMainApp {

    public static void main(String[] args) {
        WeatherService weatherService = new FakeWeatherServiceImpl();

        Weather info;
        info = weatherService.getByCityName("Lviv");

        try {
            System.out.println(info);

        } catch (IncorrectCityNameException e) {
            System.out.println(e.getMessage());
        }
    }
}
