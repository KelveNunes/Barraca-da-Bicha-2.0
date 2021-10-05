package br.com.sorveteria.testeValidacao;

import br.com.sorveteria.objetos.Clientes;
import br.com.sorveteria.validacao.ValidacaoClientes;
import org.junit.Test;
import org.junit.Assert;


public class ValidacaoClientesTest {


    @Test
    public void deveRetornarTrueSeOClienteFoiCadastrado() {
        Clientes novoCliente = new Clientes();
        novoCliente.setIdCliente(1);
        novoCliente.setNome("kelve");
        novoCliente.setEndereco("casa");
        novoCliente.setDividas(25);
        novoCliente.setCartaoFidelidade(2);

        ValidacaoClientes validarCliente = new ValidacaoClientes();

        boolean clienteCadastrado = validarCliente.validarCliente(novoCliente);

        Assert.assertTrue(clienteCadastrado);

    }
}
