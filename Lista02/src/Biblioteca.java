public class Biblioteca {
    String titulo;
	String artista;
	int duracaoEmSegundos;
	int numeroReproducoes = 0;
		
	void tocar(){
		numeroReproducoes++;
		}

    public static void main(String[] args) {
		Biblioteca b = new Biblioteca();
		
		b.titulo = "Boate azul";
		b.artista = "Bruno e Marrone";
		b.duracaoEmSegundos = 300;
		b.numeroReproducoes = 100;
		
		System.out.println("Reproducoes: " + b.numeroReproducoes);
		
		b.tocar();

		System.out.println("Reproducoes apos tocar: " + b.numeroReproducoes);
        
        /* Saída esperada no console:
           Reproducoes: 100
           Reproducoes apos tocar: 101
        */
	}
}
