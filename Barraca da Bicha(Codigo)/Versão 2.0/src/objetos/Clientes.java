package objetos;

import java.util.Scanner;

public class Clientes {

    protected String nome;
    protected String endereco;
    protected double dividas;
    protected int cartaoFidelidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getDividas() {
        return dividas;
    }

    public void setDividas(double dividas) {
        this.dividas = dividas;
    }

    public int getCartaoFidelidade() {
        return cartaoFidelidade;
    }

    public void setCartaoFidelidade(int cartaoFidelidade) {
        this.cartaoFidelidade = cartaoFidelidade;
    }

    public Clientes() {
    }

    public Clientes(Clientes novoCliente) {
        this.nome = nome;
        this.endereco = endereco;
        this.dividas = dividas;
        this.cartaoFidelidade = cartaoFidelidade;
    }

    public  Clientes clonar(){
        return new Clientes (this);
    }

   /* public void pagarDivida(){
        if (this.dividas>0){
            Scanner s = new Scanner(System.in);
            System.out.println("Divida de: "+this.dividas);
            System.out.println("Quanto deseja pagar: ");
            double valor = s.nextDouble();
            this.dividas -= valor;
            System.out.println("Novo valor da divida: "+this.dividas);
        }else {
            System.out.println("Nenhuma divida resgistrada!");
        }
    }

    public void cadastrarDivida(){

    }
*/

}
