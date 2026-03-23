package imobiliaria;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private String telefoneCelular;
    private LocalDate dataIngresso;
    private String cargo;
    private double salarioBase;
    private double totalComissao;
    private String usuario;
    private String senha;

    public Funcionario(String cpf, String nome, Endereco endereco, String email,
                       String sexo, String estadoCivil, String profissao,
                       String telefoneCelular, LocalDate dataIngresso, String cargo,
                       double salarioBase, String usuario, String senha) {
        super(cpf, nome, endereco, email, sexo, estadoCivil, profissao);
        this.telefoneCelular = telefoneCelular;
        this.dataIngresso = dataIngresso;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.totalComissao = 0;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTotalComissao(double totalComissao) {
        this.totalComissao = totalComissao;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void adicionarComissao(double valorComissao) {
        this.totalComissao += valorComissao;
    }

    public double calcularSalarioTotal() {
        return salarioBase + totalComissao;
    }

    public double getTotalComissao() { return totalComissao; }
    public String getUsuario() { return usuario; }

    public boolean autenticar(String usuario, String senha) {
        return this.usuario.equals(usuario) && this.senha.equals(senha);
    }
}
