package br.com.sorveteria.validacao;

import br.com.sorveteria.armazenamento.ArmazenamentoClientes;
import br.com.sorveteria.objetos.Clientes;

public class ValidacaoClientes {
    public boolean validarCliente(Clientes novoCliente){
        boolean resultado = false;
        if (novoCliente != null && novoCliente.getNome() != "" && novoCliente.getEndereco() != ""){
            novoCliente.setIdCliente(ArmazenamentoClientes.getInstance().clientesCadastrados().size());
            ArmazenamentoClientes.getInstance().armazenamentoClientes(novoCliente);
            resultado = true;
        }
        return resultado;
    }

}
