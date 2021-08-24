package offtop.xml_parser_DOM.tmp;

import offtop.xml_parser_DOM.model.Root;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.xml.sax.SAXException;


public class MainTest1 {
    public static void main(String[] args)  { // throws ParserConfigurationException, SAXException, IOException
//        Root root = null;
        Root root = new Root();
        //        File file;
        //        file = new File("test.xml");
        
        File file = new File("test.xml");
        DocumentBuilderFactory bdf = DocumentBuilderFactory.newInstance();
        Document doc = null;
        
        try {
            doc = bdf.newDocumentBuilder().parse(file);
        } catch (Exception ex) {
            System.out.println("Open parsing error " + ex.toString());
            return;
        }
        
        // Node - каждый элемент в xml
        // NodeList - лист элементов
        // Element - тэг
        
        Node rootNode = doc.getFirstChild();
        System.out.println("Test1 " + rootNode.getNodeName());

        NodeList rootChilds = rootNode.getChildNodes();
        
        
        String mainName = null;
        Node peopleNode = null;
        for (int i = 0; i < rootChilds.getLength(); i ++) {
            
//            if (rootChilds.item(i).getNodeType() == Node.ELEMENT_NODE) {
//                
//            }
            
            if (rootChilds.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }
            System.out.println("Test2 " + rootChilds.item(i).getNodeName());
            
            switch (rootChilds.item(i).getNodeName()) {
                case "name": {
                    mainName = rootChilds.item(i).getTextContent();
                    System.out.println("mainName " + mainName);
                }
                case "people": {
                    peopleNode = rootChilds.item(i);
                }
            }
        }
        
//        NodeList nodeList = doc.getElementsByTagName("name");
//        System.out.println("qqq " + nodeList);
        
//        NodeList childNodes = rootNode.getChildNodes();


//        System.out.println(root.toString());
    }
}