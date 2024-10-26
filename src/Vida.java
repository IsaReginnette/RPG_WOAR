public class Vida {
    private int pontos;

    public Vida(int pontosIniciais) {
        this.pontos = pontosIniciais;
    }

    public int getPontos() {
        return pontos;
    }

    public void perderVida(int dano) {
        this.pontos -= dano;
    }

    public boolean estaVivo() {
        return pontos > 0;
    }
}
