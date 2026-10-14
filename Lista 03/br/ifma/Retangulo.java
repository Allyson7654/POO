package br.ifma;

public class Retangulo {
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }
    public double getAltura() {
        return altura;
    }
    
    public void setLargura(double largura) {
        if (largura <= 0) {
            System.out.println("A largura não pode ter valores negativos ou zero.");
            return;
        }
        this.largura = largura;
    }
    public void setAltura(double altura) {
        if (altura <= 0) {
            System.out.println("A altura não pode ter valores negativos ou zero.");
            return;
        }
        this.altura = altura;
    }

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(0);
        retangulo.setAltura(0);
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
    }
}
