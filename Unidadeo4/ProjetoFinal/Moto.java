public class Moto extends Veiculo {
    private int cilindradas;
    private boolean temPartidaEletrica;
    private String categoria;

    public Moto(String marca, String modelo, int ano, String cor, double preco, int velocidade, double altura, double capacidadeCarga, int cilindradas, boolean temPartidaEletrica, String categoria) {
        super(marca, modelo, ano, cor, preco, velocidade, altura, capacidadeCarga);
        this.cilindradas = cilindradas;
        this.temPartidaEletrica = temPartidaEletrica;
        this.categoria = categoria;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas:          " + cilindradas + " cc");
        System.out.println("Tem Partida Elétrica: " + (temPartidaEletrica ? "Sim" : "Não"));
        System.out.println("Categoria:            " + categoria);
    }

    public void empinar() {
        System.out.println("A moto " + getModelo() + " está empinando!");
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCilindradas(int cilindradas) {
        if (cilindradas < 0) {
            throw new IllegalArgumentException("As cilindradas de uma moto devem ser maiores que zero.");
        }
        this.cilindradas = cilindradas;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
