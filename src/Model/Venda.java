package Model;

import java.util.Vector;

public class Venda {

    // ATRIBUTOS

    private String dataVenda;
    private Vector<Roupas> carrinhoRoupas;

    // CONSTRUTOR
    public Venda() {

    }

    public Venda(String dataVenda, Vector<Roupas> carrinhoRoupas) {
        this.setDataVenda(dataVenda);
        this.setCarrinhoRoupas(carrinhoRoupas);

    }

    // encapsulamento

    public Vector<Roupas> getCarrinhoRoupas() {
        return carrinhoRoupas;
    }

    public void setCarrinhoRoupas(Vector<Roupas> carrinhoRoupas) {
        this.carrinhoRoupas = carrinhoRoupas;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

}
