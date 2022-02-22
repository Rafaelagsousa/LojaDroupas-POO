package Model;

public class Roupas {

    //Atributos
    private String marca;
    private String nome;
    private String tamanho;
    private double preco;

    //Construtor
    public Roupas() {

    }

    public Roupas(String marca, String nome, String tamanho, double preco) {
        this.setMarca(marca);
        this.setNome(nome);
        this.setTamanho(tamanho);
        this.setPreco(preco);
    }


    //Encapsulamento
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
