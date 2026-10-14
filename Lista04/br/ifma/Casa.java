package br.ifma;

import java.util.ArrayList;
import java.util.List;

public class Casa {

    private String endereco;
    private List<Comodo> comodo = new ArrayList<>();
    
    public void adicionarComodo(String nome, double areaM2) {
        Comodo c = new Comodo(nome, areaM2);
        comodo.add(c);
    }

    public double calcularAreaTotal() {
        double total=0;
        for(Comodo comodo : comodo) {
            total+= comodo.getAreaM2();
        }
        return total;
        
    }
}
