package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class TutorDAO {
    private Connection connection;
    public TutorDAO() {
        this.connection = new Conexao().GeraConexao();
    }
    public void adiciona(Tutor t) {
        String sql = "INSERT INTO Tutor(nome, email, idade, telefone) VALUES(Nome, Email, Idade, Telefone_tutor)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, t.getNome());
            stmt.setString(2, t.getEmail());
            stmt.setInt(3, t.getIdade);
            stmt.setString(4, t.getTelefone);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Tutor> listarTutor() {
        ArrayList<Tutor> tutor = new ArrayList<>();
        String sql = "SELECT * FROM Tutor";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Tutor t = new Tutor();
                t.setIdT(rs.getInt("idT"));
                t.setNome(rs.getString("nome"));
                t.setEmail(rs.getString("email"));
                t.setIdade(rs.getInt("idade"));
                t.getTelefone(rs.getString("telefone"));
                tutor.add(t);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return tutor;
    }
}