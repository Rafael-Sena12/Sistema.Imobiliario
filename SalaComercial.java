package imobiliaria;

import java.time.LocalDate;

public class SalaComercial extends Imovel {
    private double area;
    private int banheiros;
    private int comodos;

    public SalaComercial(String codigo, Endereco endereco, LocalDate dataConstrucao,
                         double valorSugerido, ClienteProprietario proprietario,
                         double area, int banheiros, int comodos) {
        super(codigo, endereco, dataConstrucao, valorSugerido, proprietario);
        this.area = area;
        this.banheiros = banheiros;
        this.comodos = comodos;
    }

    @Override
    public double calcularComissao() {
        return valorReal * 0.07;
    }
}