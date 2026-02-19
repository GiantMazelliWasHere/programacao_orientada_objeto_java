public class TransferenciaInvalidaException extends Exception {
    public TransferenciaInvalidaException() {
        super("Transferência inválida.");
    }

    public TransferenciaInvalidaException(String message) {
        super(message);
    }

    public TransferenciaInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
