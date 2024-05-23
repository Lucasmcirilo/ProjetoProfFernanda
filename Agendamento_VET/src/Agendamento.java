public class Agendamento {
    private int dataHora, idAg;
    private String tipo, medico, status;

    public int getIdAg() {
        return idAg;
    }

    public void setIdAg(int idAg) {
        this.idAg = idAg;
    }

    public int getDataHora() {
        return dataHora;
    }

    public void setDataHora(int dataHora) {
        this.dataHora = dataHora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
