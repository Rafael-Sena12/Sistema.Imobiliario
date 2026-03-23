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

    public abstract void calcularComissaoFuncionario();

    public void finalizarTransacao() {
        funcionario.adicionarComissao(comissaoFuncionario);
    }

    public int getNumeroContrato() { return numeroContrato; }
    public Imovel getImovel() { return imovel; }
}