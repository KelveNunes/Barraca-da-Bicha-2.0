package br.com.sorveteria.armazenamento;

import br.com.sorveteria.objetos.Clientes;

import java.util.ArrayList;

//Padrão Singleton tem como definição garantir que uma classe tenha apenas uma instância de si mesma e que forneça um ponto global de acesso a ela;

public class ArmazenamentoClientes {
    private static ArmazenamentoClientes instance;
    private ArrayList<Clientes> clientesCadastrados;


    public static ArmazenamentoClientes getInstance(){
        if (instance==null){
            instance = new ArmazenamentoClientes();
        }
        return instance;
    }
    private ArmazenamentoClientes(){
        clientesCadastrados = new ArrayList<Clientes>();
    }
    public void armazenamentoClientes(Clientes novoCliente){
        clientesCadastrados.add(novoCliente);
    }
    public ArrayList<Clientes> clientesCadastrados(){
        return clientesCadastrados;
    }

}
