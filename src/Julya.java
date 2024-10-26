public class Julya extends Personagem {
    public Julya() {
        super(8, 7, 14, new Arma("Arco e flechas", 5)); // Atributos da Julya
        // Supondo que a vida, força e inteligência são 80, 8 e 7, respectivamente.
    }

    @Override
    public String getNome() {
        return "Julya";
    }

    @Override
    public void atacar() {
        System.out.println("Julya ataca com seu " + getArma().getNome() + "!");
        // Aqui você pode adicionar a lógica de ataque, como calcular dano
    }

    @Override
    public void defender() {
        System.out.println("Julya se prepara para esquivar!");
        // Aqui você pode adicionar a lógica de defesa
    }

    @Override
    public String getClasse() {
        return "";
    }
}