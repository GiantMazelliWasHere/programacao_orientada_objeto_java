public class Exemplo04 {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, "1.8L");
        Moto moto = new Moto("Honda", "CB500", 2019, 500);

        System.out.println("Informações do Carro:");
        carro.exibirInformacoes();
        carro.acelerar();

        System.out.println("\nInformações da Moto:");
        moto.exibirInformacoes();
        moto.acelerar();
    }
}
