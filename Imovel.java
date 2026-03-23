package imobiliaria;

import java.time.LocalDate;

public abstract class Imovel {
    protected double area;
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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataConstrucao() {
        return dataConstrucao;
    }

    public void setDataConstrucao(LocalDate dataConstrucao) {
        this.dataConstrucao = dataConstrucao;
    }

    public void setValorSugerido(double valorSugerido) {
        this.valorSugerido = valorSugerido;
    }

    public double getValorReal() {
        return valorReal;
    }

    public void setValorReal(double valorReal) {
        this.valorReal = valorReal;
    }

    public double getComissaoImobiliaria() {
        return comissaoImobiliaria;
    }

    public void setComissaoImobiliaria(double comissaoImobiliaria) {
        this.comissaoImobiliaria = comissaoImobiliaria;
    }

    public LocalDate getDataDisponibilizacao() {
        return dataDisponibilizacao;
    }

    public void setDataDisponibilizacao(LocalDate dataDisponibilizacao) {
        this.dataDisponibilizacao = dataDisponibilizacao;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDate dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public void setProprietario(ClienteProprietario proprietario) {
        this.proprietario = proprietario;
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