package com.company.Cadastros;

import java.util.ArrayList;

public abstract class Cadastrar{

    //protected ArrayList<Clientes> listaClientes;
    protected ArrayList<Produtos> listaProdutos;
    //protected ArrayList<Fornecedores> listaFornecedores;

    //public abstract void cadastrarClientes(Clientes clientes);
    public abstract void cadastrarProdutos(Produtos produtos);
    //public abstract void cadastrarFornecedores(Fornecedores fornecedores);
    public abstract void clonar();
}
