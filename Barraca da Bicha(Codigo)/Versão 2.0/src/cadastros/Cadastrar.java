package cadastros;

import objetos.Produtos;
import objetos.Clientes;
import objetos.Fornecedores;

import java.util.ArrayList;

public abstract class Cadastrar{

    protected ArrayList<objetos.Clientes> listaClientes;
    protected ArrayList<Produtos> listaProdutos;
    protected ArrayList<Fornecedores> listaFornecedores;

    public abstract void cadastrarClientes(objetos.Clientes clientes);
    public abstract void cadastrarProdutos(Produtos produtos);
    public abstract void cadastrarFornecedores(Fornecedores fornecedores);
    public abstract void clonar();
}

