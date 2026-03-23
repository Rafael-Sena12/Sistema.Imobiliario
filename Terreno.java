package imobiliaria;

import java.time.LocalDate;

public class Terreno extends Imovel {
    protected double largura;
    protected double comprimento;
    protected String acliveDeclive;

    public Terreno(String codigo, Endereco endereco, LocalDate dataConstrucao,
                   double valorSugerido, ClienteProprietario proprietario,
                   double area, double largura, double comprimento, String acliveDeclive) {
        super(codigo, endereco, dataConstrucao, valorSugerido, proprietario);
        this.area = area;
        this.largura = largura;
        this.comprimento = comprimento;
        this.acliveDeclive = acliveDeclive;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public String getAcliveDeclive() {
        return acliveDeclive;
    }

    public void setAcliveDeclive(String acliveDeclive) {
        this.acliveDeclive = acliveDeclive;
    }

    @Override
    public double calcularComissao() {
        return valorReal * 0.04;
    }
}