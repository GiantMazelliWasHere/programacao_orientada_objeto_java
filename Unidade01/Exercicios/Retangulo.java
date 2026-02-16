public class Retangulo {
    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double calcularArea() {
        return largura * comprimento;
    }

    public double calcularPerimetro() {
        return 2 * (largura + comprimento);
    }
    
    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(4.0, 6.0);
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Comprimento: " + retangulo.getComprimento());
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}
