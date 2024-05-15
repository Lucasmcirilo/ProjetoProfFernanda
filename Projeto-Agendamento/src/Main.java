import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro c = new Cadastro();

        int menu = 1;
        System.out.println("Menu:");
        System.out.println("0. Encerrar");
        System.out.println("1. Cadastrar Tutor");
        System.out.println("2. Listar Tutores");
        System.out.println("3. Começar Atendimento");
        System.out.println("4. Listar Atendimentos");

        while (menu == 1) {
            int smenu = sc.nextInt();
            switch (smenu) {
                case 0:
                    System.out.println("Encerrando.");
                    menu += 1;
                    break;
                case 1:
                    cadastrarTutor(sc, c);
                    break;
                case 2:
                    listarTutores(c);
                    break;
                case 3:
                    comecarAtendimento(c);
                    break;
                case 4:
                    listarAtendimentos(c);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    private static void cadastrarTutor(Scanner sc, Cadastro c) {
        Tutor t1 = new Tutor();
        System.out.println("Nome:");
        t1.setNome(sc.next());
        System.out.println("Cadastrando...");
        c.cadastrarTutor(t1);
    }

    private static void listarTutores(Cadastro c) {
        System.out.println("Listando Tutores:");
        c.listarTutores();
    }

    private static void comecarAtendimento(Cadastro c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iniciando Atendimento:");
        c.selecionarTutor(sc);
    }

    private static void listarAtendimentos(Cadastro c) {
        System.out.println("Listando Atendimentos:");
        c.listarAtendimentos();
    }
}
