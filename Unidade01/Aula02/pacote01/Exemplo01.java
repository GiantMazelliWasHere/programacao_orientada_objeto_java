package pacote01;

import pacote02.Carro;

public class Exemplo01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Produto produto = new Produto();
        Carro carro = new Carro();
        
        pessoa.setNome("Eduardo");
        System.out.println(pessoa.nome); // Acesso permitido (public)
        System.out.println(pessoa.idade); // Acesso permitido (protected, apenas acessível dentro do pacote01)
        // System.out.println(pessoa.peso); // Acesso negado (private)

        produto.setNome("Notebook");
        System.out.println(produto.nome); // Acesso permitido (public)
        System.out.println(produto.preco); // Acesso permitido (protected, apenas acessível dentro do pacote01)
        // System.out.println(produto.peso); // Acesso negado (private)

        carro.setMarca("Toyota");
        System.out.println(carro.marca); // Acesso permitido (public)
        // System.out.println(carro.modelo); // Acesso negado (protected, apenas acessível dentro do pacote02)
        // System.out.println(carro.cor); // Acesso negado (private)
    }
    
}
