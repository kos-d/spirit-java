package offtop.cursor.model;

public class Weather {
    private String city;
    private String country;
    private int temperature;
    
    public Weather(String city, String country, int temperature) {
        this.city = city;
        this.country = country;
        this.temperature = temperature;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city=" + city + '\'' +
                ", country=" + country + '\'' +
                ", temperature=" + temperature +
                '}';
    }
    
    
}