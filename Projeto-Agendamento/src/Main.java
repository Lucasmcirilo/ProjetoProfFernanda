import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadastro c = new Cadastro();

        System.out.println("Iniciando");
        int menu = 1;
        while (menu == 1) {

            System.out.println("0.Encerrar; 1.Cadastrar Tutor; 2.Listar Tutor; 3.Começar Atendimento.");
            System.out.println("4.Listar Atendimento;");
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
                    System.out.println("Cadastrando...");
                    c.cadastrarTutor(t1);
                    break;
                case 2:
                    c.listarTutores();
                    break;
                case 3:
                    //incompleto:
                    // falta desenvolver uma criação de dados pra salvar o atendimento
                    // e completar a função de selecionar tutor e atendimento (pretendo separar ambos)
                    Atendimento a1 = new Atendimento();
                    c.selecionarTutor();
                    break;
            }

        }


    }
}