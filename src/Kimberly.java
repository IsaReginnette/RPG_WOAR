public class Kimberly extends Personagem {
    public Kimberly() {
        super(14, 5, 9, new Arma("Espada", 5)); // Atributos da Kimberly
        // Supondo que a vida, força e inteligência são 100, 14 e 5, respectivamente.
    }

    @Override
    public String getNome() {
        return "Kimberly";
    }

    @Override
    public void atacar() {
        System.out.println("Kimberly ataca com sua " + getArma().getNome() + "!");
        // Aqui você pode adicionar a lógica de ataque, como calcular dano
    }

    @Override
    public void defender() {
        System.out.println("Kimberly levanta seu escudo para se defender!");
        // Aqui você pode adicionar a lógica de defesa
    }

    @Override
    public String getClasse() {
            return "";
    }
}
