import java.util.ArrayList;
import java.util.List;

public class ExemploAutenticacao {
    public static void main(String[] args) {
        List<Autenticavel> listaAcesso = new ArrayList<>();

        Usuario usuario1 = new Usuario("leega", "senha123");
        Administrador admin1 = new Administrador("admin", "admin#2026");

        listaAcesso.add(usuario1);
        listaAcesso.add(admin1);

        for (Autenticavel autenticavel : listaAcesso) {
            boolean autenticado = autenticavel.autenticar("senha123");
            if (autenticado) {
                System.out.println("Acessso realizado com sucesso!");
                break;
            } else {
                System.out.println("Acesso negado! Senha incorreta.");
            }
        }
    }
}
