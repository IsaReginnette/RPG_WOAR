public abstract class Personagem {
    protected int vida;
    protected int forca;
    protected int inteligencia;
    protected int velocidade;
    protected Arma arma;

    public Personagem(int vida, int forca, int inteligencia, Arma arma) {
        this.vida = vida;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.velocidade = velocidade;
        this.arma = arma;
    }
    // Método para obter o nome
    public abstract String getNome();

    public abstract void atacar(); // Método abstrato

    public void defender() {
        // Implementar defesa, se necessário
    }

    // Getters
    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public Arma getArma() {
        return arma;
    }

    // Método para receber dano
    public void receberDano(int dano) {
        this.vida -= dano; // Receber dano
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    // Se precisar de um método setter para a força
    public void setForca(int forca) {
        this.forca = forca;
    }


    public abstract String getClasse();
}
