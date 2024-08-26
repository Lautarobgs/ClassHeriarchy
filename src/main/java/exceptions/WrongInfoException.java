package exceptions;

public class WrongInfoException extends RuntimeException{
    public WrongInfoException(String message) {
        super(message);
    }
}
