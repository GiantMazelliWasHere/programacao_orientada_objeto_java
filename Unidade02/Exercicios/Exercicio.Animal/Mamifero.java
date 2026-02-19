public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(String nome, int idade, String especie, String corPelo) {
        super(nome, idade, especie);
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("O mamífero " + getNome() + " está fazendo um som característico desse tipo de mamífero.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cor do pelo: " + corPelo);
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
