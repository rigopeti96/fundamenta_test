package exception;

public class BusinessAssociateIsEmptyException extends ValidationException{
    public BusinessAssociateIsEmptyException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}
