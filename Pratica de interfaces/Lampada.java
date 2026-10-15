public class Lampada extends Dispositivo implements Ligavel, Agendavel {
    private int intensidade;
    private boolean ligado;

    public Lampada(String nome, double potenciaWatts, int intensidade) {
        super(nome, potenciaWatts);
        this.intensidade = intensidade;
        this.ligado = false;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    @Override
    public void desligar() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void agendar(String horario) {
        System.out.println(getNome() + "agendada para : " + horario);
    }
    
    @Override
    public String getTipo() {
        return "Lampada";
    }
}