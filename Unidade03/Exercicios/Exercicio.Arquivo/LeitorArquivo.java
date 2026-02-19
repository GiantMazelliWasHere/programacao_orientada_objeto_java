import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeitorArquivo {
    public void lerArquivo(String caminho) {
        try{
            File arquivo = new File(caminho);
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao foi encontrado aqui: " + caminho);
        }
    }

    public static void main(String[] args) {
        LeitorArquivo leitor = new LeitorArquivo();
        leitor.lerArquivo("E:\\Documents\\Leega_treinamento\\programacao_orientada_objeto\\programacao_orientada_objeto_java\\Unidade03\\Exercicios\\Exercicio.Arquivo\\Teste.txt");
        leitor.lerArquivo("E:\\Documents\\Leega_treinamento\\programacao_orientada_objeto\\programacao_orientada_objeto_java\\Unidade03\\Exercicios\\Exercicio.Arquivo\\Teste2.txt");
    }
}
