package br.ifma;

import java.util.List;
import java.util.ArrayList;

public class Equipe {
    
    private String nome;
    private List<Jogador> jogadores = new ArrayList<>();
    
    public void adicionarJogador(Jogador jogador){
        jogadores.add(jogador);
        }

    public int getQuantidadeDeJogadores() {
        return jogadores.size();
    }
}
