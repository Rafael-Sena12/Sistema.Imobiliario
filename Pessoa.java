package imobiliaria;


import java.util.ArrayList;
import java.util.List;


public abstract class Pessoa {
    protected String cpf;
    protected String nome;
    protected Endereco endereco;
    protected List<String> telefones;
    protected String email;
    protected String sexo;
    protected String estadoCivil;
    protected String profissao;

    public Pessoa(String cpf, String nome, Endereco endereco, String email,
                  String sexo, String estadoCivil, String profissao) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.telefones = new ArrayList<>();
    }

    public void adicionarTelefone(String telefone) {
        telefones.add(telefone);
    }

    public String getCpf() { return cpf; }
    public String getNome() { return nome; }
    public Endereco getEndereco() { return endereco; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Email: " + email;
    }
}