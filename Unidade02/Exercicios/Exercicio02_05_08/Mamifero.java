public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(String nome, int idade, String especie, String corPelo) {
        super(nome, idade, especie);
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("O mamífero está gritando.");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
