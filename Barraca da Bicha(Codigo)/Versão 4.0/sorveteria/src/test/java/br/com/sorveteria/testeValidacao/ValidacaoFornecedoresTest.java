package br.com.sorveteria.testeValidacao;


import br.com.sorveteria.objetos.Fornecedores;
import br.com.sorveteria.objetos.Produtos;
import br.com.sorveteria.validacao.ValidacaoFornecedores;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;

public class ValidacaoFornecedoresTest {

    @Test
    public void deveRetornarTrueSeOFornecedorFoiCadastrado() {
        ArrayList<Produtos>produtos = new ArrayList<>();
        Fornecedores novoFornecedor = new Fornecedores();
        novoFornecedor.setContato("999999999");
        novoFornecedor.setNome("kelve");
        novoFornecedor.setIdForenecedores(1);
        novoFornecedor.setProdutosDisponiveis(produtos);

        ValidacaoFornecedores validarFornecedores = new ValidacaoFornecedores();

        boolean fornecedorCadastrado = validarFornecedores.validarFornecedor(novoFornecedor);

        Assert.assertTrue(fornecedorCadastrado);

    }
}
