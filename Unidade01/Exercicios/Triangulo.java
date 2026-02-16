public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5.0, 3.0);
        double area = triangulo.calcularArea();
        System.out.println("A área do triângulo é: " + area);
    }
}
