public class ValidadorSenha {
    public static void validarSenha(String senha) throws SenhaInvalidaException{
        if (senha.length() < 8 || senha.length() > 20) {
            throw new SenhaInvalidaException("A senha deve ter entre 8 e 20 caracteres.");
            
        } else if (!senha.matches(".*[A-Z].*")) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos uma letra maiúscula.");

        } else if (!senha.matches(".*[a-z].*")) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos uma letra minúscula.");
            
        } else if (!senha.matches(".*\\d.*")) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos um número.");
            
        } else if (!senha.matches(".*[!@#$%^&*()].*")) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos um caractere especial (!@#$%^&*()).");
            
        } else {
            System.out.println("Senha válida.");
        }
    }
}
