public class Van extends Veiculo {
    private boolean temEspacoPara7Pessoas;
    private boolean temPortaLateralDeslizante;

    public Van(String marca, String modelo, int ano, String cor, double preco, int velocidade, double altura, double capacidadeCarga, boolean temEspacoPara7Pessoas, boolean temPortaLateralDeslizante) {
        super(marca, modelo, ano, cor, preco, velocidade, altura, capacidadeCarga);
        this.temEspacoPara7Pessoas = temEspacoPara7Pessoas;
        this.temPortaLateralDeslizante = temPortaLateralDeslizante;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tem Espaço para 7 Pessoas: " + (temEspacoPara7Pessoas ? "Sim" : "Não"));
        System.out.println("Tem Porta Lateral Deslizante: " + (temPortaLateralDeslizante ? "Sim" : "Não"));
    }
    
    public boolean isTemEspacoPara7Pessoas() {
        return temEspacoPara7Pessoas;
    }

    public boolean isTemPortaLateralDeslizante() {
        return temPortaLateralDeslizante;
    }

    public void setTemEspacoPara7Pessoas(boolean temEspacoPara7Pessoas) {
        this.temEspacoPara7Pessoas = temEspacoPara7Pessoas;
    }

    public void setTemPortaLateralDeslizante(boolean temPortaLateralDeslizante) {
        this.temPortaLateralDeslizante = temPortaLateralDeslizante;
    }
}
