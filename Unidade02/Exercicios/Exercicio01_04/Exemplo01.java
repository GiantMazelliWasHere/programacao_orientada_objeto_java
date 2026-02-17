public class Exemplo01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", "Volkswagen", 1970, "V8");
        Carro carro2 = new Carro("Civic", "Honda", 2020, "V12");

        Moto moto1 = new Moto("CB500", "Honda", 2019, 500);
        Moto moto2 = new Moto("Ninja", "Kawasaki", 2021, 1000);

        System.out.println("Informações do Carro 1:");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Motor: " + carro1.getMotor());
        carro1.acelerar();

        System.out.println("\nInformações do Carro 2:");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano: " + carro2.getAno());
        System.out.println("Motor: " + carro2.getMotor());
        carro2.acelerar();

        System.out.println("\nInformações da Moto 1:");
        System.out.println("Marca: " + moto1.getMarca());
        System.out.println("Modelo: " + moto1.getModelo());
        System.out.println("Ano: " + moto1.getAno());
        System.out.println("Cilindrada: " + moto1.getCilindradas() + "cc");
        moto1.acelerar();

        System.out.println("\nInformações da Moto 2:");
        System.out.println("Marca: " + moto2.getMarca());
        System.out.println("Modelo: " + moto2.getModelo());   
        System.out.println("Ano: " + moto2.getAno());
        System.out.println("Cilindrada: " + moto2.getCilindradas() + "cc");
        moto2.acelerar();
    }
}
