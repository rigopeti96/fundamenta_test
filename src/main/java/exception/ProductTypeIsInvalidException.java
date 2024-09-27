package exception;

public class ProductTypeIsInvalidException extends RuntimeException{
    public ProductTypeIsInvalidException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}
