package books.headFirstJava.chap02;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как погореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Потерянные в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        Movie three = new Movie();
        three.title = "Байт-Клуб";
        three.genre = "Трагедия";
        three.rating = 127;
    }
}
