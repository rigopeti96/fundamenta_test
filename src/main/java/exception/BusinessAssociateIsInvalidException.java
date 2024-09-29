package exception;

public class BusinessAssociateIsInvalidException extends ValidationException{
    public BusinessAssociateIsInvalidException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}
