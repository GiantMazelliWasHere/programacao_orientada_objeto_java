public class Exemplo06 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 0;

        double num4 = 10.5;
        double num5 = 5.2;
        double num6 = 0.0;

        Calculadora calculadora = new Calculadora();

        System.out.println("Soma (int): " + calculadora.soma(num1, num2));
        System.out.println("Subtração (int): " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação (int): " + calculadora.multiplicar(num1, num2));
        System.out.println("Divisão (int): " + calculadora.dividir(num1, num2));
        System.out.println("Divisão por zero (int): " + calculadora.dividir(num1, num3));
        System.out.println();
        System.out.println("Soma (double): " + calculadora.somar(num4, num5));
        System.out.println("Subtração (double): " + calculadora.subtrair(num4, num5));
        System.out.println("Multiplicação (double): " + calculadora.multiplicar(num4, num5));
        System.out.println("Divisão (double): " + calculadora.dividir(num4, num5));
        System.out.println("Divisão por zero (double): " + calculadora.dividir(num4, num6));
        System.out.println();

    }
    
}
