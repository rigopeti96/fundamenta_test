package exception;

public class ValidationException extends RuntimeException {
    public ValidationException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}
