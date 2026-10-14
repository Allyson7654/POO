public class CameraSeguranca extends Dispositivo implements Ligavel, Conectavel {
    private String resolucao;
    private boolean ligado;
    private boolean conectado;
    
    public CameraSeguranca(String nome, double potenciawatts, String resolucao) {
        super(nome, potenciawatts);
        this.resolucao = resolucao;
        this.ligado = false;
        this.conectado = false;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    @Override 
    public void ligar() {
        this.ligado = true;
        System.out.println(getNome() + "ligado (Resolução: " + this.resolucao + ").");
    }

    public void desligar() {
        this.ligado = false;
        System.out.println(getNome() + " desligado. ");
    }

    public boolean isLigado() {
        return ligado;
    }

    public void conectar(String rede) {
        this.conectado = true;
        System.out.println(getNome() + " conectado a rede WI-Fi: " + rede);
    }

    public void desconectar() {
        this.conectado = false;
    System.out.println(getNome() + " desconectado do WI-FI.");
    }
    
    public boolean isConectado() {
        return conectado;
    }

    @Override
    public String getTipo() {
      return "CameraDeSeguranca";
    }
}
