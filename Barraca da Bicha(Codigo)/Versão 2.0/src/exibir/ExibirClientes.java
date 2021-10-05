package exibir;

import controle.ArmazenamentoDeDados;
import objetos.Clientes;
import java.util.ArrayList;

public class ExibirClientes {
    public void clientesCadastrados(){
        ArrayList<Clientes> lista = ArmazenamentoDeDados.getInstance().clientesCadastrados();

        if (lista.size() == 0) {
            System.out.println("Nenhum Cliente Cadastrado");
        }else {
            System.out.println("CLIENTES CADASTRADOS");

            for (int i = 0; i < lista.size(); i++) {
            Clientes novo = lista.get(i);
            System.out.println("---------------------------------------");
            System.out.println("Nome: "+novo.getNome());
            System.out.println("Pontos: "+novo.getCartaoFidelidade());
            System.out.println("Dividas: "+novo.getDividas());
            System.out.println("Endereço: "+novo.getEndereco());
            System.out.println("---------------------------------------");
            }
        }
    }
}
