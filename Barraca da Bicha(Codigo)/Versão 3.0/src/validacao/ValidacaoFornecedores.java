package validacao;
import armazenamento.ArmazenamentoFornecedores;
import objetos.Fornecedores;

public class ValidacaoFornecedores {
    public boolean cadastrarFornecedor(Fornecedores novoFornecedor){
        boolean resultado = false;
        if (novoFornecedor != null && novoFornecedor.getNome()!=null && novoFornecedor.getContato()!=null){
            ArmazenamentoFornecedores.getInstance().cadastrarFornecedor(novoFornecedor);
            resultado = true;
        }
        return resultado;
    }
}
