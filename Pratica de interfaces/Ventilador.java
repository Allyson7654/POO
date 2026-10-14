public class Ventilador extends Dispositivo implements Ligavel {
    private int velocidade;
    private boolean ligado;

    public Ventilador(String nome, double potenciaWatts, int velocidade) {
        super(nome, potenciaWatts);
        this.velocidade = velocidade;
        this.ligado = false ;

    }
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override 
    public void ligar() {
        this.ligado = true;
        System.out.println(getNome() + " ligado na velocidade "  + this.velocidade + ".");

    }

    public void desligar() {
        this.ligado = false;
        System.out.println(getNome() + "desligado.");
    }

    public boolean isLigado() {
        return this.ligado;
    }

    @Override
    public String getTipo() {
        return "Ventilador";
    }
}
