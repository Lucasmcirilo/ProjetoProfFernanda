import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Cadastro c = new Cadastro();



        OpcaoMenu[] opcoes = OpcaoMenu.values();
        int menu = 1;

        while (menu == 1) {
            System.out.println("Escolha uma opção:");
            for (OpcaoMenu opcao : opcoes) {
                System.out.println(opcao.getCodigo() + ". " + opcao.getDescricao());
            }

            int smenu = sc.nextInt();
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
                    t1.setTelefone_tutor(sc.next());
                    System.out.println("Cadastrando...");
                    c.cadastrarTutor_banco(t1);
                    break;
                case 2:
                    c.listarTutor_banco();
                    break;
                case 3:
                    Animal a1 = new Animal();
                    System.out.println("Nome do Animal:");
                    a1.setNome(sc.next());
                    System.out.println("Tipo do Animal:");
                    a1.setTipo(sc.next());
                    System.out.println("Raça do Animal:");
                    a1.setRaca(sc.next());
                    c.cadastrarAnimal_banco(a1);
                    break;
                case 4:
                    c.listarAnimal_banco();
                    break;
                case 5:
                    Agendamento ag1 = new Agendamento();
                    System.out.println("Tipo de Agendamento:");
                    ag1.setTipo(sc.next());
                    System.out.println("Dia da consulta:");
                    ag1.setDataHora(sc1.nextInt());
                    System.out.println("Médico:");
                    ag1.setMedico(sc.next());
                    System.out.println("Status:");
                    ag1.setStatus(sc.next());
                    c.cadastrarAgendamento(ag1);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}