package br.ifma;

public class Aluno {
    private String nome;
    private double nota;

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("A nota deve estar entre 0 e 10.");
            return;
        }
        this.nota = nota;
    }
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNota(8);
        System.out.println("Nota: " + aluno.getNota());
    }
}
