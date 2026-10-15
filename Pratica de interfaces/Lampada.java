public class Lampada extends Dispositivo implements Ligavel, Agendavel {
    private int intensidade;

    public Lampada(String nome, double potenciaWatts, int intensidade) {
        super(nome, potenciaWatts);
        this.intensidade = intensidade;
    }

    @Override
    public void desligar() {
        
    }

    public boolean isLigado() {
        return false;
    }

    public void ligar() {
        
    }

    public void agendar(String horario) {
        System.out.println(getNome() + "agendada para : " + horario);
    }
    
    @Override
    public String getTipo() {
        return "Lampada";
    }
}