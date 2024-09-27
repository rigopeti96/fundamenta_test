package exception;

public class ProductTypeIsEmptyException extends RuntimeException {
    public ProductTypeIsEmptyException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}