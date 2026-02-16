public class Principal {
    public static void main(String[] args) {
        CarroAula carro1 = new CarroAula("Ford", "Focus", 2019, "Branca");
        CarroAula carro2 = new CarroAula("Toyota", "Corolla", 2020, "Prata");
        CarroAula carro3 = new CarroAula("Honda", "Civic", 2021, "Vermelha");
        
        System.out.println("Carro 1:");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Cor: " + carro1.getCor());

        System.out.println("\nCarro 2:");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano: " + carro2.getAno());
        System.out.println("Cor: " + carro2.getCor());

        System.out.println("\nCarro 3:");
        System.out.println("Marca: " + carro3.getMarca());
        System.out.println("Modelo: " + carro3.getModelo());
        System.out.println("Ano: " + carro3.getAno());
        System.out.println("Cor: " + carro3.getCor());

        // Modificando o carro 3
        carro3.setCor("Vermelho");
        System.out.println("\nCarro 3 após modificação:");
        System.out.println("Marca: " + carro3.getMarca());
        System.out.println("Modelo: " + carro3.getModelo());
        System.out.println("Ano: " + carro3.getAno());
        System.out.println("Cor: " + carro3.getCor());

        // Forma coreta de modificar o carro 2 usando o setter
        carro2.setCor("Preto");
        System.out.println("\nCarro 2 após modificação:");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano: " + carro2.getAno());
        System.out.println("Cor: " + carro2.getCor());
    }
}
