import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro c = new Cadastro();

        System.out.println("0.Encerrar.");
        System.out.println("1.Cadastrar Tutor.");
        System.out.println("2.Listar Tutor.");
        System.out.println("3.Cadastrar Animal.");
        System.out.println("4.Listar Animal.");

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
                    Animal a1 = new Animal();
                    System.out.println("Nome do Animal:");
                    a1.setNome(sc.next());
                    System.out.println("Tipo do Animal:");
                    a1.setTipo(sc.next());
                    System.out.println("Raça do Animal:");
                    a1.setRaca(sc.next());
                    c.cadastrarAnimal(a1);
                    break;
                case 4:
                    c.listarAnimal();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }


        }
    }
}