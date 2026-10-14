package br.ifma;

public class Questao {
    private String enunciado;
    private double valor;
    
    public double getValor() {
        return valor;
    }
    
    public Questao(String enunciado, double valor) {
        this.enunciado = enunciado;
        this.valor = valor;
    }
}