package br.ifma.estoque.app;

import br.ifma.estoque.excecao.PersistenciaException;
import br.ifma.estoque.modelo.Produto;
import br.ifma.estoque.persistencia.ArquivoEstoque;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArquivoEstoque arquivoEstoque = new ArquivoEstoque();

        List<Produto> produtosParaGravar = Arrays.asList(
            new Produto(1, "Caderno  10 Materias", 20.0, 15),
            new Produto(2, "Caneta Esferografica Azul", 2.50, 100),
            new Produto(3, "Mochila Escolar", 120.0, 5)
        );
    
        try {
            arquivoEstoque.salvar(produtosParaGravar);
            System.out.println("Produtos gravados com sucesso no arquivo!");

            List<Produto> produtosLidos = arquivoEstoque.carregar();
            System.out.println("\n --- Produtos Lidos do Arquivo ---");
            for (Produto p : produtosLidos) {
                System.out.println(p);
            }
        } catch (PersistenciaException e) {
            e.printStackTrace();
        }
    }
}
