import java.util.ArrayList;

public class ExemploAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        Mamifero mamifero = new Mamifero("Leão", 5, "Panthera leo", "Dourado");
        Mamifero mamifero2 = new Mamifero("Elefante", 10, "Loxodonta africana", "Cinza");
        Ave ave = new Ave("Papagaio", 2, "Amazona aestiva", true);
        Ave ave2 = new Ave("Pinguim", 3, "Spheniscidae", false);
        Peixe peixe = new Peixe("Tilápia", 1, "Oreochromis niloticus", "Doce");
        Peixe peixe2 = new Peixe("Salmão", 4, "Salmo salar", "Água salgada");

        animais.add(mamifero);
        animais.add(mamifero2);
        animais.add(ave);
        animais.add(ave2);
        animais.add(peixe);
        animais.add(peixe2);

        for (Animal animal : animais) {
            animal.exibirInformacoes();
            animal.emitirSom();
            System.out.println();
        }
    }
}
