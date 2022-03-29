package goit.module06.homework.autocheck;

class GooQueryTest {
    public static void main(String[] args) {
        GooQuery query = new GooQuery("en", "capital");
        
        System.out.println(query.getLanguage());
        
        System.out.println(query.getText());
        
        System.out.println(query);
    }
}

class GooQuery {
    private String language;
    private String text;
    
    public GooQuery(String language, String text) {
        this.language = language;
        this.text = text;
    }
    
    public String getLanguage() {
        return language;
    }
    public String getText() {
        return text;
    }
    @Override
    public String toString() {
        return "Searching [" + getText() + "], using language: " + getLanguage(); 
    }
}