package module09.conspectus.materials.theme01;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderTest_01 {
    public static void main(String[] args) throws IOException {
        char[] chars = {'J', 'a', 'v', 'a'};
        
        CharArrayReader reader = new CharArrayReader(chars);
        
        int nextChar = -1;
        
        while ((nextChar = reader.read()) != -1) {
            char c = (char) nextChar;
            System.out.println(c);
        }
        reader.close();
    }
}