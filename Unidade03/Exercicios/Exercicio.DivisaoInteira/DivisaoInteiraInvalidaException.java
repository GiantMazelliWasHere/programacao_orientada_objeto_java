public class DivisaoInteiraInvalidaException extends Exception {
    public DivisaoInteiraInvalidaException() {
        super("Divisão inválida.");
    }

    public DivisaoInteiraInvalidaException(String message) {
        super(message);
    }

    public DivisaoInteiraInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
