package br.ifma;

public class Estoque {
    private int quantidade = 0;

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarItens(int quantidade) {
        if (quantidade < 0) {
            System.out.println("A quantidade não pode ser negativa.");
            return;
        }
        this.quantidade += quantidade;
    }

    public void removerItens(int quantidade) {
        if (quantidade <=0) {
            System.out.println("A quantidade não pode ser negativa.");
            return;
        }
        if (quantidade > this.quantidade) {
            System.out.println("Não é possível remover mais itens do que o estoque atual.");
            return;
        }
        this.quantidade -= quantidade;
    }
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarItens(11);
        estoque.removerItens(11);
        System.out.println("Quantidade: " + estoque.getQuantidade());
    }

}
