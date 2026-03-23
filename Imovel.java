package imobiliaria;

import java.time.LocalDate;

public abstract class Imovel {
    protected String codigo;
    protected Endereco endereco;
    protected LocalDate dataConstrucao;
    protected double valorSugerido;
    protected double valorReal;
    protected double comissaoImobiliaria;
    protected StatusImovel status;
    protected LocalDate dataDisponibilizacao;
    protected LocalDate dataTransacao;
    protected ClienteProprietario proprietario;

    public Imovel(String codigo, Endereco endereco, LocalDate dataConstrucao,
                  double valorSugerido, ClienteProprietario proprietario) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.dataConstrucao = dataConstrucao;
        this.valorSugerido = valorSugerido;
        this.proprietario = proprietario;
        this.status = StatusImovel.DISPONIVEL_VENDA;
        this.dataDisponibilizacao = LocalDate.now();
    }

    public abstract double calcularComissao();

    public void realizarTransacao(double valorReal, double comissaoImobiliaria,
                                  LocalDate dataTransacao, StatusImovel novoStatus) {
        this.valorReal = valorReal;
        this.comissaoImobiliaria = comissaoImobiliaria;
        this.dataTransacao = dataTransacao;
        this.status = novoStatus;
    }


    public String getCodigo() { return codigo; }
    public Endereco getEndereco() { return endereco; }
    public double getValorSugerido() { return valorSugerido; }
    public StatusImovel getStatus() { return status; }
    public ClienteProprietario getProprietario() { return proprietario; }

    public void setStatus(StatusImovel status) { this.status = status; }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Endereço: " + endereco.getLogradouro() +
                ", Status: " + status + ", Valor: R$ " + valorSugerido;
    }
}