package objetos;

import java.util.ArrayList;

public class Fornecedores {
    private String nome;
    private String contato;
    private ArrayList<Produtos> produtosDisponiveis;

    public ArrayList<Produtos> getProdutosDisponiveis() {
        return produtosDisponiveis;
    }

    public void setProdutosDisponiveis(ArrayList<Produtos> produtosDisponiveis) {
        this.produtosDisponiveis = produtosDisponiveis;
    }

    public Fornecedores() {
    }

    public Fornecedores(Fornecedores novoFornecedor) {
        this.nome = nome;
        this.contato = contato;
        this.produtosDisponiveis = produtosDisponiveis;
    }

    public  Fornecedores clonar(){
        return new Fornecedores(this);
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



}

