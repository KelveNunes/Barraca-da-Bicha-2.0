package barracaDaBicha;

import armazenamento.ArmazenamentoClientes;
import armazenamento.ArmazenamentoProdutos;
import cadastros.CadastrarCliente;
import cadastros.CadastrarFornecedor;
import cadastros.CadastrarProduto;
import exibir.ExibirClientes;
import exibir.ExibirFornecedores;
import exibir.ExibirProdutos;
import objetos.Clientes;
import objetos.Produtos;
import vendas.RegistarVendas;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int escolha=-1;
    Scanner s = new Scanner(System.in);
    public void menu(){
        do {
            System.out.println("-------BARRACA DA BICHA-------");
            System.out.println("1.Cadastrar Clientes");
            System.out.println("2.Ver Clientes Cadastrados");
            System.out.println("3.Cadastrar Fornecedor");
            System.out.println("4.Ver Fornecedores");
            System.out.println("5.Cadastrar Produtos");
            System.out.println("6.Produtos Em Estoque");
            System.out.println("7. Realizar Vendas");
            System.out.println("0.Sair");
            escolha = s.nextInt();
            switch (escolha){
                case 1:
                    CadastrarCliente cadastroDoCliente = new CadastrarCliente();
                    cadastroDoCliente.cadastroCliente();
                    break;
                case 2:
                    ExibirClientes exibirClientes = new ExibirClientes();
                    exibirClientes.clientesCadastrados();
                    break;
                case 3:
                    CadastrarFornecedor cadastroDeFornecedor = new CadastrarFornecedor();
                    cadastroDeFornecedor.cadastroFornecedor();
                    break;
                case 4:
                    ExibirFornecedores exibirFornecedores = new ExibirFornecedores();
                    exibirFornecedores.fornecedoresCadastrados();
                    break;
                case 5:
                    CadastrarProduto cadastrarProduto = new CadastrarProduto();
                    cadastrarProduto.cadastroProduto();
                    break;
                case 6:
                    ExibirProdutos exibirProdutos = new ExibirProdutos();
                    exibirProdutos.produtosCadastrados();
                    break;
                case 7:
                    ArrayList<Clientes> clientesCadastrados = ArmazenamentoClientes.getInstance().clientesCadastrados();
                    ArrayList<Produtos> listaProdutos = ArmazenamentoProdutos.getInstance().produtosCadastrados();
                    RegistarVendas registarVendas = new RegistarVendas();
                    registarVendas.realizarVenda(clientesCadastrados,listaProdutos);

            }

        }while (escolha!=0);
    }

}
