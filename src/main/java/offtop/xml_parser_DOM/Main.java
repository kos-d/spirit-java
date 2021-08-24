package offtop.xml_parser_DOM;

import offtop.xml_parser_DOM.model.Root;

public class Main {
    
    public static void main(String[] args)  { 

//        DomParser parser = new DomParser();
        SaxMyParser parser = new SaxMyParser();
        Root root = parser.parse();
        
        System.out.println("Root " + root.toString());
//        System.out.println(root.toString());
    }
}