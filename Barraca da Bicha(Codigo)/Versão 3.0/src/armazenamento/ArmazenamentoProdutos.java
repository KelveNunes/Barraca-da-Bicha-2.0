package armazenamento;

import objetos.Produtos;

import java.util.ArrayList;

public class ArmazenamentoProdutos {

    private static ArmazenamentoProdutos instance;
    private ArrayList<Produtos> produtosCadastrados;

    private ArmazenamentoProdutos(){
        produtosCadastrados = new ArrayList<Produtos>();
    }

    public static ArmazenamentoProdutos getInstance(){
        if (instance==null){
            instance = new ArmazenamentoProdutos();
        }
        return instance;
    }

    public void cadastrarProduto(Produtos novoProduto){
        produtosCadastrados.add(novoProduto);
    }
    public ArrayList<Produtos> produtosCadastrados(){
        return produtosCadastrados;
    }

}
