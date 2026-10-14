public class Aluno {
    private String nome;
    private int matricula;
    private String curso;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso  ;
    }

    public Aluno(String nome, int matricula) {
        this(nome, matricula, "Não informado");
    }

    public Aluno() {
        this( "Sem nome", 0, "Não informado");
    }
}
