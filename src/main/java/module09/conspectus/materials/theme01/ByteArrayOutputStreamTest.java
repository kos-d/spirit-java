package module09.conspectus.materials.theme01;

import java.io.ByteArrayOutputStream;

import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOutputStreamTest {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
        
        for (int i = 1; i < 10; i++) {
            baos.write(i);
        }
        
        baos.flush();
        
        System.out.println(Arrays.toString(baos.toByteArray()));
        
        baos.close();
    }
}