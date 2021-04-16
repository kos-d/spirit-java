package module06.homework.autocheck;

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());
        //apple.in.mars
        System.out.println(new GooSearchResult("https://apple.in.mars").parseDomain());
    }
}
class GooSearchResult {
    
    private String url;
    
    public GooSearchResult(String url) {
        this.url = url;
    }
    
    public String getUrl() {
        return url;
    }
    
    public String parseDomain() {
        String[] urlArray = getUrl().split("/");
        return urlArray[2];
    }
}