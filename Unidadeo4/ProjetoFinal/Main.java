public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Chevrolet", "Onix", 2020, "Prata", 124000.00, 0);
        Carro carro1 = new Carro("Volkswagen", "Golf", 2019, "Preto", 90000.00, 0, 4, "Gasolina", 350);
        Moto moto1 = new Moto("Honda", "CB500F", 2021, "Vermelha", 25000.00, 0, 500, true, "Naked");
        Pessoa pessoa1 = new Pessoa("Eduardo", 30, "Rua das Flores, 123", "(11) 98765-4321", "Eduardo.mz@email.com", 1.75, 70.0);

        veiculo1.exibirInformacoes();
        veiculo1.ligar();
        veiculo1.acelerar(60);
        veiculo1.frear(30);
        veiculo1.desligar();
        System.out.println();

        carro1.exibirInformacoes();
        carro1.abrirPortaMalas();
        carro1.fecharPortaMalas();
        System.out.println();

        moto1.exibirInformacoes();
        moto1.empinar();
        System.out.println();

        pessoa1.exibirInformacoes();
    }
}
