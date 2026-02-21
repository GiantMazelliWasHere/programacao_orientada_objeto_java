public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;
    private int capacidadePortaMalas;

    public Carro(String marca, String modelo, int ano, String cor, double preco, int velocidade, double altura, double capacidadeCarga, int numeroPortas, String tipoCombustivel, int capacidadePortaMalas) {
        super(marca, modelo, ano, cor, preco, velocidade, altura, capacidadeCarga);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public void abrirPortaMalas() {
        System.out.println("Abrindo o porta-malas...");
    }

    public void fecharPortaMalas() {
        System.out.println("Fechando o porta-malas...");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de Portas:          " + numeroPortas);
        System.out.println("Tipo de Combustível:       " + tipoCombustivel);
        System.out.println("Capacidade do Porta-Malas: " + capacidadePortaMalas + " litros");
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setNumeroPortas(int numeroPortas) {
        if (numeroPortas < 0) {
            throw new IllegalArgumentException("Para uma pessoa poder acessar o carro ele tem que ter um número de portas maior que zero.");
        }
        this.numeroPortas = numeroPortas;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        if (capacidadePortaMalas < 0) {
            throw new IllegalArgumentException("Capacidade do porta-malas deve ser maior que zero.");
        }
        this.capacidadePortaMalas = capacidadePortaMalas;
    }
}
