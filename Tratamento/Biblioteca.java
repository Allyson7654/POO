package Tratamento;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    public void cadastrar(Livro livro) {
        acervo.add(livro);
    }

    public void emprestar(Usuario usuario, String isbn) 
            throws LivroNaoEncontradoException, LivroIndisponivelException, LimiteEmprestimosException {
        
        if (isbn == null || isbn.length() != 13) {
            throw new IsbnInvalidoException(isbn);
        }

        Livro livroEncontrado = null;
        for (Livro l : acervo) {
            if (l.getIsbn().equals(isbn)) {
                livroEncontrado = l;
                break;
            }
        }
        
        if (livroEncontrado == null) {
            throw new LivroNaoEncontradoException(isbn);
        }

        if (!livroEncontrado.isDisponivel()) {
            throw new LivroIndisponivelException(livroEncontrado.getTitulo());
        }

        if (usuario.getLivrosEmprestados().size() >= usuario.getLimiteEmprestimos()) {
            throw new LimiteEmprestimosException(usuario.getNome(), usuario.getLimiteEmprestimos());
        }

        livroEncontrado.setDisponivel(false);
        usuario.getLivrosEmprestados().add(livroEncontrado);
    }

    public void devolver(Usuario usuario, String isbn) throws LivroNaoEncontradoException {
        Livro livroParaDevolver = null;
        for (Livro l : usuario.getLivrosEmprestados()) {
            if (l.getIsbn().equals(isbn)) {
                livroParaDevolver = l;
                break;
            }
        }

        if (livroParaDevolver == null) {
            throw new LivroNaoEncontradoException(isbn);
        }

        usuario.getLivrosEmprestados().remove(livroParaDevolver);
        livroParaDevolver.setDisponivel(true);
    }
}