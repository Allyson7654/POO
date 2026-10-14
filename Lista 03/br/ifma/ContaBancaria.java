package br.ifma;

public class ContaBancaria {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("O saldo não pode ter valores negativos.");
            return;
        }
        this.saldo = saldo;
    }
}