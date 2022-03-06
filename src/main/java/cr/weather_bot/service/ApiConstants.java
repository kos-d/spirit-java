package cr.weather_bot.service;

public final class ApiConstants {
    
    public static final String CITY_REGEX = "^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$";
    
    public static final int OK_STATUS_CODE = 200;
    public static final int NOT_FOUND_STATUS_CODE = 404;
    
    private ApiConstants() {
        
    }
}