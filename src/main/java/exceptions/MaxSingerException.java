package exceptions;

public class MaxSingerException extends Exception{
    public MaxSingerException() {
        super();
    }

    public MaxSingerException(String message) {
        super(message);
    }

    public MaxSingerException(String message, Throwable cause) {
        super(message, cause);
    }

    public MaxSingerException(Throwable cause) {
        super(cause);
    }
}
