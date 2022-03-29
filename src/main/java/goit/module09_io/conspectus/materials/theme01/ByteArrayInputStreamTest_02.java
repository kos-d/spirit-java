package goit.module09_io.conspectus.materials.theme01;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamTest_02 {
    
    public static void main(String[] args) throws IOException {
        
        byte[] bytes = {1, 3, 5, 7, 9};
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        
        byte[] buffer = new byte[1024];
        int readByteCount = bais.read(buffer, 0, buffer.length);
        
        for (int i = 0; i < readByteCount; i++) {
            System.out.println(buffer[i]);
        }
        bais.close();
    }
}