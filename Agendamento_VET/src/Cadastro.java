import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Tutor> tutores = new ArrayList<>();
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Agendamento> agendamentos = new ArrayList<>();


    public void listarTutores() {
        for (Tutor t : tutores) {
            System.out.println("Nome: " + t.getNome());
            System.out.println("Idade: " + t.getIdade());
            System.out.println("Email: " + t.getEmail());
            System.out.println("Telefone: " + t.getTelefone());
        }
    }

    public void cadastrarTutor(Tutor t) {
        tutores.add(t);
        System.out.println("Tutor cadastrado.");
    }

    public void listarAnimal() {
        for (Animal a : animals) {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Raça: " + a.getRaca());
            System.out.println("Tipo: " + a.getTipo());
        }
    }

    public void cadastrarAnimal(Animal a) {
        animals.add(a);
        System.out.println("Animal cadastrado.");
    }

    public void listarAgendamento() {
        for (Agendamento ag : agendamentos) {



        }
    }

    public void cadastrarAgendamento(Agendamento ag) {
        agendamentos.add(ag);
        System.out.println("Agendamento concluído.");
    }

}
