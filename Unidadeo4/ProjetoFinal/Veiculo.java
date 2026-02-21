public class Veiculo implements InterfaceVeiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double preco;
    private int velocidade = 0;
    private double altura;
    private double capacidadeCarga;

    public Veiculo(String marca, String modelo, int ano, String cor, double preco, int velocidade, double altura, double capacidadeCarga) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.altura = altura;
        this.capacidadeCarga = capacidadeCarga;
        this.velocidade = velocidade;
    }

    @Override
    public void ligar() {
        System.out.println("O veículo " + marca + " " + modelo + " está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O veículo " + marca + " " + modelo + " está desligado.");
    }

    //limitar a velocidade máxima
    @Override
    public void acelerar(int velocidade) {
        this.velocidade += velocidade;
        System.out.println("O veículo " + marca + " " + modelo + " acelerou para " + this.velocidade + " km/h.");
    }

    @Override
    public void frear(int velocidade) {
        this.velocidade -= velocidade;
        if (this.velocidade < 0) {
            this.velocidade = 0;
            System.out.println("O veículo " + marca + " " + modelo + " parou.");
        } else {
            System.out.println("O veículo " + marca + " " + modelo + " reduziu para " + this.velocidade + " km/h.");
        }
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Marca:    " + marca);
        System.out.println("Modelo:   " + modelo);
        System.out.println("Ano:      " + ano);
        System.out.println("Cor:      " + cor);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Altura:   " + altura + " cm");
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " kg");
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

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano < 0) {
            throw new IllegalArgumentException("O ano de fabricação de um veículo deve ser maior que zero.");
        }
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço de um veículo deve ser maior que zero.");
        }
        this.preco = preco;
    }

    public double getAltura() {
        return altura;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("A altura de um veículo deve ser maior que zero.");
        }
        this.altura = altura;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga < 0) {
            throw new IllegalArgumentException("A capacidade de carga de um veículo deve ser maior que zero.");
        }
        this.capacidadeCarga = capacidadeCarga;
    }
}
