package imobiliaria;

public class Casa extends Imovel {
    protected int quartos;
    protected int suites;
    protected int salasEstar;
    protected int salasJantar;
    protected int vagasGaragem;
    protected boolean armarioEmbutido;
    protected String descricao;

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

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getSalasEstar() {
        return salasEstar;
    }

    public void setSalasEstar(int salasEstar) {
        this.salasEstar = salasEstar;
    }

    public int getSalasJantar() {
        return salasJantar;
    }

    public void setSalasJantar(int salasJantar) {
        this.salasJantar = salasJantar;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public void setVagasGaragem(int vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public boolean isArmarioEmbutido() {
        return armarioEmbutido;
    }

    public void setArmarioEmbutido(boolean armarioEmbutido) {
        this.armarioEmbutido = armarioEmbutido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public double calcularComissao() {
        return valorReal * 0.05;
    }
}