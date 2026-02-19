public class Ave extends Animal {
    private boolean podeVoar;

    public Ave(String nome, int idade, String especie, boolean podeVoar) {
        super(nome, idade, especie);
        this.podeVoar = podeVoar;
    }

    @Override
    public void emitirSom() {
        System.out.println("A ave " + getNome() + " está cantando.");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Pode voar: " + (podeVoar ? "Sim" : "Não"));
    }

    public boolean getPodeVoar() {
        return podeVoar;
    }

    public void setPodeVoar(boolean podeVoar) {
        if (podeVoar) {
            System.out.println("A ave " + getNome() + " pode voar.");
        } else {
            System.out.println("A ave " + getNome() + " não pode voar.");
        }
    }
}
