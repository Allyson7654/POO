package Tratamento;
public class IsbnInvalidoException extends RuntimeException {

    public IsbnInvalidoException(String isbn) {
        super("ISBN invalido (" + isbn + "): o codigo deve conter exatamente 13 caracteres.");
    }

}
