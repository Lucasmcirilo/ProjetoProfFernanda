import java.util.ArrayList;

public class Cadastro {
    private ArrayList<Tutor> tutores = new ArrayList<>();

    public void listarTutores() {
        for (Tutor t : tutores) {
            System.out.println("Nome: " + t.getNome() + "; Idade: " + t.getIdade());
            System.out.println("Email: " + t.getEmail());
            System.out.println("Telefone: " + t.getTelefone());
        }
    }

    public void cadastrarTutor(Tutor t) {
        tutores.add(t);
        System.out.println("Tutor cadastrado.");
    }

}
