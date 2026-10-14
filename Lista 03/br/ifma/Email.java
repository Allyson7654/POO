package br.ifma;

public class Email {
    private String endereco;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (!endereco.contains("@")) {
            System.out.println("O endereço de e-mail deve conter o caractere '@'.");
            return;
        }
        this.endereco = endereco;
    }
    public static void main(String[] args) {
        Email email = new Email();
        email.setEndereco("exemplo.com");
        System.out.println("Endereço de e-mail: " + email.getEndereco());
    }

}
