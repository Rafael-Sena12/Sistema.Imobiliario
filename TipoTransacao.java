package imobiliaria;

public enum TipoTransacao {
    VENDA("Venda"),
    ALUGUEL("Aluguel");

    private String descricao;

    TipoTransacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}