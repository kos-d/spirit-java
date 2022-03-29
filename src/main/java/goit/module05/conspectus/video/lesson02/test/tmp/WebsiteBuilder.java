package goit.module05.conspectus.video.lesson02.test.tmp;

import goit.module05.conspectus.video.lesson02.test.tmp.Website;

public class WebsiteBuilder {
    public static void main(String[] args) {
        Website website = new Website();
        
        website.setName("Visit card");
        website.setCms("Wordpress");
        website.setPrice(500);
        
        System.out.println(website);
    }
}