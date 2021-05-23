package module06.homework.autocheck;

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};
        
        System.out.println(new NameParser().parse(names));
    }
}

class NameParser {    
    public String parse(String[] names) {
        //String result = "";
        StringBuilder result = new StringBuilder();
    
        for (int i = 0; i < names.length; i++) {
            String firstName = names[i].split(" ")[0];
            
            //result += firstName;
            result.append(firstName);
            
            if (i != names.length - 1) {
                //result += ", ";
                result.append(", ");
            }
        }
        return result.toString();
    }
}
/*
class NameParser {    
    public String parse(String[] names) {
        String result = "";
    
        for (int i = 0; i < names.length; i++) {
            String firstName = names[i].split(" ")[0];
            
            result += firstName;
            if (i != names.length - 1) {
                result += ", ";
            }
        }
        return result;
    }
}
*/