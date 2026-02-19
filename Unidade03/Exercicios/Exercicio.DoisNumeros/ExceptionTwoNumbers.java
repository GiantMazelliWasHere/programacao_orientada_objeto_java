public class ExceptionTwoNumbers {
    public static void validarNum(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("O segundo número não pode ser zero.");
        } 
        System.out.println("Os numeros são válidos: " + num1 + " e " + num2);
    }

    public static void main(String[] args) {
        try {
            validarNum(10, 5);
            validarNum(10, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
