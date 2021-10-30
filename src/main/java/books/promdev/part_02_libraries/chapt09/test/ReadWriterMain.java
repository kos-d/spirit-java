package books.promdev.part_02_libraries.chapt09.test;

public class ReadWriterMain {
    public static void main(String[] args) {
        ReadHelper rh = new ReadHelper();
        rh.readerHelper(); 
        
        WriterHelper wh = new WriterHelper();
        wh.writeHelper();
    }
}
