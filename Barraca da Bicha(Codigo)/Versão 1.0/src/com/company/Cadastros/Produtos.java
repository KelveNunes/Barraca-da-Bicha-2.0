package com.company.Cadastros;

import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {


    protected String sabor;
    protected int quantidade;
    protected String tipo;
    protected double valorCompra;
    protected double valorVenda;

    public Produtos(){}

    public Produtos(Produtos novoProduto){
        this.sabor = novoProduto.sabor;
        this.tipo  = novoProduto.tipo;
        this.valorCompra = novoProduto.valorCompra;
        this.valorVenda = novoProduto.valorVenda;
    }
    public  Produtos clonar(){
        return new Produtos(this);
    }

    public void informacoes(){
        System.out.println("sabor: " + this.sabor + "tipo: " + this.tipo
                           + "valor de compra" + this.valorCompra + "valor de venda: " + this.valorVenda);
    }

    public void verificarEstoque(ArrayList<Produtos> produtos){

        Scanner iniciar = new Scanner(System.in);
        System.out.println("Digite o nome do produto: "+ "\n");
        String buscarTipo = iniciar.nextLine();

        for(int i = 0; i <produtos.size(); i++){
            if(produtos.get(i).getTipo().equals(buscarTipo)){
                System.out.println(produtos.get(i).quantidade);
            }
        }
    }












    //GETTERS/SETTERS
    public String getSabor(){
        return sabor;
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
}
