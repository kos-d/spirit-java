package offtop.weather._tmp;

import java.io.IOException;
import java.net.URL;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Parser {
    
    private static Document getPage() throws IOException {
        String url = "https://www.gismeteo.ua/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }
    
    public static void main(String[] args) throws IOException {
        Document page = getPage();
        // css query language
        Element divWeather = page.select("div[class=map lazyload]").first();
//        System.out.println(divWeather);
//        Elements names = divWeather.select("div[class=wn_header]");
//        Elements names = divWeather.select("span[data-dateformat]");
//        Elements names = divWeather.select("span[data-dateformat=D, j F, G:i]");
//        Elements names = divWeather.select("div[class=_line timeline clearfix]");
        Elements names = divWeather.select("div[class=time_of_day]");
//        Elements values = divWeather.select();

//        Elements names = divWeather.select("div[id=time]");
//        System.out.println(names);
        
        for (Element name : names) {
//            String date = name.select("div[class=time_of_day]").text();
            String date = name.select("div[id=time]").text();
            System.out.println(date + "    Явления     Температура     Давление    Влажность   Ветер");
        }
        
        
    }
}