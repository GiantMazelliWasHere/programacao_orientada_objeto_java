public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        super(0, 0); // Chama o construtor da classe pai com altura e largura 0
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}