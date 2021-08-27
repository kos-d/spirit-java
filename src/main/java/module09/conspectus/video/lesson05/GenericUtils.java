package module09.conspectus.video.lesson05;

public class GenericUtils {

//    public static <T> boolean isEquals(GenericType<T> o1, GenericType<T> o2) {
    public static <T> boolean isEquals(GenericType<? super Number> o1, GenericType<? super Number> o2) {
        return o1.get().equals(o2.get());
    }
}