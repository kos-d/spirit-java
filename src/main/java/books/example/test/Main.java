//package books.example.test;
//
//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
//import java.util.Arrays;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        String path = "data2/byte.data";
//        File file = new File(path);
//        
//        
//        
//        
////        ByteArrayOutputStream baos = new ByteArrayOutputStream();
////        String text = "Hello World";
////        byte[] buffer = text.getBytes();
//        
//        byte[] bArray = {-128, 4, 2, 1, 3, 5, 127};
//
////        readFileDemo();
////        readByteArrayDemo(bArray);
//        writeArrayByteDemo(bArray);
//
////        String path = "data/byte.data";
////        File file = new File(path);
////        String[] arr = new String[10];
////        OutputStream os = null;
////            try {
////                os = new ByteArrayOutputStream(new BufferedOutputStream(file));
////            } catch (IOException e) {
////                e.printStackTrace();
////            } finnaly {
////                os.close();
////        }            
//    }
//
//    public static void writeToArrayDemo() {
//        String path = "data/byte.data";
////        String[] sArray = new String[10];
//        ByteArrayOutputStream baos = null;
//
////        try {
////            baos = new OutputStream(new ByteArrayOutputStream(path));
////        }
//    }
//
//    public static void readFileDemo() {
//        String path = "data/byte.data";
//        File f = new File(path);
//
//        int b = 0, count = 0;
//        FileInputStream is = null;
//        try {
//            is = new FileInputStream(f);
//            while ((b = is.read()) != -1) {
//                System.out.print((char) b);
//                count++;
//            }
//            is.close();
//            System.out.print("InputStream close");
//        } catch (IOException e) {
//            System.err.println("error file: " + e);
//        }
//    }
//
//    public static void readByteArrayDemo(byte[] name) {
//        ByteArrayInputStream bais = null;
//        int b, count = 0;
//
//        try {
//            bais = new ByteArrayInputStream(name);
//            while ((b = bais.read()) != -1) {
//                System.out.printf("%d \n", b);
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
//        }
//        try {
//            bais.close();
//            System.out.println("bais close");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public static void writeArrayByteDemo(File file_name) {
//        
//    }
//
////    public static void writeArrayByteDemo(byte[] name) throws IOException {
////        ByteArrayInputStream bais = null;
////        ByteArrayOutputStream baos = null;
////        byte[] buffer = new byte[name.length];
////
////        int b;
////        try {
////            bais = new ByteArrayInputStream(name);
////            baos = new ByteArrayOutputStream(32);
////            while ((b = bais.read()) != -1) {
////                baos.write(buffer);
////            }                    
////            
////            System.out.println("buffer" + Arrays.toString(buffer));
////        } catch (ArrayIndexOutOfBoundsException e) {
////            e.printStackTrace();
////        }
////        try {
////            baos.close();
////            System.out.println("baos close");
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        if (bais != null) {
////            try {
////                bais.close();
////                System.out.println("bais close");
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
////        }
////    }
//}
