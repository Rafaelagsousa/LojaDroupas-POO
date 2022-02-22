package Model;

public class Cliente {

    // ATRIBUTOS
    private String nome;
    private String endereco;
    private String telefone;

    // CONSTRUTOR
    public Cliente() {

    }

    public Cliente(String nome, String endereco, String telefone) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }

    // ENCAPSULAMENTO
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
