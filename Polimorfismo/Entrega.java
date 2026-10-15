package Polimorfismo;

public abstract class Entrega {
    private String codigo;
    private String destinatario;
    private double peso;
    
    public Entrega(String codigo, String destinatario, double peso) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.peso = peso;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public double getPeso() {
        return peso;
    }

    public abstract double calcularFrete();
    public abstract int calcularPrazo();
    public abstract String getTipo();

    public void exibirResumo() {
        System.out.printf("Código: %s, Destinatário: %s, Tipo: %s, Frete: R$ %.2f, Prazo: %d dias%n",
                codigo, destinatario, getTipo(), calcularFrete(), calcularPrazo());
    }
}
