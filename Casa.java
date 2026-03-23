package imobiliaria;

public class Casa extends Imovel {
    private int quartos;
    private int suites;
    private int salasEstar;
    private int salasJantar;
    private int vagasGaragem;
    private double area;
    private boolean armarioEmbutido;
    private String descricao;

    public Casa(String codigo, Endereco endereco, java.time.LocalDate dataConstrucao,
                double valorSugerido, ClienteProprietario proprietario,
                int quartos, int suites, int salasEstar, int salasJantar,
                int vagasGaragem, double area, boolean armarioEmbutido, String descricao) {
        super(codigo, endereco, dataConstrucao, valorSugerido, proprietario);
        this.quartos = quartos;
        this.suites = suites;
        this.salasEstar = salasEstar;
        this.salasJantar = salasJantar;
        this.vagasGaragem = vagasGaragem;
        this.area = area;
        this.armarioEmbutido = armarioEmbutido;
        this.descricao = descricao;
    }

    @Override
    public double calcularComissao() {
        return valorReal * 0.05;
    }
}