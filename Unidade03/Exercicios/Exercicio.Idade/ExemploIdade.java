public class ExemploIdade {
    public static void main(String[] args) {
        try {
            Idade.verificarIdade(25);
            Idade.verificarIdade(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            Idade.verificarIdade(200);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
