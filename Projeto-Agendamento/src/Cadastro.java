import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    Scanner sc = new Scanner(System.in);
    Atendimento a = new Atendimento();
    private ArrayList<Tutor> tutores = new ArrayList<>();
    private ArrayList<Atendimento> atendimentos = new ArrayList<>();


    public void cadastrarTutor(Tutor t) {
        tutores.add(t);
        System.out.println("Tutor cadastrado.");
    }

    // listagem com contagem para armazenar um "id"
    public void listarTutores() {
        int contagem = 0;
        for (Tutor t : tutores) {
            System.out.println("ID: " + contagem + " Nome: " + t.getNome());
            contagem += 1;
        }
    }

    public void selecionarTutor() {
        int tutorSelecionado;
        int atendimentoSelecionado;

        System.out.println("Selecione o Tutor pelo seu ID: ");
        listarTutores();
        tutorSelecionado = sc.nextInt();

        //retrabalhar na seleção de atendimento que atualmente está incompleto
        System.out.println("Selecione o tipo de Atendimento: ");
        a.tiposAtendimentos();
        atendimentoSelecionado = sc.nextInt();

        System.out.println(tutores.get(tutorSelecionado).getNome() + " será seu tutor.");
        System.out.println("Ele(a) irá te atender seu pedido de ");

    }
}
