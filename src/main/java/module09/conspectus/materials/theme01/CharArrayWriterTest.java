package module09.conspectus.materials.theme01;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.util.Arrays;

public class CharArrayWriterTest {
    public static void main(String[] args) throws IOException {
        CharArrayWriter writer = new CharArrayWriter();
        
        writer.append("Java");
        
        char[] result = writer.toCharArray();
        
        System.out.println(Arrays.toString(result));
    }
}