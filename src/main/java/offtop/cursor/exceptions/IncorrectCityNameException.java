package offtop.cursor.exceptions;

public class IncorrectCityNameException extends RuntimeException {   // unchecked exception
    
    public IncorrectCityNameException(String msg) {
        super(msg);
    }
}