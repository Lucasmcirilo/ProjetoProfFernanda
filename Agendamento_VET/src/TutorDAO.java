

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
        String sql = "INSERT INTO Tutor(id_Tutor, nome, email, idade, telefone_tutor) VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, t.getIdT());
            stmt.setString(2, t.getNome());
            stmt.setString(3, t.getEmail());
            stmt.setInt(4, t.getIdade());
            stmt.setString(5, t.getTelefone_tutor());
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
                t.setIdT(rs.getInt("id_Tutor"));
                t.setNome(rs.getString("nome"));
                t.setEmail(rs.getString("email"));
                t.setIdade(rs.getInt("idade"));
                t.setTelefone_tutor(rs.getString("telefone_tutor"));
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