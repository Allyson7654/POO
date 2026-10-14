public abstract class Dispositivo {
    private String nome;
    private double potenciaWatts;
    
    public Dispositivo(String nome, double potenciawatts) {
        this.nome = nome;
        this.potenciaWatts = potenciawatts;
    }

    public String getNome() {
        return nome;
    }

    public double getPotenciaWatts() {
        return potenciaWatts;
    }

    public abstract String getTipo();
}
