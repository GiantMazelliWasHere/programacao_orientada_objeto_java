public class ExemploVeiculo {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", "Volkswagen", 1970, "V8");
        Carro carro2 = new Carro("Civic", "Honda", 2020, "V12");

        Moto moto1 = new Moto("CB500", "Honda", 2019, 500);
        Moto moto2 = new Moto("Ninja", "Kawasaki", 2021, 1000);

        System.out.println("Informações do Carro 1:");
        carro1.exibirInformacoes();
        carro1.acelerar();

        System.out.println("\nInformações do Carro 2:");
        carro2.exibirInformacoes();
        carro2.acelerar();

        System.out.println("\nInformações da Moto 1:");
        moto1.exibirInformacoes();
        moto1.acelerar();

        System.out.println("\nInformações da Moto 2:");
        moto2.exibirInformacoes();
        moto2.acelerar();
    }
}
