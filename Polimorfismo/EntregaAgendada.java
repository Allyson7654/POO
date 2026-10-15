package Polimorfismo;

public class EntregaAgendada extends Entrega {
    private String dataAgendada;

    public EntregaAgendada(String codigo, String destinatario, double peso, String dataAgendada) {
        super(codigo, destinatario, peso);
        this.dataAgendada = dataAgendada;
    }

    public String getDataAgendada() {
        return dataAgendada;
    }

    @Override
    public double calcularFrete() {
        return 10.00 + (2.50 * getPeso()) + 12.00;
    }

    public int calcularPrazo() {
        return 3;
    }

    public String getTipo() {
        return "Agendada";
    }

}
