public class Circulo {
    
    private double raio;
    private static double pi = 3.14159;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double calcularArea() {
        return pi * Math.pow(raio, 2);
    }
    public static double getValorPi() {
        return pi;
    }

    public static void main(String[] args) {
        Circulo meuCirculo = new Circulo(2.0);
        System.out.println("Área do círculo: " + meuCirculo.calcularArea());
        System.out.println("Valor de PI: " + Circulo.getValorPi());
    }
}