package objetos;

import java.util.Scanner;

public class Clientes {

    protected String nome;
    protected String endereco;
    protected double dividas;
    protected int cartaoFidelidade;

    public Clientes() {
    }

    public Clientes(String nome, String endereco, double dividas, int cartaoFidelidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.dividas = dividas;
        this.cartaoFidelidade = cartaoFidelidade;
    }

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

}
