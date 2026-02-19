import java.util.Scanner;

public class ExercicioDivisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = scanner.nextInt();

        int numero2 = 0; // Divisor é zero para simular a divisão por zero

        try {
            int resultado = numero1 / numero2 ;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } finally {
            scanner.close();
        }
    }
}
