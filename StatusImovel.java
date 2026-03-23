package imobiliaria;

public enum StatusImovel {
    DISPONIVEL_VENDA("Disponível para Venda"),
    DISPONIVEL_LOCACAO("Disponível para Locação"),
    VENDIDO("Vendido"),
    ALUGADO("Alugado");

    private String descricao;

    StatusImovel(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}