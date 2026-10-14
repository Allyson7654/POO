public class Filme {
    String titulo;
    String diretor;
    int ano;
    double duracao;

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano: " + ano);
        System.out.println("Duração: " + duracao + " minutos");
    }
    public static void main(String[] args) {
        Filme meuFilme= new Filme();
        meuFilme.titulo = "Transformers";
        meuFilme.diretor = "Michael Bay";
        meuFilme.ano = 2007;
        meuFilme.duracao = 144.0;
        
        meuFilme.exibirDados();

        /*Saida esperada no console:
        Título: Transformers
        Diretor: Michael Bay
        Ano: 2007
        Duração: 144.0 minutos
         */
    }
}