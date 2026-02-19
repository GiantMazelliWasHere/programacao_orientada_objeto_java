public class FormaGeometrica {
    private double altura;
    private double largura;

    public FormaGeometrica(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public void exibirInformacoes() {
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida. A altura deve ser um valor positivo.");
        }
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        } else {
            System.out.println("Largura inválida. A largura deve ser um valor positivo.");
        }
    }
}
