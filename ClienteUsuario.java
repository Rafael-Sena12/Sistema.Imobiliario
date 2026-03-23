package imobiliaria;

import java.util.ArrayList;
import java.util.List;

public class ClienteUsuario extends Cliente {
    private List<String> fiadores;
    private List<String> indicacoes;

    public ClienteUsuario(String cpf, String nome, Endereco endereco, String email,
                          String sexo, String estadoCivil, String profissao) {
        super(cpf, nome, endereco, email, sexo, estadoCivil, profissao);
        this.fiadores = new ArrayList<>();
        this.indicacoes = new ArrayList<>();
    }

    public void adicionarFiador(String fiador) {
        fiadores.add(fiador);
    }

    public void adicionarIndicacao(String indicacao) {
        indicacoes.add(indicacao);
    }

    public void setFiadores(List<String> fiadores) {
        this.fiadores = fiadores;
    }

    public void setIndicacoes(List<String> indicacoes) {
        this.indicacoes = indicacoes;
    }

    public List<String> getFiadores() { return fiadores; }
    public List<String> getIndicacoes() { return indicacoes; }
}