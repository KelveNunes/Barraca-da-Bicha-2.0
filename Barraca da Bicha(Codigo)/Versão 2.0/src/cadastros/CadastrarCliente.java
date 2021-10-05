package cadastros;

import controle.ValidacaoDeDados;
import objetos.Clientes;
import java.util.Scanner;

public class CadastrarCliente{

        public void cadastroCliente() {
            Clientes novoCliente = new Clientes();
            novoCliente = novoCliente.clonar();
            Scanner s = new Scanner(System.in);
            System.out.println("Nome: ");
            String nome = s.nextLine();
            System.out.println("Endereço: ");
            String endereco = s.nextLine();
            System.out.println("Divida: ");
            Double divida = s.nextDouble();
            System.out.println("Pontos de Fidelidade: ");
            int pontos = s.nextInt();
            s.nextLine();

            novoCliente.setNome(nome);
            novoCliente.setEndereco(endereco);
            novoCliente.setDividas(divida);
            novoCliente.setCartaoFidelidade(pontos);

            ValidacaoDeDados controlador = new ValidacaoDeDados();
            if (controlador.cadastrarCliente(novoCliente)) {
                System.out.println("CADASTRO REALIZADO COM SUCESSO!");
            } else {
                System.out.println("CADASTRO NÃO REALIZADO, REVISE OS DADOS");
            }
        }
}
