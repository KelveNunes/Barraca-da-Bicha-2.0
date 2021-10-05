package objetos;

import java.util.ArrayList;

public class Fornecedores {
    private int id;
    private String nome;
    private String contato;
    private ArrayList<Produtos> produtosDisponiveis;

    public Fornecedores() {
    }

    public Fornecedores(Fornecedores novoFornecedor) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.produtosDisponiveis = produtosDisponiveis;
    }

    public  Fornecedores clonar(){
        return new Fornecedores(this);
    }






























    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public ArrayList<Produtos> getProdutosDisponiveis() {
        return produtosDisponiveis;
    }

    public void setProdutosDisponiveis(ArrayList<Produtos> produtosDisponiveis) {
        this.produtosDisponiveis = produtosDisponiveis;
    }

}

