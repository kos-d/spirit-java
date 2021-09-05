package module09_io.conspectus.video.lesson04;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        
        
        
        try (ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArray)) 
        {
            outputStreamWriter.write("Some test text");
            outputStreamWriter.flush();
            
            System.out.println(byteArray.toString());
            System.out.println(Arrays.toString(byteArray.toByteArray()));
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}