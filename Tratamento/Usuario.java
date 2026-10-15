package Tratamento;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Livro> livrosEmprestados;
    private static final int LIMITE_EMPRESTIMOS = 3;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public int getLimiteEmprestimos() {
        return LIMITE_EMPRESTIMOS;
    }
}