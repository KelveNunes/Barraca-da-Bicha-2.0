package objetos;

public class Produtos {

    protected String sabor;
    protected String tipo;
    protected double valorCompra;
    protected double valorVenda;
    protected int quantidade;

    public Produtos(){
    }

    public Produtos(Produtos novoProduto){
        this.sabor = novoProduto.sabor;
        this.tipo  = novoProduto.tipo;
        this.valorCompra = novoProduto.valorCompra;
        this.valorVenda = novoProduto.valorVenda;
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
    public int getQuantidade() {
        return quantidade;
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
