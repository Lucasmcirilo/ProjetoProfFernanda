

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class AgendamentoDAO {
    private Connection connection;
    public AgendamentoDAO() {
        this.connection = new Conexao().GeraConexao();
    }
    public void adiciona(Agendamento ag) {
        String sql = "INSERT INTO Agendamento(tipo_atendimento, data_hora, medico_responsavel, status_atendimento) VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, ag.getTipo());
            stmt.setInt(2, ag.getDataHora());
            stmt.setString(3, ag.getMedico());
            stmt.setString(4, ag.getStatus());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Agendamento> listarAgendamento() {
        ArrayList<Agendamento> agendamento = new ArrayList<>();
        String sql = "SELECT * FROM Agendamento";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Agendamento ag = new Agendamento();
                ag.setIdAg(rs.getInt("id_agendamento"));
                ag.setTipo(rs.getString("Tipo_agendamento"));
                ag.setDataHora(rs.getInt("Data_hora"));
                ag.setMedico(rs.getString("Medico_responsavel"));
                ag.setStatus(rs.getString("Status_agendamento"));
                agendamento.add(ag);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return agendamento;
    }
}