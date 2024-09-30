package exception;

public class ProductTypeIsEmptyException extends ValidationException {
    public ProductTypeIsEmptyException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}