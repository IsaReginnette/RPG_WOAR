public class Sinergia {
    private int sinergiaIsabelle;
    private int sinergiaJulya;
    private int sinergiaKimberly;
    private int sinergiaEmpatada;

    // Construtor para inicializar os valores de sinergia
    public Sinergia() {
        // Inicializa todas as sinergias com valor 0
        this.sinergiaIsabelle = 0;
        this.sinergiaJulya = 0;
        this.sinergiaKimberly = 0;
        this.sinergiaEmpatada = 0;
    }

    // Método para ajustar a sinergia com base na personagem e valor
    public void ajustarSinergia(int valor) {
        String personagem = "";
        switch (personagem.toLowerCase()) {
            case "kimberly":
                sinergiaKimberly += valor;
                break;
            case "julya":
                sinergiaJulya += valor;
                break;
            case "isabelle":
                sinergiaIsabelle += valor;
                break;
            default:
                System.out.println("Personagem desconhecido: " + personagem);
                break;
        }
    }

    // Método para verificar a personagem com maior sinergia
    public String verificarMaiorSinergia() {
        if (sinergiaJulya >= sinergiaIsabelle && sinergiaJulya >= sinergiaKimberly) {
            return "Julya";
        } else if (sinergiaIsabelle >= sinergiaKimberly) {
            return "Isabelle";
        } else {
            return "Kimberly";
        }
    }

    // Método para obter a sinergia total
    public int getTotalSinergia() {
        return sinergiaJulya + sinergiaIsabelle + sinergiaKimberly;
    }

    // Métodos para obter os pontos individuais de sinergia
    public int getSinergiaJulya() {
        return sinergiaJulya;
    }

    public int getSinergiaIsabelle() {
        return sinergiaIsabelle;
    }

    public int getSinergiaKimberly() {
        return sinergiaKimberly;
    }

    // Método para retornar o valor de sinergia empatada
    public int getEmpatada() {
        return sinergiaEmpatada;
    }
}
