public class DivisaoInteira {
    public void divisaoExata(int a, int b) throws DivisaoInteiraInvalidaException {
        if (a % b != 0) {
            throw new DivisaoInteiraInvalidaException("A divisão de " + a + " por " + b + " não é exata.");
        } else {
            int resultado = a / b;
            System.out.println("O resultado da divisão de " + a + " por " + b + " é: " + resultado);
        }
    }
}
