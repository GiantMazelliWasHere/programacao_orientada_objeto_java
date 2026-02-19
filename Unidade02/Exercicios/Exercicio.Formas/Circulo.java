public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        super(0, 0); // Chama o construtor da classe pai com altura e largura 0
        this.raio = raio;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            System.out.println("Raio inválido. O raio deve ser um valor positivo.");
        }
    }
}