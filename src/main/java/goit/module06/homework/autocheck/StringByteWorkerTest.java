package goit.module06.homework.autocheck;

class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};
        
        System.out.println(new StringByteWorker().process(startBytes));
    }
}
class StringByteWorker {
    public String process(byte[] bytes) {
        String stringBytes = new String(bytes);
        return stringBytes.toLowerCase();
    }
}
