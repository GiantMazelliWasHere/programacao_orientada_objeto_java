public class Exemplo05 {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero("Leão", 5, "Panthera leo", "Dourado");
        Ave aves = new Ave("Papagaio", 2, "Amazona aestiva", true);
        Peixe peixe = new Peixe("Tilápia", 1, "Oreochromis niloticus", "Doce");

        mamifero.emitirSom();
        aves.emitirSom();
        peixe.emitirSom();
    }
}
