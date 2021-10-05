package br.com.sorveteria.testeValidacao;

import br.com.sorveteria.objetos.Produtos;
import br.com.sorveteria.validacao.ValidacaoProdutos;
import org.junit.Test;
import org.junit.Assert;

public class ValidacaoProdutosTest {

    @Test
    public void deveRetornarTrueSeOProdutoFoiCadastrado(){

        Produtos novoProduto = new Produtos();
        novoProduto.setIdProduto(1);
        novoProduto.setTipo("Sorvete");
        novoProduto.setQuantidade(10);
        novoProduto.setSabor("Morango");
        novoProduto.setValorCompra(10);
        novoProduto.setValorVenda(20);

        ValidacaoProdutos validarProduto = new ValidacaoProdutos();

        boolean produtoCadastrado = validarProduto.validarProduto(novoProduto);

        Assert.assertTrue(produtoCadastrado);
    }
}
