import java.util.ArrayList;

public class Cadastro {
    // daos
    private TutorDAO tutorDAO = new TutorDAO();
    private AnimalDAO animalDAO = new AnimalDAO();
    private AgendamentoDAO agendamentoDAO = new AgendamentoDAO();

    // arrays para teste casual
    private ArrayList<Tutor> tutores = new ArrayList<>();
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Agendamento> agendamentos = new ArrayList<>();

    // cadastro com banco (dao)
    public void cadastrarTutor_banco(Tutor t) {
        tutorDAO.adiciona(t);
        System.out.println("Tutor cadastrado com sucesso.");
    }
    public void listarTutor_banco() {
        ArrayList<Tutor> tutors = tutorDAO.listarTutor();
        for (Tutor t : tutors) {
            System.out.println("Nome: " + t.getNome());
            System.out.println("Idade: " + t.getIdade());
            System.out.println("Email: " + t.getEmail());
            System.out.println("Telefone: " + t.getTelefone_tutor());
        }
    }

    public void cadastrarAnimal_banco(Animal a) {
        animalDAO.adiciona(a);
        System.out.println("Pet cadastrado com sucesso.");
    }
    public void listarAnimal_banco() {
        ArrayList<Animal> animals1 = animalDAO.listarAnimal();
        for (Animal a : animals1) {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Raça: " + a.getRaca());
            System.out.println("Tipo: " + a.getTipo());
        }
    }





    // cadastro com arrays (casual)
    public void listarTutores() {
        for (Tutor t : tutores) {
            System.out.println("idT: " + t.getIdT());
            System.out.println("Nome: " + t.getNome());
            System.out.println("Idade: " + t.getIdade());
            System.out.println("Email: " + t.getEmail());
            System.out.println("Telefone: " + t.getTelefone_tutor());
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

    public Cadastro() {
        this.tutorDAO = new TutorDAO();
        this.animalDAO = new AnimalDAO();
        this.agendamentoDAO = new AgendamentoDAO();

    }


}
