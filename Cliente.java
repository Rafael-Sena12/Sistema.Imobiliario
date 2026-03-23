package imobiliaria;

public abstract class Cliente extends Pessoa {
    public Cliente(String cpf, String nome, Endereco endereco, String email,
                   String sexo, String estadoCivil, String profissao) {
        super(cpf, nome, endereco, email, sexo, estadoCivil, profissao);
    }
}