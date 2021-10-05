package validacao;

import armazenamento.ArmazenamentoProdutos;
import objetos.Produtos;

public class ValidacaoProdutos {
    public boolean cadastrarProduto(Produtos novoProduto){
        boolean resultado = false;
        if (novoProduto!=null && novoProduto.getTipo() != null && novoProduto.getSabor() != null
                && novoProduto.getValorVenda() > 0 && novoProduto.getValorCompra() > 0 && novoProduto.getQuantidade() > 0){
            ArmazenamentoProdutos.getInstance().cadastrarProduto(novoProduto);
            resultado = true;
        }
        return resultado;
    }
}
