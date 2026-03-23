package imobiliaria;

import java.time.LocalDate;

public class Apartamento extends Imovel {
    private int quartos;
    private int suites;
    private int salasEstar;
    private int salasJantar;
    private int vagasGaragem;
    private double area;
    private boolean armarioEmbutido;
    private String descricao;
    private int andar;
    private double valorCondominio;
    private boolean portaria24h;

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

    @Override
    public double calcularComissao() {
        return valorReal * 0.06;
    }
}