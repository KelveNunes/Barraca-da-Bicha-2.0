package controle;

import java.util.ArrayList;
import objetos.Clientes;
import objetos.Fornecedores;
import objetos.Produtos;

public class ArmazenamentoDeDados {

    //singleton:permite criar objetos únicos para os quais há apenas uma instância

    private static ArmazenamentoDeDados instance;
    private ArrayList<Clientes> clientesCadastrados;
    private ArrayList<Produtos> produtosCadastrados;
    private ArrayList<Fornecedores> fornecedoresCadastrados;

    private ArmazenamentoDeDados(){
        clientesCadastrados = new ArrayList<Clientes>();
    }

    public static ArmazenamentoDeDados getInstance(){
        if (instance==null){
            instance = new ArmazenamentoDeDados();
        }
        return instance;
    }

    public void cadastrarCliente(Clientes novoCliente){
        clientesCadastrados.add(novoCliente);
    }
    public ArrayList<Clientes> clientesCadastrados(){
        return clientesCadastrados;
    }

    public void cadastrarProduto(Produtos novoProduto){
        produtosCadastrados.add(novoProduto);
    }
    public ArrayList<Produtos> produtosCadastrados(){
        return produtosCadastrados;
    }

    public void cadastrarFornecedor(Fornecedores novoFornecedor){
        fornecedoresCadastrados.add(novoFornecedor);
    }
    public ArrayList<Fornecedores> fornecedoresCadastrados(){
        return fornecedoresCadastrados;
    }

}
