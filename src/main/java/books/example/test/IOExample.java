package books.example.test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class IOExample {

    public static void main(String[] args) {
        String path = "data2/byte.data";
        File file = new File(path);

        byte[] bArray = {-128, 4, 2, 1, 3, 5, 127};

        writeArrayByteDemo(file);
    }

    public static void writeArrayByteDemo(File file_name) {
        FileInputStream fis = null;
        ByteArrayOutputStream baos = null;
        byte[] buffer = new byte[16];

        int b;
        try {
            fis = new FileInputStream(file_name);
            baos = new ByteArrayOutputStream();

            if (file_name.canRead()) {
                while ((b = fis.read()) != -1) {
                    baos.write(buffer);
                }
            }
            String toString = Arrays.toString(buffer);
            System.out.println(toString);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                    System.out.println("fis close");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (baos != null) {
                try {
                    baos.close();
                    System.out.println("baos close");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
