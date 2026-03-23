package imobiliaria;

import java.time.LocalDate;

public abstract class Transacao {
    protected int numeroContrato;
    protected Imovel imovel;
    protected ClienteUsuario cliente;
    protected Funcionario funcionario;
    protected LocalDate dataTransacao;
    protected String formaPagamento;
    protected double valorTotal;
    protected double comissaoFuncionario;

    public Transacao(int numeroContrato, Imovel imovel, ClienteUsuario cliente,
                     Funcionario funcionario, LocalDate dataTransacao,
                     String formaPagamento, double valorTotal) {
        this.numeroContrato = numeroContrato;
        this.imovel = imovel;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.dataTransacao = dataTransacao;
        this.formaPagamento = formaPagamento;
        this.valorTotal = valorTotal;
        calcularComissaoFuncionario();
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public ClienteUsuario getCliente() {
        return cliente;
    }

    public void setCliente(ClienteUsuario cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDate dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getComissaoFuncionario() {
        return comissaoFuncionario;
    }

    public void setComissaoFuncionario(double comissaoFuncionario) {
        this.comissaoFuncionario = comissaoFuncionario;
    }

    public abstract void calcularComissaoFuncionario();

    public void finalizarTransacao() {
        funcionario.adicionarComissao(comissaoFuncionario);
    }


}