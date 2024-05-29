public enum OpcaoMenu {
    ENCERRAR(0, "Encerrar"),
    CADASTRAR_TUTOR(1, "Cadastrar Tutor"),
    LISTAR_TUTOR(2, "Listar Tutor"),
    CADASTRAR_ANIMAL(3, "Cadastrar Animal"),
    LISTAR_ANIMAL(4, "Listar Animal"),
    GERAR_SERVICO(5, "Gerar Serviço");

    private final int codigo;
    private final String descricao;

    OpcaoMenu(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}