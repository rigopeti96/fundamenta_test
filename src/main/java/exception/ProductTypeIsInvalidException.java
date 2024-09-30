package exception;

public class ProductTypeIsInvalidException extends ValidationException{
    public ProductTypeIsInvalidException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}
