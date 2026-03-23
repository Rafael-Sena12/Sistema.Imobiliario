package imobiliaria;

import java.time.LocalDate;

public class Apartamento extends Imovel {
    protected int quartos;
    protected int suites;
    protected int salasEstar;
    protected int salasJantar;
    protected int vagasGaragem;
    protected boolean armarioEmbutido;
    protected String descricao;
    protected int andar;
    protected double valorCondominio;
    protected boolean portaria24h;

    public Apartamento(String codigo, Endereco endereco, LocalDate dataConstrucao,
                       double valorSugerido, ClienteProprietario proprietario,
                       int quartos, int suites, int salasEstar, int salasJantar,
                       int vagasGaragem, double area, boolean armarioEmbutido,
                       String descricao, int andar, double valorCondominio,
                       boolean portaria24h) {
        super(codigo, endereco, dataConstrucao, valorSugerido, proprietario);
        this.quartos = quartos;
        this.suites = suites;
        this.salasEstar = salasEstar;
        this.salasJantar = salasJantar;
        this.vagasGaragem = vagasGaragem;
        this.area = area;
        this.armarioEmbutido = armarioEmbutido;
        this.descricao = descricao;
        this.andar = andar;
        this.valorCondominio = valorCondominio;
        this.portaria24h = portaria24h;
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

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public boolean isPortaria24h() {
        return portaria24h;
    }

    public void setPortaria24h(boolean portaria24h) {
        this.portaria24h = portaria24h;
    }

    @Override
    public double calcularComissao() {
        return valorReal * 0.06;
    }
}