package exception;

public class IncrementIsInvalidException extends RuntimeException{
    public IncrementIsInvalidException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}
