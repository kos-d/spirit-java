package goit.module12.conspectus.materials.theme01;

public class PriorytyThreadTest {
    public static void main(String[] args) throws InterruptedException {
        
//        setPriority(); // Задать приоритет
        
        System.out.println(Thread.currentThread().getPriority());
        
//        Thread.yield() // Передача управления другому потоку

        Thread thread = new ThreadSubClass();
        thread.start();
        thread.join();
        
        /*
        
        Поток-демон - это служебный поток. 
        Задача этого потока - обслуживание других потоков. 
        Сделать поток демоном можно вызвав метод setDaemon(true). 
        Проверить, не является ли поток демоном, можно методом isDaemon().
        
        */
        
    }    
}