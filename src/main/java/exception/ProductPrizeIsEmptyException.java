package exception;

public class ProductPrizeIsEmptyException extends ValidationException{
    public ProductPrizeIsEmptyException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}
