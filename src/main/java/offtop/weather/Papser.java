package offtop.weather;

import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Papser {
    
    private static Document getPage() throws IOException {
        String url = "https://meteo.ua/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }
    // \d{2}\d{2}\d{6}
    private static Pattern pattern = Pattern.compile("\\d{2}");
    private static String getDateFromString(String stringDate) throws Exception {
        // Вс 22 Август мин. +16° макс. +23°
        // Вс 22 Август
        
        Matcher matcher = pattern.matcher(stringDate);
        if (matcher.find()) {
            return matcher.group();
        }
        throw new Exception("Can't extract date from string");
    }
    
    private static void printForValues(Elements values, int index) {
        for (int i = 0; i < 4; i++) {
            Element valueLine = values.get(index);
            for (Element td : valueLine.select("td")) {
                System.out.print(td + "    ");
            }
        }
    }
    
    public static void main(String[] args) throws IOException, Exception {
        Document page = getPage();
        Element divWeather = page.select("div[class=week_weather]").first();
//        Element divWeather = page.select("div[dl=ww_block_no_js]").first();
        
//        System.out.println(divWeather);
//        Elements names = divWeather.select("div[class=wwt_num]");
        Elements names = divWeather.select("a[class=wwt_cont]");

        Elements values = divWeather.select("div[class=wnow_cnt]");
        int index = 0;
        
        
        for (Element name : names) {
//            String date = name.select("div[class=wwt_num]").text();
            String dateString = name.select("a[class=wwt_cont]").text();
            String date = getDateFromString(dateString);
            System.out.println(date + "    Явления     Температура     Давление    Влажность   Ветер");
            printForValues(values, index);
        }
    }
}