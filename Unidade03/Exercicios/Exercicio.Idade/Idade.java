public class Idade {
    public static void verificarIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("A idade não pode ser negativa.");
        } else if(idade > 150) {
            throw new IllegalArgumentException("A idade não pode ser maior que 150 anos.");
        } else {
            System.out.println("Idade válida: " + idade);
        }
    }
}
