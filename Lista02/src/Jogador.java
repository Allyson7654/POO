public class Jogador {
    String nickname;
    int pontuacao = 0;
    int vitorias = 0;

    public void vencerPartida() {
        vitorias++;
        pontuacao += 10;
        System.out.println(nickname + " - Vitorias: " + vitorias + " | Pontuação atual: " + pontuacao);
    }
    public static void main(String[] args) {
        Jogador meuJogador = new Jogador();
        meuJogador.nickname = "ximira";

        meuJogador.vencerPartida();
        meuJogador.vencerPartida();

        /*Saida esperada no console:
        ximira - Vitorias: 1 | Pontuação atual: 10
        ximira - Vitorias: 2 | Pontuação atual: 20
         */
    }
}
