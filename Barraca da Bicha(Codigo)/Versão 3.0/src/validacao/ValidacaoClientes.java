package validacao;

import armazenamento.ArmazenamentoClientes;
import objetos.Clientes;

public class ValidacaoClientes {
    public boolean cadastrarCliente(Clientes novoCliente){
        boolean resultado = false;
        if (novoCliente != null && novoCliente.getNome() != null && novoCliente.getEndereco() != null){
            ArmazenamentoClientes.getInstance().armazenamentoClientes(novoCliente);
            resultado = true;
        }
        return resultado;
    }
}
