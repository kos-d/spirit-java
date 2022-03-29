package goit.module05.conspectus.video.lesson02.test;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }
    
    Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();
        
        Website website = builder.getWebsite();
        
        return website;
    }
}