package books.promdev.part_02_libraries.chapt08;

public class SalaryException extends Exception {
    private Exception _hidden;

    public SalaryException(String er) {
        super(er);
    }
    public SalaryException(String er, Exception e) {
        super(er);
        _hidden = e;
    }
    public Exception getHiddenException() {
        return _hidden;
    }
}
