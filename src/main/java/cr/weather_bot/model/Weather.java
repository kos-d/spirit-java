package cr.weather_bot.model;

public class Weather {
    
    private String city;
    private String country;
    private int temperature;

    public Weather(String city, String country, int temperature) {
        this.city = city;
        this.country = country;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public int getTemperature() {
        return temperature;
    }
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Weather{" + "city=" + city + ", country=" + country + ", temperature=" + temperature + '}';
    }
    

}