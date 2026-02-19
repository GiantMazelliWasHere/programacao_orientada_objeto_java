public class ExemploFormas {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(4, 6);
        Triangulo triangulo = new Triangulo(4, 6);

        System.out.println("Círculo:");
        circulo.exibirInformacoes();
        System.out.println();
        System.out.println("Retângulo:");
        retangulo.exibirInformacoes();
        System.out.println();
        System.out.println("Triângulo:");
        triangulo.exibirInformacoes();
    }
}
