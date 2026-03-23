package imobiliaria;

import java.time.LocalDate;

public class Terreno extends Imovel {
    private double area;
    private double largura;
    private double comprimento;
    private String acliveDeclive;

    public Terreno(String codigo, Endereco endereco, LocalDate dataConstrucao,
                   double valorSugerido, ClienteProprietario proprietario,
                   double area, double largura, double comprimento, String acliveDeclive) {
        super(codigo, endereco, dataConstrucao, valorSugerido, proprietario);
        this.area = area;
        this.largura = largura;
        this.comprimento = comprimento;
        this.acliveDeclive = acliveDeclive;
    }

    @Override
    public double calcularComissao() {
        return valorReal * 0.04;
    }
}