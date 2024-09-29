package exception;

public class ProductPrizeIsInvalidException extends ValidationException{
    public ProductPrizeIsInvalidException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}
