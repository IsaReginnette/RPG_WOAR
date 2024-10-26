import java.util.Scanner;

public class Capitulo2 {
    private String nomeJogador;  // Altera para String
    private Sinergia sinergia;   // Renomeia para seguir a convenção de nomenclatura

    public Capitulo2(String nomeJogador, Sinergia sinergia) {  // Altera o tipo de 'jogador'
        this.nomeJogador = nomeJogador;
        this.sinergia = sinergia;  // Altera para usar 'sinergia'
    }

    public void capitulo2parte1() {
        DesenhoCapitulo2.mostrarDesenho();
        System.out.println("Após o treinamento intenso na floresta, seu grupo se encontra mais sincronizado, mas a jornada está apenas começando. Vocês seguem em frente, caminhando por trilhas tortuosas e terrenos incertos, onde o vento frio carrega um presságio de perigos adiante. As guerreiras ao seu lado estão em alerta, suas armas prontas, e você sente que cada escolha pode ser crucial.\n");
        System.out.println("Ao seguir para o norte, algo no ar muda. Uma presença maligna se aproxima, e um calafrio percorre sua espinha. Antes que você e suas amigas possam reagir, ogros gigantes surgem da floresta, bloqueando seu caminho. Suas enormes mãos seguram porretes enquanto eles rosnam ameaçadoramente. O caminho está obstruído, e você precisa decidir como lidar com essa ameaça.\n");

        // MOMENTO DECISÃO
        int escolha = fazerEscolha();

        // Lidar com a escolha do jogador
        switch (escolha) {
            case 1: // Combate direto
                combateDireto();
                break;
            case 2: // Estratégia à distância
                estrategiaADistancia();
                break;
            case 3: // Ataque mágico
                ataqueMagico();
                break;
            default:
                System.out.println("Escolha inválida!");
                break;
        }

        // Encontro com o espião
        encontrarEspiao();
    }

    private int fazerEscolha() {
        System.out.println("Jogador: Eu sugiro...");
        System.out.println("1. Combate direto ");
        System.out.println("2. Estratégia à distância ");
        System.out.println("3. Ataque mágico ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void combateDireto() {
        System.out.println("Você sente que um ataque frontal é a melhor estratégia. Sem pensar duas vezes, Kimberly se coloca à frente, sua espada erguida, pronta para o confronto.\n");
        System.out.println("Kimberly: \"Vamos encarar isso de frente! Peguem suas armas e sigam-me! Nada pode nos parar!\"");
        System.out.println("Ela avança com ferocidade, liderando o ataque direto. Você sente a adrenalina correr pelas veias enquanto combate ao lado dela, utilizando toda sua habilidade de combate.");
        sinergia.ajustarSinergia(1); // Corrigido: usa a instância 'sinergia'
    }

    private void estrategiaADistancia() {
        System.out.println("A prudência sugere que enfraquecer os inimigos à distância seria mais sábio. Julya observa o campo de batalha com olhos aguçados e puxa uma flecha de seu arco.\n");
        System.out.println("Julya: \"Eu distraio eles com uma flecha certeira. Você se esgueira pelas sombras e ataca por trás, enquanto o resto espera pelo momento certo. Eles nunca vão ver o que os atingiu!\"");
        System.out.println("\n" + "Seu coração acelera enquanto a estratégia se desenrola. Sob a liderança de Julya, sua velocidade é posta à prova, e seus ataques rápidos e furtivos combinam-se com a precisão letal da arqueira.\n");
        sinergia.ajustarSinergia(1); // Corrigido: usa a instância 'sinergia'
    }

    private void ataqueMagico() {
        System.out.println("Sentindo que a magia seria a solução ideal para conter o perigo, você se volta para Isabelle, que já ergue suas mãos, pronta para conjurar o feitiço certo.");
        System.out.println("Isabelle: \"Vamos usar nossas magias em conjunto. Confie em mim, eu sei exatamente o feitiço para isso.\"");
        System.out.println("A magia de Isabelle envolve o campo de batalha, você utiliza toda sua inteligência e sente a energia fluir através de você. Juntos, vocês usam poderosos encantamentos para controlar o ambiente, diminuindo as defesas dos ogros e evitando o confronto direto.");
        sinergia.ajustarSinergia(1); // Corrigido: usa a instância 'sinergia'
    }

    private void encontrarEspiao() {
        System.out.println("A batalha termina com os ogros caídos ou fugindo para a floresta, derrotados. No entanto, antes de poderem continuar, seu grupo encontra um homem caído entre os arbustos. Ele está gravemente ferido, com a mão pressionando um ferimento no lado do corpo. Isabelle rapidamente o reconhece.");
        System.out.println("Isabelle: \"É um espião de Haset! Ele provavelmente foi enviado para descobrir nossas fraquezas, mas parece que foi atacado pelos ogros.\"");
        System.out.println("O homem geme de dor, mas ele pode ter informações valiosas sobre a situação em Haset. Você precisa decidir o que fazer com ele.\n");

        // MOMENTO DECISÃO com o espião
        int escolhaEspiao = fazerEscolhaEspiao();

        switch (escolhaEspiao) {
            case 1:
                interrogatorioConversa();
                break;
            case 2:
                forca();
                break;
            case 3:
                magiaDaVerdade();
                break;
            default:
                System.out.println("Escolha inválida!");
                break;
        }

        System.out.println("Após interagir com o espião, vocês continuam a jornada, finalmente chegando a uma velha vila em ruínas. O local foi devastado pela guerra, e o silêncio opressor traz uma sensação de perda e destruição. O que os espera daqui em diante é um mistério, mas uma coisa é certa: os desafios estão apenas começando.");
    }

    private int fazerEscolhaEspiao() {
        System.out.println("Jogador: Ele pode ter informações valiosas, eu acho que nós devemos...");
        System.out.println("1. Interrogá-lo com uma conversa ");
        System.out.println("2. Forçá-lo a responder ");
        System.out.println("3. Usar magia da verdade para invadir seus pensamentos ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void interrogatorioConversa() {
        System.out.println("Julya concorda com você, ela também acha que uma abordagem amigável poderia render melhores informações. Talvez conquistando a confiança dele, ele possa se tornar um aliado.");
        System.out.println("Julya: \"Ele está ferido e vulnerável. Talvez se mostrarmos compaixão, ele revele o que sabe. Confie em mim.\"");
        System.out.println("\n" + "Você se aproxima do espião com calma, oferecendo ajuda e palavras gentis.\n");
        System.out.println(nomeJogador+ ":Estamos em guerra, mas isso não significa que precisamos ser inimigos mortais. Diga-nos o que está acontecendo em Haset. Por que o reino de vocês se voltou contra o nosso?");
        System.out.println("O espião olha para você, seus olhos cansados, mas após alguns momentos de hesitação, ele começa a falar de maneira lenta. Sua abordagem suave funciona, e Julya sorri levemente, satisfeita com o resultado.");
        System.out.println("Espião: \"Nunca conheci guerreiros com corações bondosos como vocês, então merecem saber a verdade...O Rei está diferente, eu consigo sentir algo na áurea dele, o olhar dele parece sombrio e corrompido. Embora seja meu dever serví-lo, eu precisei me afastar...A energia que o ronda é perigosa, mas também extremamente seduutora, ela corrompeu o coração do velho rei. Se realmente quiserem salvar Andoshire, deverão ter muito cuidado!\"");
        System.out.println(nomeJogador+ "Parece que é possível resolver os problemas com diálogo e diplomacia...Agora podemos partir para Haset sabendo o que nos espera!");
        sinergia.ajustarSinergia(1);
    }

    private void forca() {
        System.out.println("Kimberly concorda com você, ela também acha que a força é a única que um espião entederia");
        System.out.println("Kimberly: \"Não podemmos arriscar. Ele precisa falar, e rápido. Vamos forçá-lo!\"");
        System.out.println("Você segue o conselho de Kimberly e adota uma postura intimidadora, ameaçando o espião com seu machado.");
        System.out.println(nomeJogador+ ": \"Você vai nos contar o que sabe, agora, ou vamos garantir que essa seja a última vez que você tenta espionar Andoshire.\"");
        System.out.println("Com uma voz firme e ameaçadora, você pressiona o espião, e mesmo relutante, ele solta algumas informações entre os gemidos de dor, deixando claro que não gostaria de colaborar mais do que o necessário.");
        System.out.println("Espião: \"Como sempre, o povo de Andoshire está se intrometendo onde não foram chamados! Mas vocês não vão durar muito, a entidade que se aliou ao rei é muito poderosa, vocês não terão a menor chance!\"");
        System.out.println(nomeJogador+ ": Parece que ele não vai colaborar muito...Mas pelo menos já sabemos que tipo de desafio nos espera!");
        sinergia.ajustarSinergia(1);
    }

    private void magiaDaVerdade() {
        System.out.println("Isabelle concorda com você, ela também acha que a magia pode ser muito útil em ocasiões como esta, mesmo que isso tenha um custo alto.");
        System.out.println("Isabelle: \"Se ele não falar por conta própria, podemos descobrir o que queremos direto da mente dele. Mas...isso pode destruí-lo.\"");
        System.out.println("Você consente, e juntos vocês invadem a mente do espião com um feitiço poderoso. As memórias dele se revelam diante de seus olhos. No entanto, quando o feitiço termina, o espião está em um estado lamentável, sua mente completamente quebrada pela força da magia.");
        System.out.println(nomeJogador+ ": Consigo ver claramente a situação de Haset pelas memórias do espião, parece que há algo que alterou a natureza do rei...Mesmo que tenhamos destuído a mente dele, pelo menos agora temos mais informações sobre o que nos aguarda!");
        sinergia.ajustarSinergia(1);
    }
}
