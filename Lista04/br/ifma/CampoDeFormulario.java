package br.ifma;

public class CampoDeFormulario {
    private String rotulo;
    private String tipo;
    
    public String getRotulo() {
        return rotulo;
    }
    public CampoDeFormulario(String rotulo, String tipo) {
        this.rotulo = rotulo;
        this.tipo = tipo;
    }
}
