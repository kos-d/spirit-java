package module05.conspectus.video.lesson02.test;

public abstract class WebsiteBuilder {
    Website website;
    
    void createWebsite() {
        website = new Website();
    }
    
    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();
    
    Website getWebsite() {
        return website;
    }
}