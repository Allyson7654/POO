package br.ifma;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas = new ArrayList<>();

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public int calcularDuracaoTotal(){
        int total=0;
        for(Musica  musica : musicas){
            total += musica.getDuracaoSegundos();
        }
        return total;
    }
}