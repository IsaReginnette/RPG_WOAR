public class ReiHaset {
    private int vida;

    public ReiHaset() {
        this.vida = 100; // valor inicial de vida
    }

    public void perderVida(int quantidade) {
        this.vida -= quantidade;
        System.out.println("Rei de Haset perdeu " + quantidade + " pontos de vida. Vida restante: " + this.vida);
    }
}
