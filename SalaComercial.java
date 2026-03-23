package imobiliaria;

import java.time.LocalDate;

public class SalaComercial extends Imovel {
    protected int banheiros;
    protected int comodos;

    public SalaComercial(String codigo, Endereco endereco, LocalDate dataConstrucao,
                         double valorSugerido, ClienteProprietario proprietario,
                         double area, int banheiros, int comodos) {
        super(codigo, endereco, dataConstrucao, valorSugerido, proprietario);
        this.area = area;
        this.banheiros = banheiros;
        this.comodos = comodos;
    }

    public int getBanheiros() {
        return banheiros;
    }

    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }

    public int getComodos() {
        return comodos;
    }

    public void setComodos(int comodos) {
        this.comodos = comodos;
    }

    @Override
    public double calcularComissao() {
        return valorReal * 0.07;
    }
}