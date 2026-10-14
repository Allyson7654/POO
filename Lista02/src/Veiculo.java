public class Veiculo {
    String placa;
    String modelo;
    boolean disponivel = true;

    public void alugar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }


public static void main(String[] args) {
        Veiculo meuVeiculo = new Veiculo();
        meuVeiculo.placa = "ABC-1234";
        meuVeiculo.modelo = "Toyota Corolla";

        System.out.println("Disponível inicialmente: " + meuVeiculo.disponivel);

        meuVeiculo.alugar();
        System.out.println("Disponível após alugar: " + meuVeiculo.disponivel);
        
        meuVeiculo.devolver();
        System.out.println("Disponível após devolver: " + meuVeiculo.disponivel);

       /* Saída esperada no console:
           Disponível inicialmente? true
           Disponível após alugar? false
           Disponível após devolver? true
        */
    }
}