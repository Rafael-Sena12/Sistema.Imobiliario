package imobiliaria;

import java.time.LocalDate;

public class Venda extends Transacao {
    public Venda(int numeroContrato, Imovel imovel, ClienteUsuario cliente,
                 Funcionario funcionario, LocalDate dataTransacao,
                 String formaPagamento, double valorTotal) {
        super(numeroContrato, imovel, cliente, funcionario, dataTransacao,
                formaPagamento, valorTotal);
    }

    @Override
    public void calcularComissaoFuncionario() {
        this.comissaoFuncionario = valorTotal * 0.02;
    }
}