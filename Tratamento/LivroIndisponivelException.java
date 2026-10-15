package Tratamento;
public class LivroIndisponivelException extends Exception {
    public LivroIndisponivelException(String titulo) {
        super("Livro \"" + titulo + "\" não está disponível no momento pois já está emprestado.");
    }

}
