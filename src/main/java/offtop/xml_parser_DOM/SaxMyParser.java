package offtop.xml_parser_DOM;

import offtop.xml_parser_DOM.model.People;
import offtop.xml_parser_DOM.model.Root;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class SaxMyParser {

    public Root parse() {
        
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (Exception ex) {
            System.out.println("Open sax parser error " + ex.toString());
            return null;
        }
        
        File file = new File("test.xml");
        try {
            parser.parse(file, handler);
        } catch (SAXException e) {
            System.out.println("Sax parsing error " + e.toString());
            return null;
        } catch (IOException e) {
            System.out.println("IO parsing error " + e.toString());
            return null;
        }
        
        return handler.getRoot();
    }
}