package exception;

public class ProductPrizeIsEmptyException extends RuntimeException{
    public ProductPrizeIsEmptyException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}
