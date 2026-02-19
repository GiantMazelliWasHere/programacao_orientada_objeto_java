public class Peixe extends Animal {
    private String tipoAgua;

    public Peixe(String nome, int idade, String especie, String tipoAgua) {
        super(nome, idade, especie);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void emitirSom() {
        System.out.println("O peixe " + getNome() + " está fazendo bolhas.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de água: " + tipoAgua);
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
    
}
