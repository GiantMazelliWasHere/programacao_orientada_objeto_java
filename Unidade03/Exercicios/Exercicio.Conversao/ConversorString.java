import java.util.Scanner;

public class ConversorString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        String input = scanner.nextLine();

        try {
            int numero = Integer.parseInt(input);
            System.out.println("O número digitado é: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: O valor digitado não é um número inteiro válido.");
        } finally {
            scanner.close();
        }
    }    
}
