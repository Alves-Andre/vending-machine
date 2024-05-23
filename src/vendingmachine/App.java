// 
/**
 * The `pacote` package contains classes related to the vending machine application.
 */
package vendingmachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);        

        //Sistema de uma máquina de venda automática
        //Criação de objetos da classe Produto
        Produto produto1 = new Produto("Coca-Cola", 5, 10, 1);
        Produto produto2 = new Produto("Pepsi", 5, 10, 2);
        Produto produto3 = new Produto("Fanta", 5, 10, 3);
        Produto produto4 = new Produto("Guaraná", 5, 10, 4);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        //Criação de um objeto da classe Máquina
        Maquina maquina = new Maquina(0, produtos);

        while (true) {
            System.out.println("Bem-vindo à máquina de venda automática!");
            maquina.listarProdutos();
            System.out.println("Selecione o produto desejado:");
            //usuário digita o codigo do produto e armazena na variavel escolga
            Integer escolha = input.nextInt();

            if (maquina.encontrarProduto(escolha) == null) {
                System.out.println("Produto não encontrado!");
                continue;
            }

            System.out.println("Insira a quantidade: ");
            Integer quantidade = input.nextInt();
            System.out.println("Insira o valor do dinheiro:");
            Integer dinheiro = input.nextInt();


             
            //chama o método comprarProduto da classe Maquina
            maquina.comprarProduto(escolha, quantidade, dinheiro);

            System.out.println("Deseja comprar outro produto? (S/N)");
            String opcao = input.next();
            if (opcao.toUpperCase().equals("N")) {
                break;
            }
        }
    }
}
