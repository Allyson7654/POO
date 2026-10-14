package br.ifma;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
private String nome;
private List<Medico> corpoClinico = new ArrayList<>();
     
    public void contratarMedico( Medico medico) {
        corpoClinico.add(medico);
    }

    public int getQuantidadeDeMedicos(){
        return corpoClinico.size();

    }
}
