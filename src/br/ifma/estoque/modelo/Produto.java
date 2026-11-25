package br.ifma.estoque.modelo;

import java.io.Serializable;

public class Produto implements Serializable{
    private static final long serialVersionUID = 1L;

    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    private transient double valorTotal;

    public Produto(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.valorTotal = preco * quantidade;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorTotal() {
        if  (valorTotal == 0.0) {
            valorTotal = preco * quantidade;
        }
        return valorTotal;
    }

    @Override 
    public String toString() {
        return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ", valorTotal=" + getValorTotal() + "]";
    }


    

    


}
