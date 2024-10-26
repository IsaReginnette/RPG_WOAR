public class PersonagemFactory {
    public static Personagem criarPersonagem(String nomePersonagem) {
        switch (nomePersonagem.toLowerCase()) {
            case "kimberly":
                return new Kimberly(); // Instância de Kimberly
            case "julya":
                return new Julya(); // Instância de Julya
            case "isabelle":
                return new Isabelle(); // Instância de Isabelle
            default:
                System.out.println("Personagem desconhecido.");
                return null; // Retorna null se o personagem for desconhecido
        }
    }
}
