public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O carro " + marca + " " + modelo + " está ligando.");
    }

    public void desligar() {
        System.out.println("O carro " + marca + " " + modelo + " está desligando.");
    }

    public void acelerar() {
        System.out.println("O carro " + marca + " " + modelo + " está acelerando.");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public static void main(String[] args) {
        CarroAula meuCarro = new CarroAula("Toyota", "Corolla", 2020);
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
        meuCarro.ligar();
        meuCarro.acelerar();
        meuCarro.desligar();
    }
}
