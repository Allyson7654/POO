public class Termostato extends Dispositivo implements Ligavel, Agendavel, Conectavel {
    
    private double temperaturaAlvo;
    private boolean ligado;
    private boolean conectado;
    public Termostato(String nome, double potenciawatts, double tempAlvo) {
        super(nome, potenciawatts);
        this.temperaturaAlvo = tempAlvo;
        this.ligado = false;
        this.conectado = false;
    }
    public double getTempAlvo() {
        return temperaturaAlvo;
    }
    
    public void setTempAlvo(double tempAlvo) {
        this.temperaturaAlvo = tempAlvo;
    }

    @Override 
    public void ligar() {
        this.ligado = true;
        System.out.println(getNome() + " ligado (Temperatura alvo : " + this.temperaturaAlvo + "C).");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println(getNome() + " desligado.");
    }

    public boolean isLigado() {
        return ligado;
    }
    
    public void agendar(String horario) {
        System.out.println(getNome() + " agendado para: " + horario );
    }

    public void conectar(String rede) {
        this.conectado = true;
        System.out.println(getNome() + " conectado a rede WI-Fi: " + rede);
    }

    public void desconectar() {
        this.conectado = false;
    }
    
    public boolean isConectado() {
        return conectado;
    }
    
    @Override
    public String getTipo() {
        return "Termostato";
    }
}