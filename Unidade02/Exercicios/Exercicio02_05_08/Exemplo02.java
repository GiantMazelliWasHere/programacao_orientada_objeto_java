public class Exemplo02 {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero("Leão", 5, "Panthera leo", "Dourado");
        Ave aves = new Ave("Papagaio", 2, "Amazona aestiva", true);
        Peixe peixe = new Peixe("Tilápia", 1, "Oreochromis niloticus", "Doce");

        System.out.println("Mamífero: " + mamifero.getNome() + ", Idade: " + mamifero.getIdade() + ", Espécie: " + mamifero.getEspecie() + ", Cor do Pelo: " + mamifero.getCorPelo());
        System.out.println("\nAve: " + aves.getNome() + ", Idade: " + aves.getIdade() + ", Espécie: " + aves.getEspecie() + ", Pode Voar: " + aves.getPodeVoar());
        System.out.println("\nPeixe: " + peixe.getNome() + ", Idade: " + peixe.getIdade() + ", Espécie: " + peixe.getEspecie() + ", Tipo de Água: " + peixe.getTipoAgua());
    }
}
