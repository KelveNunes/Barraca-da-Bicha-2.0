package com.company;

import com.company.Cadastros.Cadastrar;
import com.company.Cadastros.Produtos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Produtos produto = new Produtos();
        ArrayList<Produtos> estoque = new ArrayList<>();

        Produtos produto1 = produto.clonar();
        produto1.setSabor("morango");
        produto1.setTipo("sorvete");
        produto1.setValorCompra(10);
        produto1.setValorVenda(30);
        produto1.setQuantidade(10);
        estoque.add(produto1);
        produto1.informacoes();
        produto1.verificarEstoque(estoque);








    }
}
