package br.ifma;

import java.util.ArrayList;
import java.util.List;

public class Prova {
    private String titulo;
    private List<Questao> questoes = new ArrayList<>();

    public void adicionarQuestao(String enunciado, double valor ) {
        Questao a = new Questao (enunciado, valor);
        questoes.add(a);
    }
    public double calcularValorTotal() {
        double total = 0;
        for (Questao q : questoes) {
            total+= q.getValor();     
        }
        return total;
        }
}
