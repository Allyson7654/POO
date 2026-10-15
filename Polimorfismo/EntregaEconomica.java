package Polimorfismo;

public class EntregaEconomica extends Entrega {
    private String regiao;

    public EntregaEconomica(String codigo, String destinatario, double peso, String regiao) {
        super(codigo, destinatario, peso);
        this.regiao = regiao;
    }

    public String getRegiao() {
        return regiao;
    }

    @Override
    public double calcularFrete() {
        double frete = 8.00 + (1.80 * getPeso());
        if (regiao.equalsIgnoreCase("Interior")) {
            frete += 10.00;
        }
        return frete;
    }

    public int calcularPrazo() {
        if (regiao.equalsIgnoreCase("Interior")) {
            return 7;
        }
        return 4;
    }

    public String getTipo() {
        return "Econômica";
    }
}
