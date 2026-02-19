public class CriadorSenha {
    public static void main(String[] args) {
        String senha = "Senha@123"; // Exemplo de senha
        String senhaInvalida = "senha"; // Exemplo de senha inválida

        try {
            ValidadorSenha.validarSenha(senha);
            ValidadorSenha.validarSenha(senhaInvalida);
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
