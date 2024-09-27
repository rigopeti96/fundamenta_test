package exception;

public class IncrementIsEmptyException extends RuntimeException{
    public IncrementIsEmptyException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}
