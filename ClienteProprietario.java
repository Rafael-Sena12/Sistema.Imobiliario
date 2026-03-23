package imobiliaria;

public class ClienteProprietario extends Cliente {
    public ClienteProprietario(String cpf, String nome, Endereco endereco, String email,
                               String sexo, String estadoCivil, String profissao) {
        super(cpf, nome, endereco, email, sexo, estadoCivil, profissao);
    }
}