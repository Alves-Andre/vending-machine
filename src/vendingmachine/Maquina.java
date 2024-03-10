package vendingmachine;
import java.util.List;

public class Maquina {
    private int saldoMaquina;
    private List<Produto> produtos;


    public Maquina(int saldoMaquina, List<Produto> produtos) {
        this.saldoMaquina = saldoMaquina;
        this.produtos = produtos;
    }

    public int getSaldoMaquina() {
        return saldoMaquina;
    }

    public void setSaldoMaquina(int saldoMaquina) {
        this.saldoMaquina = saldoMaquina;
    }

    public void adicionarSaldoMaquina(int saldo) {
        this.saldoMaquina += saldo;
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.getCodigo()+ " - " + produto.getNome() + " - R$" + produto.getPreco() + ",00  " + "| qtd - " + produto.getQuantidade());
        }
    }

    public boolean comprarProduto(int codigo, int quantidade, int cedula) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                if (produto.getQuantidade() > 0) {
                    if (cedula >= produto.getPreco()*quantidade) {
                        produto.removerProduto(quantidade);
                        saldoMaquina += produto.getPreco()*quantidade;
                        System.out.println("Compra realizada com sucesso!");
                        System.out.println("Seu troco é de R$" + (cedula - produto.getPreco()*quantidade) + ",00;");
                        return true;
                    } else {
                        System.out.println("Dinheiro insuficiente!");
                        return true;
                    }
                } else {
                    System.out.println("Produto indisponível!");
                    return true;
                }
            }
        }
        return false;
    }

    public Produto encontrarProduto(int codigo) {
        for (Produto produto : this.produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }
}
