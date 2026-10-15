package Tratamento;
public class Livro {
    private String isbn;
    private String titulo;
    private boolean disponivel;

    public Livro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.disponivel = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
