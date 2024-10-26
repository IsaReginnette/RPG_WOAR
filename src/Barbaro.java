public class Barbaro extends Personagem {
    public Barbaro() {
        super(15, 4, 10, new Arma("Machado", 5)); // Corrigindo o construtor da arma
        // Aqui, 15 representa a vida, 4 a força e 10 a velocidade (ajuste conforme necessário)
    }

    @Override
    public String getNome() {
        return "Barbaro";
    }

    @Override
    public void atacar() {
        System.out.println("Barbaro ataca com seu " + getArma().getNome() + "!");
        // Adicione a lógica de ataque, como calcular o dano
    }

    @Override
    public void defender() {
        System.out.println("Barbaro se prepara para defender!");
        // Adicione a lógica de defesa
    }

    @Override
    public String getClasse() {
        return "";
    }
}
