package test;
import org.junit.Test;

import vendingmachine.Maquina;
import vendingmachine.Produto;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestMachine {

    @Test
    public void testeCompraComSaldo() {
        Produto produto1 = new Produto("Coca-Cola", 5, 10, 1);
        Produto produto2 = new Produto("Pepsi", 5, 10, 2);
        Produto produto3 = new Produto("Fanta", 5, 10, 3);
        Produto produto4 = new Produto("Guaraná", 5, 10, 4);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        Maquina maquina = new Maquina(0, produtos);

        //testando comprar refrigerante com saldo suficiente

        maquina.comprarProduto(1, 1, 5);
        assertEquals(5, maquina.getSaldoMaquina());
        assertEquals(9, maquina.encontrarProduto(1).getQuantidade());
        assertEquals(5, maquina.getSaldoMaquina());


    }
    @Test
    public void testeCompraSemSaldo() {
        Produto produto1 = new Produto("Coca-Cola", 5, 10, 1);
        Produto produto2 = new Produto("Pepsi", 5, 10, 2);
        Produto produto3 = new Produto("Fanta", 5, 10, 3);
        Produto produto4 = new Produto("Guaraná", 5, 10, 4);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        Maquina maquina = new Maquina(0, produtos);

        //testando comprar refrigerante com saldo insuficiente

        maquina.comprarProduto(1, 1, 4);
        assertEquals(0, maquina.getSaldoMaquina());
        assertEquals(10, maquina.encontrarProduto(1).getQuantidade());
        assertEquals(0, maquina.getSaldoMaquina());
    }
}

