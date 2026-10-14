package br.ifma;

public class Termometro {
    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        if (temperatura < -50 || temperatura > 60) {
            System.out.println("O valor é inválido.");
            return;
        }
        this.temperatura = temperatura;
    }

    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.setTemperatura(-51);
        System.out.println("Temperatura: " + termometro.getTemperatura());
    }
}
