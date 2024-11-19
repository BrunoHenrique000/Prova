import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static ArrayList<Usuario> ListaUsuarios = new ArrayList<>();
    Usuario usuario = new Usuario();

    public static void main(String[] args) {
        System.out.println("---Atividade Avaliativa---");

        boolean rodar = true;

        while (rodar) {
            System.out.println("Entre com o que deseja:");
            System.out.println("""
                1. Cadastro de usuário
                2. Listagem de usuário
                3. Exclusão de usuário
                4. Sair
                """);
            int escolha = scan.nextInt();
            scan.nextLine();

            if (escolha == 1) {
                cadastroUsuario();
            }

            if (escolha == 2) {
                listagemUsuario();
            }

            if (escolha == 3) {
                exclusaoUsuario();
            }

            if (escolha == 4) {
                rodar = false;
            }
        }
    }

    public static void cadastroUsuario() {
        System.out.println("-Cadastro de usuário-");

        System.out.println("Entre com o nome de usuário:");
        String nome = scan.nextLine();

        System.out.println("Entre com a idade do usuário:");
        int idade = scan.nextInt();
        scan.nextLine();

        Usuario usuario1 = new Usuario(nome, idade);

        ListaUsuarios.add(usuario1);

        System.out.println("Concluído! \n");
    }

    public static void listagemUsuario() {
        System.out.println("-Listagem de usuários-");

        for (Usuario usuario : ListaUsuarios) {
            System.out.println(usuario.toString());
        }

        System.out.println("Concluído! \n");
    }

    public static void exclusaoUsuario() {
        System.out.println("-Exclusão de usuário-");

        System.out.println("Entre com o nome de usuário que deseja excluir:");
        String nome = scan.nextLine();

        System.out.println("Entre com a idade do usuário que deseja excluir:");
        int idade = scan.nextInt();

        Iterator<Usuario> iterator = ListaUsuarios.iterator();

        while (iterator.hasNext()) {
            Usuario usuario = iterator.next();

            if (usuario.getNome().equalsIgnoreCase(nome) && usuario.getIdade() == idade) {
                iterator.remove();
            }
        }

        System.out.println("Concluído! \n");
    }
}