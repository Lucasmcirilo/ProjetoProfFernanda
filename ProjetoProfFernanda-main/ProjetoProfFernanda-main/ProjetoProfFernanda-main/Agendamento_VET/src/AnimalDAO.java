import SQL.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class AnimalDAO {
    private Connection connection;
    public AnimalDAO() {
        this.connection = new Conexao().GeraConexao();
    }
    public void adiciona(Animal a) {
        String sql = "INSERT INTO Animal(nome, tipo, raca) VALUES(Nome, Tipo, Raca)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getTipo());
            stmt.setString(3, a.getRaca());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Animal> listarAnimal() {
        ArrayList<Animal> animal = new ArrayList<>();
        String sql = "SELECT * FROM Animal";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Animal a = new Animal();
                a.setIdA(rs.getInt("idA"));
                a.setNome(rs.getString("nome"));
                a.setTipo(rs.getString("tipo"));
                a.setRaca(rs.getString("raca"));
                animal.add(a);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return animal;
    }
}