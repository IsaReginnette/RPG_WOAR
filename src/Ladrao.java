public class Ladrao extends Personagem {
    public Ladrao() {
        super(9, 6, 14, new Arma("Faca", 5)); // Corrigindo o construtor da arma, adicione um valor de dano
        // Aqui, 9 representa a vida, 6 a força e 14 a velocidade (ajuste conforme necessário)
    }

    @Override
    public String getNome() {
        return "Ladrão"; // Corrigindo a ortografia
    }

    @Override
    public void atacar() {
        System.out.println("Ladrão ataca com sua " + getArma().getNome() + "!");
        // Adicione a lógica de ataque, como calcular o dano
    }

    @Override
    public void defender() {
        System.out.println("Ladrão se esconde nas sombras!");
        // Adicione a lógica de defesa
    }

    @Override
    public String getClasse() {
        return "";
    }
}

