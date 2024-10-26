public class Bruxo extends Personagem {
    public Bruxo() {
        super(5, 15, 8, new Arma("Magia Sombria", 10)); // Corrigindo o construtor da arma, adicione um valor de dano
        // Aqui, 5 representa a vida, 15 a força e 8 a velocidade (ajuste conforme necessário)
    }

    @Override
    public String getNome() {
        return "Bruxo";
    }

    @Override
    public void atacar() {
        System.out.println("Bruxo conjura um feitiço com sua " + getArma().getNome() + "!");
        // Adicione a lógica de ataque, como calcular o dano
    }

    @Override
    public void defender() {
        System.out.println("Bruxo cria uma barreira mágica!");
        // Adicione a lógica de defesa
    }

    @Override
    public String getClasse() {
        return "";
    }
}
