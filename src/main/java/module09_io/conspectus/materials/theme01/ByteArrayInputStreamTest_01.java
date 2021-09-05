package module09_io.conspectus.materials.theme01;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamTest_01 {
    public static void main(String[] args) throws IOException {
        
        byte[] bytes = {1, 3, 5, 7, 9};
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        
        while (bais.available() > 0) {
            byte currentByte = (byte) bais.read();
            System.out.println(currentByte);
        }
        bais.close();
    }
}