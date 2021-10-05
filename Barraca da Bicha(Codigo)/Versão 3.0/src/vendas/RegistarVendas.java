package vendas;

import cadastros.CadastrarCliente;
import objetos.Clientes;
import objetos.Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistarVendas {
    public void realizarVenda(ArrayList<Clientes> clientesCadastrados, ArrayList<Produtos> produtosCadastrados) {
        Scanner s = new Scanner(System.in);
        String sabor = "";
        int quantidade = 0;

        System.out.println("Cliente: ");
        String cliente = s.nextLine();

        if (clientesCadastrados.size() > 0) {
            for (int i = 0; i < clientesCadastrados.size(); i++) {
                if (clientesCadastrados.get(i).getNome().equals(cliente)) {
                    System.out.println("Produto: ");
                    String produto = s.nextLine();
                    for (int j = 0; j < produtosCadastrados.size(); j++) {
                        if (produtosCadastrados.get(j).getTipo().equals(produto)) {
                            System.out.println("Sabor: ");
                            sabor = s.nextLine();
                        }
                        if (produtosCadastrados.get(j).getSabor().equals(sabor)) {
                            System.out.println("Quantidade: ");
                            quantidade = s.nextInt();
                        }
                        if (produtosCadastrados.get(j).getQuantidade() >= quantidade) {
                            System.out.println("Pagamento a vista?(s/n)");
                            char pagamento = s.next().charAt(0);
                            if (pagamento == 's') {
                                clientesCadastrados.get(i).setCartaoFidelidade(clientesCadastrados.get(i).getCartaoFidelidade() + 1);
                                System.out.println("Venda realizada com sucesso!");
                            } else {
                                clientesCadastrados.get(i).setCartaoFidelidade(clientesCadastrados.get(i).getCartaoFidelidade() + 1);
                                clientesCadastrados.get(i).setDividas(clientesCadastrados.get(i).getDividas() + produtosCadastrados.get(j).getValorVenda() * quantidade);
                            }
                        }
                    }

                }
            }
            System.out.println("Cliente não cadastrador");
            System.out.println("Cadastre o cliente antes da compra");
            CadastrarCliente cadastroDoCliente = new CadastrarCliente();
            cadastroDoCliente.cadastroCliente();
        } else {
            System.out.println("Nenhum Cliente Cadastrado!");
        }

    }
}
