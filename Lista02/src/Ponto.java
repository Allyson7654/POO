public class Ponto {
   
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double distanciaAte(Ponto outro) {
        double eixoX = Math.pow(this.x - outro.x, 2);
        double eixoY = Math.pow(this.y - outro.y, 2);

        return Math.sqrt(eixoX + eixoY);
    }
}
