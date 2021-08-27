//package module09.conspectus.video.lesson01;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.CharArrayReader;
//import java.io.CharArrayWriter;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.FilterReader;
//import java.io.FilterWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.LineNumberReader;
//import java.io.OutputStreamWriter;
//import java.io.PipedReader;
//import java.io.PipedWriter;
//import java.io.PrintWriter;
//import java.io.PushbackReader;
//import java.io.Reader;
//import java.io.StringReader;
//import java.io.StringWriter;
//import java.io.Writer;
//
//public class IOReaderWriter {
//    public static void main(String[] args) throws FileNotFoundException, IOException {
//                
//        Reader bufferedReader = new BufferedReader("test.txt");
//        Reader lineNumberReader = new LineNumberReader("test.txt");
//        
//        Reader charArrayReader = new CharArrayReader("test.txt");
//        
//        Reader inputStreamReader = new InputStreamReader("test.txt");
//        Reader fileReader = new FileReader("test.txt");
//        
//        Reader filterReader = new FilterReader("test.txt");
//        Reader pushbackReader = new PushbackReader("test.txt");
//        
////        Reader pipedReader = new PipedReader("test.txt");
//        Reader pipedReader = new PipedReader();
//        
//        Reader StringReader = new StringReader("test.txt");
//        
//        //------------------------------------------------------------
//        
//        Writer bufferedWriter = new BufferedWriter("test.txt");
//        
//        Writer charArrayWriter = new CharArrayWriter("test.txt");
//        
//        Writer outputStreamWriter = new OutputStreamWriter("test.txt");
//        Writer fileWriter = new FileWriter("test.txt");
//        
//        Writer filterWriter = new FilterWriter("test.txt");
//        
//        Writer pipedWriter = new PipedWriter("test.txt");
//        
//        Writer StringWriter = new StringWriter("test.txt");
//        
//        Writer printWriter = new PrintWriter("test.txt");
//    }
//}