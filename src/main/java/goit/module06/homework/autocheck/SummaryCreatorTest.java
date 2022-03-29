package goit.module06.homework.autocheck;

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();
        
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));
        
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
        
    }
}
class SummaryCreator {
    
    public String create(String text) {
        if (text.length() > 15) {
            String cutString = text.substring(0, 15);
            if (text.charAt(15) == ' ') {
                return cutString;
            }
            return cutString.concat("...");
        }
        return text;
    }
}