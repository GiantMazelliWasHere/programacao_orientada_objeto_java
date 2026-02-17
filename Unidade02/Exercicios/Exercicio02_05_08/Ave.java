public class Ave extends Animal {
    private boolean podeVoar;

    public Ave(String nome, int idade, String especie, boolean podeVoar) {
        super(nome, idade, especie);
        this.podeVoar = podeVoar;
    }

    @Override
    public void emitirSom() {
        System.out.println("A ave está cantando.");
    }

    public boolean getPodeVoar() {
        return podeVoar;
    }

    public void setPodeVoar(boolean podeVoar) {
        this.podeVoar = podeVoar;
    }
}
