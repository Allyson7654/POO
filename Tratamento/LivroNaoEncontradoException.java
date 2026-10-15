package Tratamento;
public class LivroNaoEncontradoException extends Exception {
    public LivroNaoEncontradoException(String isbn) {
        super("Livro com ISBN " + isbn + " não encontrado.");
    }
    
}
