package controle;
import objetos.Clientes;
import objetos.Fornecedores;
import objetos.Produtos;

public class ValidacaoDeDados {

    public boolean cadastrarCliente(Clientes novoCliente){
        boolean resultado = false;
        if (novoCliente != null && novoCliente.getNome() != null && novoCliente.getEndereco() !=null){
            ArmazenamentoDeDados.getInstance().cadastrarCliente(novoCliente);
            resultado = true;
        }
        return resultado;
    }

    public boolean cadastrarProduto(Produtos novoProduto){
        boolean resultado = false;
        if (novoProduto != null && novoProduto.getSabor()!="" && novoProduto.getTipo()!=""&&novoProduto.getValorCompra()>0 && novoProduto.getValorVenda()>0){
            ArmazenamentoDeDados.getInstance().cadastrarProduto(novoProduto);
            resultado = true;
        }
        return resultado;
    }

    public boolean cadastrarFornecedor(Fornecedores novoFornecedor){
        boolean resultado = false;
        if (novoFornecedor != null && novoFornecedor.getNome()!=null && novoFornecedor.getContato()!=null){
            ArmazenamentoDeDados.getInstance().cadastrarFornecedor(novoFornecedor);
            resultado = true;
        }
        return resultado;
    }
}
