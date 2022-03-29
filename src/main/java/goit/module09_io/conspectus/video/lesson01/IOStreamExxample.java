package goit.module09_io.conspectus.video.lesson01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
//import static java.lang.System.in;
import goit.module09_io.conspectus.materials.theme04.serializableExample.Person;

public class IOStreamExxample {
    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            Person p = new Person("Sam", 33, 178, true);
            oos.writeObject(p);
//            System.out.println("Person Output Stream");
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        
//        OutputStream os = new PrintStream();
//         try (FileInputStream bis = new BufferedInputStream(in)) {
//                    
//        }

//         try (ByteArrayInputStream bis = new BufferedInputStream(in)) {
//                    
//        }

//        try (FilterInputStream bis = new BufferedInputStream(in)) {
//                    
//        }

//        try (ObjectInputStream bis = new BufferedInputStream(in)) {
//                    
//        }

//        try (BufferedInputStream bis = new BufferedInputStream(in)) {
//            
//        }

//        try (DataInputStream bis = new BufferedInputStream(in)) {
//                    
//                }

//        try (ObjectOutputStream bis = new BufferedInputStream(in)) {
//                    
//        }
        
//        try (FileOutputStream bis = new BufferedInputStream(in)) {
//                    
//        }

//        try (ByteArrayOutputStream bis = new BufferedInputStream(in)) {
//                    
//        }

//        try (FilterOutputStream bis = new BufferedInputStream(in)) {
//                    
//        }
        
//        try (BufferedOutputStream bis = new BufferedInputStream(in)) {
//                    
//        }
        
//        try (DataOutputStream bis = new BufferedInputStream(in)) {
//                    
//        }
    }
}
