public class Animais {
    String nome;
    String especie;
    int idade;

    public void verificarIdade() {
        if (idade >= 8) {
            System.out.println("O animal é idoso.");
        } else {
            System.out.println("O animal não é idoso.");
        }
    }

    public static void main(String[] args) {
        Animais meuAnimal = new Animais();
        meuAnimal.idade = 10;
        meuAnimal.verificarIdade();

        /*Saida esperada no console:
        O animal é idoso.
         */
    }
}
