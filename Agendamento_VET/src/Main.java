import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro c = new Cadastro();

        System.out.println("0.Encerrar.");
        System.out.println("1.Cadastrar Tutor.");
        System.out.println("2.Listar Tutor.");


        int menu = 1;
        while (menu == 1) {
            int smenu;
            smenu = sc.nextInt();
            switch (smenu) {
                case 0:
                    System.out.println("Encerrando.");
                    menu += 1;
                    break;
                case 1:
                    Tutor t1 = new Tutor();
                    System.out.println("Nome:");
                    t1.setNome(sc.next());
                    System.out.println("Email:");
                    t1.setEmail(sc.next());
                    System.out.println("Idade:");
                    t1.setIdade(sc.nextInt());
                    System.out.println("Telefone:");
                    t1.setTelefone(sc.next());
                    System.out.println("Cadastrando...");
                    c.cadastrarTutor(t1);
                    break;
                case 2:
                    c.listarTutores();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }


        }
    }
}