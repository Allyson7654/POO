package br.ifma;

public class Veiculo {
    private String placa;
    private double velocidadeAtual;

    public String getPlaca() {
        return placa;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    void acelerar(double incremento) {
        if (incremento < 0) {
            System.out.println("Incremento inválido. Deve ser um valor positivo.");
            return;
        }
        velocidadeAtual += incremento;
    }
    void frear(double decremento) {
        if (decremento < 0) {
            System.out.println("Decremento inválido. Deve ser um valor positivo.");
            return;
        }
        velocidadeAtual -= decremento;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }
}

