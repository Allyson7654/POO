package br.ifma.estoque.persistencia;

import br.ifma.estoque.excecao.PersistenciaException;
import br.ifma.estoque.modelo.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private final String urlConexao;

    public ProdutoDAO(String nomeBanco) {
        this.urlConexao = "jdbc:sqlite:" + nomeBanco;
        criarTabela();
    }

    private void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS produto (" +
                     "codigo INTEGER PRIMARY KEY, " +
                     "nome TEXT NOT NULL, " +
                     "preco REAL, " +
                     "quantidade INTEGER)";
        try (Connection conn = DriverManager.getConnection(urlConexao);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela produto", e);
        }
    }

    public void inserir(Produto p) throws PersistenciaException {
        String sql = "INSERT INTO produto (codigo, nome, preco, quantidade) VALUES (?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(urlConexao);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, p.getCodigo());
            pstmt.setString(2, p.getNome());
            pstmt.setDouble(3, p.getPreco());
            pstmt.setInt(4, p.getQuantidade());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new PersistenciaException("Erro ao inserir o produto: " + p.getNome(), e);
        }
    }

    public List<Produto> listar() throws PersistenciaException {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT codigo, nome, preco, quantidade FROM produto ORDER BY codigo ASC";
        try (Connection conn = DriverManager.getConnection(urlConexao);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                produtos.add(new Produto(
                    rs.getInt("codigo"),
                    rs.getString("nome"),
                    rs.getDouble("preco"),
                    rs.getInt("quantidade")
                ));
            }
        } catch (SQLException e) {
            throw new PersistenciaException("Erro ao listar os produtos", e);
        }
        return produtos;
    }

    public boolean atualizarQuantidade(int codigo, int quantidade) throws PersistenciaException {
        String sql = "UPDATE produto SET quantidade = ? WHERE codigo = ?";
        try (Connection conn = DriverManager.getConnection(urlConexao);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, quantidade);
            pstmt.setInt(2, codigo);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new PersistenciaException("Erro ao atualizar a quantidade do produto " + codigo, e);
        }
    }

    public boolean remover(int codigo) throws PersistenciaException {
        String sql = "DELETE FROM produto WHERE codigo = ?";
        try (Connection conn = DriverManager.getConnection(urlConexao);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, codigo);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new PersistenciaException("Erro ao remover o produto " + codigo, e);
        }
    }

    public List<Produto> listarEstoqueBaixo(int limite) throws PersistenciaException {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT codigo, nome, preco, quantidade FROM produto WHERE quantidade < ? ORDER BY codigo ASC";
        try (Connection conn = DriverManager.getConnection(urlConexao);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, limite);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    produtos.add(new Produto(
                        rs.getInt("codigo"),
                        rs.getString("nome"),
                        rs.getDouble("preco"),
                        rs.getInt("quantidade")
                    ));
                }
            }
        } catch (SQLException e) {
            throw new PersistenciaException("Erro ao listar o estoque baixo", e);
        }
        return produtos;
    }
}
