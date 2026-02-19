public class SenhaInvalidaException extends Exception {
    public SenhaInvalidaException() {
        super("Senha inválida.");
    }

    public SenhaInvalidaException(String message) {
        super(message);
    }

    public SenhaInvalidaException(String message, Throwable cause) {
        super(message, cause);
    }  
}
