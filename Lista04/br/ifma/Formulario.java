package br.ifma;

import java.util.ArrayList;
import java.util.List;

public class Formulario {
    private String titulo;
    private List<CampoDeFormulario> campos = new ArrayList<>();

    public Formulario(String titulo) {
        this.titulo = titulo;
    }

    public void adicionarCampo(String rotulo, String tipo) {
        CampoDeFormulario  a = new CampoDeFormulario(rotulo, tipo);
        campos.add(a);
    }
    
    public int getQuantidadeDeCampos() {
    return campos.size();  
    }
}
