package exceptions;

public class numberLessThanOneException extends Exception {
    public numberLessThanOneException() {
        super("The number is less than one");
    }
}
