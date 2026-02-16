public class Animal {
    private String nome;
    private int idade;
    private String especie;
    private String tipoAlimentacao;

    public Animal(String nome, int idade, String especie, String tipoAlimentacao) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public void emitirSom() {
        System.out.println(nome + " está emitindo um som.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Leão", 5, "Panthera leo", "Carnívoro");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Idade: " + animal.getIdade());
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Tipo de Alimentação: " + animal.getTipoAlimentacao());
        animal.emitirSom();
    }
}
