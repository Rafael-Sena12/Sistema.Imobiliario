package imobiliaria;

import java.time.LocalDate;

public class Aluguel extends Transacao {
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Aluguel(int numeroContrato, Imovel imovel, ClienteUsuario cliente,
                   Funcionario funcionario, LocalDate dataTransacao,
                   String formaPagamento, double valorTotal,
                   LocalDate dataInicio, LocalDate dataFim) {
        super(numeroContrato, imovel, cliente, funcionario, dataTransacao,
                formaPagamento, valorTotal);
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public void calcularComissaoFuncionario() {
        this.comissaoFuncionario = valorTotal * 0.05;
    }

    public LocalDate getDataInicio() { return dataInicio; }
    public LocalDate getDataFim() { return dataFim; }
}