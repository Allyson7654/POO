public class Cliente {
    String nome;
    String email;
    int saldo = 0;

    public void adicionarCreditos(int quantidade) {
        saldo += quantidade;
        System.out.println("Créditos adicionados. Saldo atual: " + saldo);

    }
    public static void main(String[] args) {
        Cliente meuCliente = new Cliente();
        meuCliente.nome = "João";
        meuCliente.email = "joao@email.com";
        meuCliente.adicionarCreditos(100);
        meuCliente.adicionarCreditos(50);
        
        /*Saida esperada no console:
        Créditos adicionados. Saldo atual: 100
        Créditos adicionados. Saldo atual: 150
         */
    }
}
