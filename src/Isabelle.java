
public class Isabelle extends Personagem {
    public Isabelle() {
        super(6, 14, 8, new Arma("Magia", 5)); // Atributos da Isabelle
        // Supondo que a vida, força e inteligência são 60, 6 e 14, respectivamente.
    }

    @Override
    public String getNome() {
        return "Isabelle";
    }

    @Override
    public void atacar() {
        System.out.println("Isabelle conjura um feitiço com sua " + getArma().getNome() + "!");
        // Aqui você pode adicionar a lógica de ataque, como calcular dano
    }

    @Override
    public void defender() {
        System.out.println("Isabelle cria um escudo mágico para se proteger!");
        // Aqui você pode adicionar a lógica de defesa
    }

    @Override
    public String getClasse() {
        return "";
    }
}
