package imobiliaria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaImobiliario {
    private static List<Imovel> imoveis = new ArrayList<>();
    private static List<ClienteProprietario> proprietarios = new ArrayList<>();
    private static List<ClienteUsuario> usuarios = new ArrayList<>();
    private static List<Funcionario> funcionarios = new ArrayList<>();
    private static List<Transacao> transacoes = new ArrayList<>();
    private static int proximoContrato = 1;
    private static Scanner scanner = new Scanner(System.in);
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        inicializarDadosTeste();

        int opcao;
        do {
            IO.print("  SISTEMA IMOBILIÁRIO ");
            IO.print("1. Cadastrar Proprietário");
            IO.print("2. Cadastrar Cliente Usuário");
            IO.print("3. Cadastrar Funcionário");
            IO.print("4. Cadastrar Imóvel");
            IO.print("5. Listar Imóveis Disponíveis");
            IO.print("6. Realizar Venda");
            IO.print("7. Realizar Aluguel");
            IO.print("8. Listar Transações");
            IO.print("9. Calcular Comissões");
            IO.print("0. Sair");
            IO.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    cadastrarProprietario();
                    break;
                case 2:
                    cadastrarClienteUsuario();
                    break;
                case 3:
                    cadastrarFuncionario();
                    break;
                case 4:
                    cadastrarImovel();
                    break;
                case 5:
                    listarImoveisDisponiveis();
                    break;
                case 6:
                    realizarVenda();
                    break;
                case 7:
                    realizarAluguel();
                    break;
                case 8:
                    listarTransacoes();
                    break;
                case 9:
                    calcularComissoes();
                    break;
                case 0:
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);
    }

    private static void calcularComissoes() {
    }

    private static void listarTransacoes() {
    }

    private static void inicializarDadosTeste() {
    }

    private static void cadastrarProprietario() {
        IO.println(" CADASTRO DE PROPRIETÁRIO ");

        IO.print("CPF: ");
        String cpf = scanner.nextLine();
        IO.print("Nome: ");
        String nome = scanner.nextLine();
        IO.print("Email: ");
        String email = scanner.nextLine();
        IO.print("Sexo: ");
        String sexo = scanner.nextLine();
        IO.print("Estado Civil: ");
        String estadoCivil = scanner.nextLine();
        IO.print("Profissão: ");
        String profissao = scanner.nextLine();

        Endereco endereco = cadastrarEndereco();

        ClienteProprietario proprietario = new ClienteProprietario(cpf, nome, endereco, email,
                sexo, estadoCivil, profissao);

        IO.println("Telefone para contato: ");
        String telefone = scanner.nextLine();
        proprietario.adicionarTelefone(telefone);

        proprietarios.add(proprietario);
        IO.println("Proprietário cadastrado com sucesso!");
    }

    private static void cadastrarClienteUsuario() {
        IO.println("CADASTRO DE CLIENTE USUÁRIO");

        IO.print("CPF: ");
        String cpf = scanner.nextLine();
        IO.print("Nome: ");
        String nome = scanner.nextLine();
        IO.print("Email: ");
        String email = scanner.nextLine();
        IO.print("Sexo: ");
        String sexo = scanner.nextLine();
        IO.print("Estado Civil: ");
        String estadoCivil = scanner.nextLine();
        IO.print("Profissão: ");
        String profissao = scanner.nextLine();

        Endereco endereco = cadastrarEndereco();

        ClienteUsuario usuario = new ClienteUsuario(cpf, nome, endereco, email,
                sexo, estadoCivil, profissao);

        IO.print("Telefone para contato: ");
        String telefone = scanner.nextLine();
        usuario.adicionarTelefone(telefone);

        IO.print("Fiador (mínimo 1): ");
        String fiador = scanner.nextLine();
        usuario.adicionarFiador(fiador);

        IO.print("Indicação 1: ");
        String indicacao1 = scanner.nextLine();
        usuario.adicionarIndicacao(indicacao1);
        IO.print("Indicação 2: ");
        String indicacao2 = scanner.nextLine();
        usuario.adicionarIndicacao(indicacao2);

        usuarios.add(usuario);
        IO.println("Cliente usuário foi cadastrado!");
    }

    private static void cadastrarFuncionario() {
        IO.println(" CADASTRO DE FUNCIONÁRIO ");

        IO.print("CPF: ");
        String cpf = scanner.nextLine();
        IO.print("Nome: ");
        String nome = scanner.nextLine();
        IO.print("Email: ");
        String email = scanner.nextLine();
        IO.print("Sexo: ");
        String sexo = scanner.nextLine();
        IO.print("Estado Civil: ");
        String estadoCivil = scanner.nextLine();
        IO.print("Profissão: ");
        String profissao = scanner.nextLine();

        Endereco endereco = cadastrarEndereco();

        IO.print("Telefone Celular: ");
        String celular = scanner.nextLine();
        IO.print("Data Ingresso (dd/MM/yyyy): ");
        LocalDate dataIngresso = LocalDate.parse(scanner.nextLine(), formatter);
        IO.print("Cargo: ");
        String cargo = scanner.nextLine();
        IO.print("Salário Base: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine();
        IO.print("Usuário para login: ");
        String usuario = scanner.nextLine();
        IO.print("Senha: ");
        String senha = scanner.nextLine();

        Funcionario funcionario = new Funcionario(cpf, nome, endereco, email, sexo,
                estadoCivil, profissao, celular,
                dataIngresso, cargo, salarioBase,
                usuario, senha);

        IO.print("Telefone contato: ");
        String telefone = scanner.nextLine();
        funcionario.adicionarTelefone(telefone);

        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static Endereco cadastrarEndereco() {
        IO.println("Endereço");
        String endereco = scanner.nextLine();
        IO.print("Logradouro: ");
        String logradouro = scanner.nextLine();
        IO.print("Número: ");
        String numero = scanner.nextLine();
        IO.print("Complemento: ");
        String complemento = scanner.nextLine();
        IO.print("Bairro: ");
        String bairro = scanner.nextLine();
        IO.print("Cidade: ");
        String cidade = scanner.nextLine();
        IO.print("CEP: ");
        String cep = scanner.nextLine();

        return new Endereco(logradouro, numero, complemento, bairro, cidade, cep);
    }

    private static void cadastrarImovel() {
        if(proprietarios.isEmpty()) {
            IO.println("Cadastre um proprietário primeiro!");
            return;
        }

        IO.println(" CADASTRO DE IMÓVEL ");
        IO.println("Tipos de Imóvel:");
        IO.println("1. Casa");
        IO.println("2. Apartamento");
        IO.println("3. Sala Comercial");
        IO.println("4. Terreno");
        IO.print("Escolha o tipo: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        IO.print("Código do imóvel: ");
        String codigo = scanner.nextLine();

        Endereco endereco = cadastrarEndereco();

        IO.print("Data de construção (dd/MM/yyyy): ");
        LocalDate dataConstrucao = LocalDate.parse(scanner.nextLine(), formatter);

        IO.print("Valor sugerido: R$ ");
        double valorSugerido = scanner.nextDouble();
        scanner.nextLine();

        IO.println("Proprietários disponíveis:");
        for(int i = 0; i < proprietarios.size(); i++) {
            IO.println(i + " - " + proprietarios.get(i).getNome());
        }
        IO.print("Escolha o proprietário: ");
        int idxProp = scanner.nextInt();
        scanner.nextLine();
        ClienteProprietario proprietario = proprietarios.get(idxProp);

        Imovel imovel = null;

        switch(tipo) {
            case 1:
                imovel = cadastrarCasa(codigo, endereco, dataConstrucao, valorSugerido, proprietario);
                break;
            case 2:
                imovel = cadastrarApartamento(codigo, endereco, dataConstrucao, valorSugerido, proprietario);
                break;
            case 3:
                imovel = cadastrarSalaComercial(codigo, endereco, dataConstrucao, valorSugerido, proprietario);
                break;
            case 4:
                imovel = cadastrarTerreno(codigo, endereco, dataConstrucao, valorSugerido, proprietario);
                break;
            default:
                System.out.println("Tipo inválido!");
                return;
        }

        if(imovel != null) {
            imoveis.add(imovel);
            IO.println("Imóvel cadastrado com sucesso!");
        }
    }

    private static Casa cadastrarCasa(String codigo, Endereco endereco, LocalDate dataConstrucao,
                                      double valorSugerido, ClienteProprietario proprietario) {
        IO.println(" Dados da Casa ");
        IO.print("Quantidade de quartos: ");
        int quartos = scanner.nextInt();
        IO.print("Quantidade de suítes: ");
        int suites = scanner.nextInt();
        IO.print("Quantidade de salas de estar: ");
        int salasEstar = scanner.nextInt();
        IO.print("Quantidade de salas de jantar: ");
        int salasJantar = scanner.nextInt();
        IO.print("Número de vagas na garagem: ");
        int vagas = scanner.nextInt();
        IO.print("Área (m²): ");
        double area = scanner.nextDouble();
        IO.print("Possui armário embutido (true/false): ");
        boolean armario = scanner.nextBoolean();
        scanner.nextLine();
        IO.print("Descrição: ");
        String descricao = scanner.nextLine();

        return new Casa(codigo, endereco, dataConstrucao, valorSugerido, proprietario,
                quartos, suites, salasEstar, salasJantar, vagas, area, armario, descricao);
    }

    private static Apartamento cadastrarApartamento(String codigo, Endereco endereco,
                                                    LocalDate dataConstrucao, double valorSugerido,
                                                    ClienteProprietario proprietario) {
        IO.println(" Dados do Apartamento ");
        IO.print("Quantidade de quartos: ");
        int quartos = scanner.nextInt();
        IO.print("Quantidade de suítes: ");
        int suites = scanner.nextInt();
        IO.print("Quantidade de salas de estar: ");
        int salasEstar = scanner.nextInt();
        IO.print("Quantidade de salas de jantar: ");
        int salasJantar = scanner.nextInt();
        IO.print("Número de vagas na garagem: ");
        int vagas = scanner.nextInt();
        IO.print("Área (m²): ");
        double area = scanner.nextDouble();
        IO.print("Possui armário embutido (true/false): ");
        boolean armario = scanner.nextBoolean();
        IO.print("Andar: ");
        int andar = scanner.nextInt();
        IO.print("Valor do condomínio: R$ ");
        double valorCondominio = scanner.nextDouble();
        IO.print("Portaria 24h (true/false): ");
        boolean portaria = scanner.nextBoolean();
        scanner.nextLine();
        IO.print("Descrição: ");
        String descricao = scanner.nextLine();

        return new Apartamento(codigo, endereco, dataConstrucao, valorSugerido, proprietario,
                quartos, suites, salasEstar, salasJantar, vagas, area, armario,
                descricao, andar, valorCondominio, portaria);
    }

    private static SalaComercial cadastrarSalaComercial(String codigo, Endereco endereco,
                                                        LocalDate dataConstrucao, double valorSugerido,
                                                        ClienteProprietario proprietario) {
        IO.println(" Dados da Sala Comercial");
        IO.println("Área (m²): ");
        double area = scanner.nextDouble();
        IO.println("Quantidade de banheiros: ");
        int banheiros = scanner.nextInt();
        IO.println("Quantidade de cômodos: ");
        int comodos = scanner.nextInt();
        scanner.nextLine();

        return new SalaComercial(codigo, endereco, dataConstrucao, valorSugerido,
                proprietario, area, banheiros, comodos);
    }

    private static Terreno cadastrarTerreno(String codigo, Endereco endereco,
                                            LocalDate dataConstrucao, double valorSugerido,
                                            ClienteProprietario proprietario) {
        IO.println("Dados do Terreno ");
        IO.println("Área (m²): ");
        double area = scanner.nextDouble();
        IO.println("Largura (m): ");
        double largura = scanner.nextDouble();
        IO.println("Comprimento (m): ");
        double comprimento = scanner.nextDouble();
        scanner.nextLine();
        IO.println("Possui aclive/declive: ");
        String acliveDeclive = scanner.nextLine();

        return new Terreno(codigo, endereco, dataConstrucao, valorSugerido,
                proprietario, area, largura, comprimento, acliveDeclive);
    }

    private static void listarImoveisDisponiveis() {
        IO.println(" IMÓVEIS DISPONÍVEIS ");
        for(Imovel imovel : imoveis) {
            if(imovel.getStatus() == StatusImovel.DISPONIVEL_VENDA ||
                    imovel.getStatus() == StatusImovel.DISPONIVEL_LOCACAO) {
                IO.println(imovel);
            }
        }
    }

    private static void realizarVenda() {
        IO.println(" REALIZAR VENDA ");

        List<Imovel> imoveisVenda = new ArrayList<>();
        for(Imovel imovel : imoveis) {
            if(imovel.getStatus() == StatusImovel.DISPONIVEL_VENDA) {
                imoveisVenda.add(imovel);
            }
        }

        if(imoveisVenda.isEmpty()) {
            IO.println("Nenhum imóvel disponível para venda!");
            return;
        }

        IO.println("Imóveis disponíveis para venda:");
        for(int i = 0; i < imoveisVenda.size(); i++) {
            IO.println(i + " - " + imoveisVenda.get(i));
        }
        IO.println("Escolha o imóvel: ");
        int idxImovel = scanner.nextInt();
        scanner.nextLine();
        Imovel imovel = imoveisVenda.get(idxImovel);


        if(usuarios.isEmpty()) {
            IO.println("Nenhum cliente usuário cadastrado!");
            return;
        }

        IO.println("Clientes usuários:");
        for(int i = 0; i < usuarios.size(); i++) {
            IO.println(i + " - " + usuarios.get(i).getNome());
        }
        IO.println("Escolha o cliente: ");
        int idxCliente = scanner.nextInt();
        scanner.nextLine();
        ClienteUsuario cliente = usuarios.get(idxCliente);

        if(funcionarios.isEmpty()) {
            IO.println("Nenhum funcionário cadastrado!");
            return;
        }

        IO.println("Funcionários:");
        for(int i = 0; i < funcionarios.size(); i++) {
            IO.println(i + " - " + funcionarios.get(i).getNome());
        }
        IO.println("Escolha o funcionário: ");
        int idxFunc = scanner.nextInt();
        scanner.nextLine();
        Funcionario funcionario = funcionarios.get(idxFunc);

        IO.println("Valor real da venda: R$ ");
        double valorReal = scanner.nextDouble();
        scanner.nextLine();
        IO.println("Forma de pagamento: ");
        String formaPagamento = scanner.nextLine();
        IO.println("Data da transação (dd/MM/yyyy): ");
        LocalDate dataTransacao = LocalDate.parse(scanner.nextLine(), formatter);

        Venda venda = new Venda(proximoContrato++, imovel, cliente, funcionario,
                dataTransacao, formaPagamento, valorReal);

        imovel.realizarTransacao(valorReal, valorReal * 0.1, dataTransacao, StatusImovel.VENDIDO);
        venda.finalizarTransacao();
        transacoes.add(venda);

        IO.println("Venda realizada com sucesso!");
        IO.println("Comissão do funcionário: R$ " + venda.comissaoFuncionario);
    }

    private static void realizarAluguel() {
        IO.println(" REALIZAR ALUGUEL ");

        List<Imovel> imoveisLocacao = new ArrayList<>();
        for(Imovel imovel : imoveis) {
            if(imovel.getStatus() == StatusImovel.DISPONIVEL_LOCACAO) {
                imoveisLocacao.add(imovel);
            }
        }

        if(imoveisLocacao.isEmpty()) {
            IO.println("Nenhum imóvel disponível para locação!");
            return;
        }

        IO.println("Imóveis disponíveis para locação:");
        for(int i = 0;;) {
        }
    }
}