public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void cumprimentar() {
        System.out.println("Olá! Bem-vindo(a)!");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Alice", 30);
        Pessoa pessoa2 = new Pessoa("Bob", 25);

        cumprimentar();
        System.out.println("Nome: " + pessoa1.getNome() + ", Idade: " + pessoa1.getIdade());
        System.out.println("Nome: " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade());
    }
}
