public class Main { 
    public static void main(String[] args) { 
        int[] notas = {72, 85, 91, 68, 77, 95, 60, 88}; 
        int soma = 0; 
        for (int nota : notas) { 
            soma += nota; 
        } 
        double media = (double) soma / notas.length; 
        int acimaDaMedia = 0; 
        for (int nota : notas) { 
            if (nota > media) { 
                acimaDaMedia++; 
            } 
        } 
        System.out.println("Soma: " + soma); 
        System.out.println("Media: " + media); 
        System.out.println("Acima da media: " + acimaDaMedia); 
    } 
} 
/* RESULTADO: 
Soma: 636 
Media: 79.5 
Acima da media: 4
*/ 