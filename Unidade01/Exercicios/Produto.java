public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void precoDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        double precoComDesconto = preco - desconto;
        System.out.println("Preço com desconto: " + precoComDesconto);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Smartphone", 1500.00);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        produto.precoDesconto(10); // Aplicando um desconto de 10%
    }
}
