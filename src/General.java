// General.java
public class General extends Personagem {
    public General() {
        super(16, 12, 8, new Arma("Espada", 10)); // Corrigido para passar dano
    }

    @Override
    public String getNome() {
        return "General"; // Retorna o nome do General
    }

    @Override
    public void atacar() {
        System.out.println("General ataca com sua " + getArma().getNome() + "!");
        // Lógica de ataque
    }

    @Override
    public void defender() {
        System.out.println("General se prepara para defender!");
        // Lógica de defesa
    }

    @Override
    public String getClasse() {
        return "";
    }
}


