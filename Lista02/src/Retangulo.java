public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;

        if (largura < 0) {
            this.largura = 1.0;
        } else {
            this.largura = largura;
        }

        if (altura < 0) {
            this.altura = 1.0;
        } else {
            this.altura = altura;
        }
    }
}
