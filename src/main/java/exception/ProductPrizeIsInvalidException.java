package exception;

public class ProductPrizeIsInvalidException extends RuntimeException{
    public ProductPrizeIsInvalidException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}
