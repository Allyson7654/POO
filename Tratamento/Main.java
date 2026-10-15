package Tratamento;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.cadastrar(new Livro("9780000000001", "POO em Java"));
        biblioteca.cadastrar(new Livro("9780000000002", "Estruturas de Dados"));
        biblioteca.cadastrar(new Livro("9780000000003", "Banco de Dados"));
        biblioteca.cadastrar(new Livro("9780000000004", "Engenharia de Software"));

        
        Usuario ana = new Usuario("Ana");

        System.out.println("=== INÍCIO DAS OPERAÇÕES DA ANA ===\n");

        
        
        executarEmprestimo(biblioteca, ana, "9780000000001"); 
        executarEmprestimo(biblioteca, ana, "9780000000001"); 
        executarEmprestimo(biblioteca, ana, "123");           
        executarEmprestimo(biblioteca, ana, "9780000000999"); 
        executarEmprestimo(biblioteca, ana, "9780000000002"); 
        executarEmprestimo(biblioteca, ana, "9780000000003"); 
        executarEmprestimo(biblioteca, ana, "9780000000004"); 

        executarDevolucao(biblioteca, ana, "9780000000002"); 
        executarDevolucao(biblioteca, ana, "9780000000002"); 
    }

    public static void executarEmprestimo(Biblioteca bib, Usuario user, String isbn) {
        try {
            bib.emprestar(user, isbn);
            System.out.println("Sucesso ao emprestar o ISBN: " + isbn);
        } catch (IsbnInvalidoException | LivroNaoEncontradoException | 
                 LivroIndisponivelException | LimiteEmprestimosException e) {
            System.out.println("ERRO TRATADO: " + e.getMessage());
        } finally {
            System.out.println("Operação finalizada\n");
        }
    }

    public static void executarDevolucao(Biblioteca bib, Usuario user, String isbn) {
        try {
            bib.devolver(user, isbn);
            System.out.println("Sucesso ao devolver o ISBN: " + isbn);
        } catch (LivroNaoEncontradoException e) {
            System.out.println("ERRO TRATADO: " + e.getMessage());
        } finally {
            System.out.println("Operação finalizada\n");
        }
    }
}
