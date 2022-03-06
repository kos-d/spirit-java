package cr.weather_bot.exeptions;

public class IncorrectCityNameException extends RuntimeException {
    
    public IncorrectCityNameException(String msg) {
        super(msg);
    }
}