import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Tutor> tutores = new ArrayList<>();
    private ArrayList<Atendimento> atendimentos = new ArrayList<>();

    public void cadastrarTutor(Tutor t) {
        tutores.add(t);
        System.out.println("Tutor cadastrado.");
    }

    public void listarTutores() {
        int contagem = 0;
        for (Tutor t : tutores) {
            System.out.println("ID: " + contagem + " Nome: " + t.getNome());
            contagem++;
        }
    }

    public void selecionarTutor(Scanner sc) {
        int tutorSelecionado;

        System.out.println("Selecione o Tutor pelo seu ID: ");
        listarTutores();
        tutorSelecionado = sc.nextInt();
        System.out.println("Selecione o tipo de Atendimento:\n1-Consulta de Rotina.\n2-Consulta Cirúrgica. ");
        int tipoAtendimentoSelecionado = sc.nextInt();
        String tipoAtendimento = "";
        if (tipoAtendimentoSelecionado == 1) {
            tipoAtendimento = "Consulta de Rotina";
        } else if (tipoAtendimentoSelecionado == 2) {
            tipoAtendimento = "Consulta Cirúrgica";
        } else {
            System.out.println("Opção inválida.");
            return;
        }
        Atendimento atendimento = new Atendimento(tipoAtendimento);

        // Adicionando o atendimento à lista
        atendimentos.add(atendimento);

        System.out.println(tutores.get(tutorSelecionado).getNome() + " será seu tutor.");
        System.out.println("Ele(a) irá te atender seu pedido de " + atendimento.getTipoAtendimento());

        // Lista os atendimentos após armazenar
        listarAtendimentos();
    }

    public void listarAtendimentos() {
        if (atendimentos.isEmpty()) {
            System.out.println("Nenhum atendimento registrado.");
        } else {
            System.out.println("Listando Atendimentos:");
            for (int i = 0; i < atendimentos.size(); i++) {
                System.out.println("Atendimento " + (i+1) + ": " + atendimentos.get(i).getTipoAtendimento());
            }
        }
    }
}
