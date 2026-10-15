package Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Transportadora {
    private List<Entrega> entregas;

    public Transportadora() {
        this.entregas = new ArrayList<>();
    }

    public void cadastrarEntrega(Entrega e) {
        this.entregas.add(e);
    }

    public void listar() {
        for (Entrega entrega : entregas) {
            entrega.exibirResumo();
        }
    }

    public Entrega buscarPorCodigo(String codigo) {
        for (Entrega e : entregas) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        return null;
    }
    
    public double totalDeFretes() {
        double total = 0;
        for (Entrega e : entregas) {
            total += e.calcularFrete();
        }
        return total;
    }

    public Entrega entregaMaisCara(){
        if (entregas.isEmpty()) {
            return null;
        }
        Entrega maisCara = entregas.get(0);
        for (Entrega e : entregas) {
            if (e.calcularFrete() > maisCara.calcularFrete()) {
                maisCara = e;
            }
        }
        return maisCara;
    }
}
