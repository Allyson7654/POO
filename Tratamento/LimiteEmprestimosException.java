package Tratamento;
public class LimiteEmprestimosException extends Exception {
    public LimiteEmprestimosException(String nome, int limite) {
        super("O usuário " + nome + " atingiu o limite máximo de " + limite + " empréstimos permitidos.");
    }
    
}
