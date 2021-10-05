package armazenamento;

import objetos.Clientes;

import java.util.ArrayList;

public class ArmazenamentoClientes {
    private static ArmazenamentoClientes instance;
    private ArrayList<Clientes> clientesCadastrados;

    private ArmazenamentoClientes(){
        clientesCadastrados = new ArrayList<Clientes>();
    }

    public static ArmazenamentoClientes getInstance(){
        if (instance==null){
            instance = new ArmazenamentoClientes();
        }
        return instance;
    }

    public void armazenamentoClientes(Clientes novoCliente){
        clientesCadastrados.add(novoCliente);
    }
    public ArrayList<Clientes> clientesCadastrados(){
        return clientesCadastrados;
    }

}
