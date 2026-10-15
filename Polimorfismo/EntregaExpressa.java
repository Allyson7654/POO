package Polimorfismo;

public class EntregaExpressa extends Entrega {
    private double valorDeclarado;

    public EntregaExpressa(String codigo, String destinatario, double peso, double valorDeclarado) {
        super(codigo, destinatario, peso);
        this.valorDeclarado = valorDeclarado;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }
    
    @Override
    public double calcularFrete() {
        return 15.00 + (4.50 * getPeso()) + (0.02 * valorDeclarado);
    }

    public int calcularPrazo() {
        return 1;
    }

    public String getTipo() {
        return "Expressa";
    }
}
