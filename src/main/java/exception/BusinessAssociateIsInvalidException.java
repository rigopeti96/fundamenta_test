package exception;

public class BusinessAssociateIsInvalidException extends RuntimeException{
    public BusinessAssociateIsInvalidException(String errorMessage, RuntimeException exception) {
        super(errorMessage, exception);
    }
}
