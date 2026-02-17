public class Peixe extends Animal {
    private String tipoAgua;

    public Peixe(String nome, int idade, String especie, String tipoAgua) {
        super(nome, idade, especie);
        this.tipoAgua = tipoAgua;
    }

    @Override
    public void emitirSom() {
        System.out.println("O peixe está fazendo bolhas.");
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
    
}
