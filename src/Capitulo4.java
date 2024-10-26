
import java.util.Scanner;

public class Capitulo4 {
    private String nomeJogador;
    private Personagem personagemEscolhido;
    private Sinergia sinergia; // Instância da classe Sinergia
    private Scanner scanner; // Declara o Scanner

    public Capitulo4(String nomeJogador, Personagem personagemEscolhido, Sinergia sinergia) {
        this.nomeJogador = nomeJogador;
        this.personagemEscolhido = personagemEscolhido;
        this.sinergia = sinergia; // Atribui a instância de Sinergia
        this.scanner = new Scanner(System.in);
    }

    public Capitulo4(String nomeJogador, Personagem personagemEscolhido) {
    }

    public void Capitulo4parte1() {
        // Exibe o desenho do capítulo
        DesenhoCapitulo4.mostrarDesenho();

        // Início da narrativa
        System.out.println("Após a revelação do artefato, você e suas amigas começam a se preparar para a próxima etapa da jornada.");

        System.out.println("No entanto, algo no ambiente muda, e o som de trotes de cavalos ecoa ao longe. A tensão no ar cresce.");

        System.out.println(nomeJogador+": \"Vocês ouviram isso?\"");

        System.out.println("Julya: \"Cavalos... Isso só pode significar uma coisa.\"");

        System.out.println("Você e seu grupo saem da cabana rapidamente e se dirigem ao centro da vila se deparam com um grupo de soldados emergindo das sombras");

        System.out.println("À frente deles, está o general de Haset, um guerreiro imponente em armadura negra, com olhos que brilham de maneira sobrenatural. Ele sorri de maneira sinistra.");

        System.out.println("General de Haset: \"Acham que foram espertos, não é? Vagando por Ravendel, investigando o que não deveriam.\"");
        System.out.println("General de Haset: \"Mas saibam que estão sendo observados o tempo todo. Nossa entidade maligna vê tudo. E em breve, a arma que estamos preparando irá reduzir Andoshire a cinzas.\"");
        System.out.println("A risada sinistra do general ecoa pela praça, enquanto seus soldados se posicionam ao redor de vocês, prontos para atacar. Ele ergue uma espada negra envolta em uma aura de magia sombria, o ar ao redor tremula com sua presença.\n");
        System.out.println("Kimberly: \"Não vamos permitir que ele destrua nossa casa! Vamos acabar com isso agora!\"");

        System.out.println("Isabelle: \"Aquela arma... Está imbuída com magia negra. Precisamos ser cuidadosos, ou isso nos custará caro.\"");

        System.out.println("Julya: \"Temos uma chance. Se formos rápidos, podemos encontrar um ponto fraco e terminar essa luta antes que ele tenha a chance de usar todo o poder da espada.\"");
        System.out.println("Você sabe que será uma batalha árdua, mas sente dentro si que tem capacidade para vencer!");

        // Após a batalha
        System.out.println("Após uma luta árdua, a maioria dos soldados inimigos foi derrotada.");
        System.out.println("O general, agora sozinho, mostra sinais de fraqueza.");
        realizarAtaqueDupla();

        // Decisão final do capítulo
        decisaoFinalGeneral();
        concluirCapitulo();
    }

    // Método para realizar o ataque em dupla
    private void realizarAtaqueDupla() {
        System.out.println("Jogador: \"Rápido! Eu vou fazer um ataque em dupla com…\"");
        System.out.println("Escolha sua parceira: \n1 - Kimberly \n2 - Julya \n3 - Isabelle");

        int escolha = scanner.nextInt(); // Reutiliza o scanner já inicializado

        String parceira;
        switch (escolha) {
            case 1:
                parceira = "Kimberly";
                break;
            case 2:
                parceira = "Julya";
                break;
            case 3:
                parceira = "Isabelle";
                break;
            default:
                System.out.println("Escolha inválida. Tente novamente.");
                realizarAtaqueDupla(); // Repete a escolha se for inválida
                return; // Encerra o método após chamar novamente
        }

        // Ganha 1 ponto de sinergia com a parceira escolhida
        sinergia.ajustarSinergia(1);

        // Mensagem descrevendo como foi o ataque
        System.out.println("Com perfeita sincronia, você e " + parceira + " avançam para um ataque em dupla poderoso!");
        System.out.println(parceira + " ataca primeiro, abrindo uma brecha na defesa do inimigo.");
        System.out.println("Aproveitando o momento, você finaliza o ataque com precisão, e juntos causam um dano massivo ao General!");
        System.out.println("A sinergia entre vocês se fortalece, e o impacto deixa o General claramente abalado!");


    }

        // Método corrigido para a decisão final do General
    private void decisaoFinalGeneral() {
        System.out.println("Após a batalha, o general de Haset está gravemente ferido, mas não completamente derrotado. Ele se levanta com dificuldade, sorrindo de forma sinistra.\n");
        System.out.println("General de Haset: \"Vocês acham que isso vai mudar algo? A entidade já nos deu o poder de destruir Andoshire... Vocês estão condenados.\"");

        System.out.println("Kimberly: \"Deveríamos acabar com ele aqui mesmo, cortar o mal pela raíz!\"");
        System.out.println("Isabelle: \"Acalme-se, eu acho que, " +nomeJogador+ " tem algo a dizer.\"");
        System.out.println("Julya: \"O que você acha que devemos fazer," +nomeJogador+ "?");

        System.out.println("O que você deseja fazer com o General?");
        System.out.println("1. Prender o General");
        System.out.println("2. Executar o General");
        System.out.println("3. Libertar o General com um acordo");

        int escolha;

        do {
            System.out.print("Escolha 1, 2 ou 3: ");
            escolha = scanner.nextInt(); // Reutiliza o scanner já inicializado

            if (escolha < 1 || escolha > 3) {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        } while (escolha < 1 || escolha > 3); // Loop até obter uma escolha válida

        // Atribui a ação com base na escolha do jogador
        switch (escolha) {
            case 1:
                System.out.println(nomeJogador + ": \"Não podemos matá-lo. Isso não é certo. Mas também não podemos deixá-lo solto, permitindo que cause mais mal. Vamos deixá-lo preso nas masmorras da vila.\"");
                System.out.println("Isabelle: \"Boa escolha. Matar prisioneiros não nos torna melhores do que eles.\"");
                System.out.println("Kimberly e Julya trocam olhares de preocupação, mas permanecem em silêncio, respeitando sua decisão.");
                System.out.println("Kimberly: \"Espero que ele não tente escapar... e nem traga mais problemas para nós.\"");
                System.out.println("Julya: \"Ainda é perigoso, mesmo atrás das grades. Precisamos ficar atentos.\"");

                System.out.println("Após prenderem o general na masmorra da vila, Isabelle se aproxima das grades, murmurando palavras antigas.");
                System.out.println("Com um gesto preciso, ela lança um feitiço de contenção, fazendo com que uma leve aura mágica envolva as barras, garantindo que ele não escape.");
                System.out.println("Com a prisão assegurada, você e suas companheiras deixam Ravendel para trás, determinadas a seguir em frente em sua jornada.");

                sinergia.ajustarSinergia(1);
                break;
            case 2:
                System.out.println(nomeJogador + ": \"Ele já causou muito mal. Não podemos deixá-lo viver e correr o risco de causar ainda mais destruição.\"");
                System.out.println("Kimberly: \"Finalmente alguém está pensando com clareza. Vamos acabar logo com isso.\"");
                System.out.println("Julya parece hesitar, lançando um olhar breve e incerto para o general, mas ela permanece em silêncio, respeitando sua decisão.");
                System.out.println("Isabelle observa a cena com uma expressão enigmática, sem se opor, mas também sem dar total apoio.");
                System.out.println("Julya: \"Há outras formas de justiça, mas... essa também é uma escolha.\"");
                System.out.println("Isabelle: \"Que sua alma pague o preço pelos crimes que cometeu.\"");

                System.out.println("O general, vendo que sua sentença foi selada, fecha os olhos em resignação.");
                System.out.println("Você cumpre a execução com rapidez, encerrando sua ameaça de uma vez por todas.");
                System.out.println("Ainda que o peso do ato esteja em suas mãos, você e suas companheiras seguem adiante, deixando para trás a vila de Ravendel e tudo o que ela representa.");

                sinergia.ajustarSinergia(1);
                break;
            case 3:
                System.out.println(nomeJogador + ": \"Vamos libertá-lo... com uma condição. Ele nos dará todos os detalhes sobre a arma e a entidade em troca de sua vida.\"");
                System.out.println("Julya: \"Interessante... um pacto de sobrevivência. Se ele trair o acordo, seu destino será selado, tanto física quanto espiritualmente.\"");

                System.out.println("Kimberly olha para você incrédula, sua voz carregada de choque.");
                System.out.println("Kimberly: \"Libertá-lo? Você está brincando, certo?\"");

                System.out.println("Isabelle cruza os braços, seus olhos expressam uma leve inquietação.");
                System.out.println("Isabelle: \"Isso é arriscado... Mas talvez ele tema mais pela própria vida do que por qualquer lealdade a Haset.\"");

                System.out.println("O General olha para cada um de vocês, seu semblante é grave mas intrigado.");
                System.out.println("General: \"Vocês me surpreendem. Pensava que viriam com espadas em punho, não com negociações.\"");

                System.out.println("Ele abaixa a cabeça e suspira, como se calculasse suas próximas palavras.");
                System.out.println("General: \"Muito bem... Falarei o que desejam saber. Haset... nosso rei não é mais o mesmo. Tudo mudou quando ele começou a se reunir com o conselheiro da corte. Aquele conselheiro...algo nele me dá arrepios, é como se não fosse humano.\"");

                System.out.println("O General parece hesitar, mas continua, sua voz baixa e distante.");
                System.out.println("General: \"Embora o rei tenha iniciado a guerra, não acredito que ele seja mau em essência. Alguma coisa... ou alguém, o transformou.\"");

                System.out.println("Você pondera, sem saber ao certo se deveria acreditar nele, mas o acordo foi feito.");
                System.out.println("Com um último olhar de advertência, você libera o General, mantendo-se vigilante quanto a uma possível traição.");

                System.out.println("Você e suas companheiras, agora com novas informações sobre Haset, deixam a vila de Ravendel para trás, incertas do que está por vir mas confiantes de que deram um passo à frente na missão.");

                sinergia.ajustarSinergia(1); // Ganha 1 ponto de sinergia com Julya
                break;
        }
    }

    // Método para encerrar o capítulo
    private void concluirCapitulo() {
        System.out.println("O caminho para Haset era envolto em um silêncio inquietante, onde até mesmo o vento parecia hesitar em soprar.");
        System.out.println("As belas paisagens que outrora adornavam a região haviam sido substituídas por um cenário sombrio e desolador.");
        System.out.println("Árvores que antes floresciam com vida agora eram esqueletos retorcidos, suas folhas há muito desaparecidas, deixando galhos secos e quebradiços que se erguiam como mãos implorando ao céu.");
        System.out.println("A vegetação, outrora exuberante e verdejante, murchara, reduzida a arbustos ressequidos e gramíneas mortas, que estalavam sob os pés a cada passo dado.");

        System.out.println("O solo, outrora fértil e vibrante, estava coberto por rachaduras profundas, como se a terra tivesse sido abandonada pela vida.");
        System.out.println("A atmosfera era pesada e densa, carregada de um odor acre de decomposição que invadia os pulmões e fazia o ar parecer sufocante.");
        System.out.println("A luz do sol, que antes iluminava o caminho, agora era filtrada por nuvens espessas e escuras, tingindo tudo com um tom cinzento e opressivo.");
        System.out.println("Nem os pássaros cantavam mais, e os sons da natureza haviam sido substituídos por um silêncio fúnebre, interrompido apenas pelo ocasional farfalhar distante, como se algo estivesse espreitando nas sombras.");

        System.out.println("Ao longe, montanhas áridas e escarpadas recortavam o horizonte, suas faces cobertas por uma fina névoa que tornava tudo indistinto, como se o próprio tempo estivesse se esvaindo daquele lugar.");
        System.out.println("As águas dos riachos que antes corriam cristalinas agora eram escuras e estagnadas, refletindo apenas a decadência ao redor.");
        System.out.println("Até mesmo o céu parecia morto, tingido de um vermelho pálido e doentio, dando a sensação de que Haset se aproximava de um fim inevitável.");

    }
}
