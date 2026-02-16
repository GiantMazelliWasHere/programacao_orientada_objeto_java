import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAluno {
    private ArrayList<Aluno> alunos;

    public CadastroAluno() {
        alunos = new ArrayList<>();
    }

    public void cadastrarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Idade: " + aluno.getIdade());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("-----------------------");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade do aluno: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Curso do aluno: ");
                    String curso = scanner.nextLine();
                    
                    cadastro.cadastrarAluno(new Aluno(nome, idade, curso));
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                case 2:
                    cadastro.listarAlunos();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
        }
        scanner.close();
        System.out.println("Encerrando o programa. Até mais!");
    }
}
