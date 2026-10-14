package br.ifma;

public class Produto {
    private String nome;
    private double preco ;

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("O preço não pode ter valores negativos.");
            return;
        }
        this.preco = preco;
    }
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setPreco(40);
        System.out.println("Preço: " + produto.getPreco());
    }

}
