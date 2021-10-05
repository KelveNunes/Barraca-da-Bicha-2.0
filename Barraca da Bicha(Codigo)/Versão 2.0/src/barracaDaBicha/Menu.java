package barracaDaBicha;

import cadastros.CadastrarCliente;
import exibir.ExibirClientes;

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
            System.out.println("4.Cadastrar Produtos");
            System.out.println("6.Produtos Em Estoque");
            System.out.println("0.Sair");
            escolha = s.nextInt();
            switch (escolha){
                case 1:
                    CadastrarCliente cadastro = new CadastrarCliente();
                    cadastro.cadastroCliente();
                    break;
                case 2:
                    ExibirClientes exibirClientes = new ExibirClientes();
                    exibirClientes.clientesCadastrados();
                    break;
            }

        }while (escolha!=0);
    }

}
