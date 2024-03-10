package vendingmachine;

public class Produto {
    private String nome;
    private int preco;
    private int quantidade;
    private int codigo;

    public Produto(String nome, int preco, int quantidade, int codigo) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
}
