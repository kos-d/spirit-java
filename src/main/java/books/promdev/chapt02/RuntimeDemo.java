package books.promdev.chapt02;

public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total memory: " + rt.totalMemory());
        System.out.println("Free memory: " + rt.freeMemory());
        double d[] = new double[10000];
        System.out.println("Free memory after declaration array: " + rt.freeMemory());
        /* process initialization */
        ProcessBuilder pb = new ProcessBuilder("gimp", "/home/t-800/pictures/java/1024.jpeg");
        try {
            pb.start();
        } catch (java.io.IOException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Free memory after start mc: " + rt.freeMemory());
        System.out.println("Command List: " + pb.command());
    }
}