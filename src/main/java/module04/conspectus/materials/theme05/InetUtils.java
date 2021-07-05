package module04.conspectus.materials.theme05;

public class InetUtils {
    
    public static String validateUrl(String url) {
        if (!url.startsWith("http")) {
            url = "https://" + url;
        }
        return url;
    }
    
    public static void main(String[] args) {
        System.out.println(InetUtils.validateUrl("domain.global"));
    }    
}