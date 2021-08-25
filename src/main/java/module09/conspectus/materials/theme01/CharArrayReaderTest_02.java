package module09.conspectus.materials.theme01;

import java.io.IOException;
import java.io.CharArrayReader;


public class CharArrayReaderTest_02 {
    public static void main(String[] args) throws IOException {
        char[] chars = {'J', 'a', 'v', 'a'};
        
        CharArrayReader reader = new CharArrayReader(chars);
        char[] buffer = new char[1024];
        
        int charCount = reader.read(buffer, 0, buffer.length);
        
        for (int i = 0; i < charCount; i++) {
            System.out.println(buffer[i]);
        }
        reader.close();
    }
}