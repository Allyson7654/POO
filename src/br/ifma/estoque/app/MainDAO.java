package br.ifma.estoque.app;

import br.ifma.estoque.excecao.PersistenciaException;
import br.ifma.estoque.modelo.Produto;
import br.ifma.estoque.persistencia.ProdutoDAO;

public class MainDAO {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO("estoque.db");

        try {
            dao.inserir(new Produto(1, "Caderno 10 Matérias", 20.0, 15));
            dao.inserir(new Produto(2, "Caneta Esferográfica Azul", 2.50, 100));
            dao.inserir(new Produto(3, "Mochila Escolar", 120.0, 5));
            System.out.println("Produtos inseridos no banco com sucesso!\n");

            System.out.println("--- Produtos com Estoque Baixo (< 10) ---");
            for (Produto p : dao.listarEstoqueBaixo(10)) {
                System.out.println(p);
            }

        } catch (PersistenciaException e) {
            e.printStackTrace();
        }
    }
}