import java.util.Scanner;

public class Capitulo3 {
    private String nomeJogador;
    private Personagem personagemEscolhido;

    public Capitulo3(String nomeJogador, Personagem personagemEscolhido) {
        this.nomeJogador = nomeJogador;
        this.personagemEscolhido = personagemEscolhido;
    }

    public void Capitulo3parte1() {

        // Exibe o desenho do capítulo
        DesenhoCapitulo3.mostrarDesenho();

        // Introdução da história
        System.out.println("Seu grupo segue em direção à Vila de Ravendel, uma vila fronteiriça entre Andoshire e Haset.");
        System.out.println("Ao chegar, você é recebido por uma visão desoladora: Ravendel está em ruínas, com sinais claros de uma batalha recente. As casas estão queimadas, as ruas vazias, e há marcas de destruição por todos os lados.");
        System.out.println(nomeJogador+ ": \"Ravendel está devastada... Nunca vi este lugar tão arruinado. Isso parece recente.\"");

        // Diálogo
        System.out.println("Julya, sempre atenta, anda pelas ruas destruídas até encontrar algo que chama sua atenção.");
        System.out.println("Julya: \"Encontrei algo... São flechas envenenadas dos arqueiros de Haset. Tem a mesma marca da bandeira deles, mas... tem algo estranho nelas.\"");

        System.out.println("Isabelle se aproxima, franzindo a testa ao sentir a energia que emana das flechas.");
        System.out.println("Isabelle: \"Eu consigo sentir... Magia negra, mas não é comum. Essas flechas foram modificadas de alguma forma.\"");

        System.out.println("Kimberly olha ao redor, seu instinto militar aguçado.");
        System.out.println("Kimberly: \"Se Ravendel mostra sinais de uma batalha recente, então o exército de Haset não deve estar longe. O que fazemos agora, " + nomeJogador + "?\"");

        // Decisão do jogador
        System.out.println("Jogador: Nós devemos...");
        System.out.println("1. Procurar por sobreviventes");
        System.out.println("2. Preparar uma emboscada");
        System.out.println("3. Explorar o lado mágico de Ravendel");

        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                procurarSobreviventes();
                break;
            case 2:
                prepararEmboscada();
                break;
            case 3:
                explorarMagia();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                Capitulo3parte1(); // Recomeça se a opção for inválida
                break;
        }
    }
//Se escolher procurar por sobreviventes
    private void procurarSobreviventes() {
        System.out.println("Você: \"Devemos procurar por sobreviventes. Se ajudarmos, eles podem nos contar mais sobre o ataque.\"");
        System.out.println("Julya: \"Boa ideia. Vamos nos separar e vasculhar as ruínas.\"");
        System.out.println("Seu grupo se divide, cada um explorando uma parte diferente da vila.");
        System.out.println("Você caminha pelas ruas devastadas, desviando de destroços e pedaços de construções caídas. Ao entrar em uma velha cabana em ruínas, não encontra sinais de vida. ");
        System.out.println("No entanto, algo incomum chama sua atenção no chão: um artefato estranho, irradiando uma energia sinistra.\n");
        encontrarArtefato();
        momentoDecisao();
    }
//Se escolher preparar emboscada
    private void prepararEmboscada() {
        System.out.println("Você: \"Se o exército de Haset pode estar perto, precisamos estar preparados. Vamos montar uma emboscada e usar o terreno a nosso favor.\"");
        System.out.println("Kimberly sorri com determinação.");
        System.out.println("Kimberly: \"Finalmente! Vamos transformar essas ruínas em uma armadilha perfeita.\"");
        System.out.println("Seu grupo começa a recolher flechas, lâminas quebradas e escudos dos destroços. \n");
        System.out.println("Ao entrar em uma velha cabana em ruínas, não encontra sinais de vida e nem armas. No entanto, algo incomum chama sua atenção no chão: um artefato estranho, irradiando uma energia sinistra.\n");
        encontrarArtefato();
        momentoDecisao();
    }
//Se escolher explorar o lado mágico de Ravendel
    private void explorarMagia() {
        System.out.println("Você: \"Acho que devemos explorar mais a fundo. Ravendel está em uma área de fluxo mágico, e podemos encontrar algo que nos ajude.\"");
        System.out.println("Isabelle acena em aprovação, os olhos dela brilhando de entusiasmo.");
        System.out.println("Isabelle: \"Essa é uma excelente ideia. Talvez encontremos vestígios da magia que Haset está usando.\"");
        System.out.println("O grupo se separa, cada um explorando uma parte diferente da cidade. \n");
        System.out.println("Você caminha pelas estradas de terra, tomando cuidado para desviar dos destroços das construções e das pontas de flechas.");
        System.out.println(" Ravendel parece deserta, até mesmo a velha biblioteca foi queimada e destruída.\n");
        System.out.println("Ao entrar em uma velha cabana em ruínas, não encontra sinais de vida e nem armas. No entanto, algo incomum chama sua atenção no chão: um artefato estranho, irradiando uma energia sinistra.\n");
        encontrarArtefato();
        momentoDecisao();
    }
//Momento de encontrar o artefato
    private void encontrarArtefato() {
        System.out.println("Você: \"Pessoal, vocês precisam ver isso!\"");

        System.out.println("Seu grupo chega rapidamente, todas observando o objeto misterioso em suas mãos.");
        System.out.println("Kimberly: \"O que é isso? Não parece uma arma, nem algo que um camponês de Ravendel teria.\"");
        System.out.println("Julya: \"Parece mais com um artefato mágico.\"");

        System.out.println("Isabelle se aproxima, com os olhos fixos no objeto. Você entrega o artefato a ela.");
        System.out.println("Isabelle: \"Eu consigo sentir... A energia aqui é muito parecida com a que senti nas flechas, só que muito mais intensa. Parece ser um receptáculo, algo capaz de armazenar energias.\"");
        System.out.println("Julya: \"Então os arqueiros de Haset podem ter usado isso para modificar as flechas.\"");

        System.out.println("Kimberly cruza os braços, pensativa.");
        System.out.println("Kimberly: \"É perigoso deixar algo assim para qualquer um usar. O que vamos fazer com isso? Destruímos ou levamos conosco?\"");
    }

    private void momentoDecisao() {
        System.out.println("Jogador: Eu acho que é melhor...");
        System.out.println("1. Destruir e anular a energia");
        System.out.println("2. Levar conosco");

        Scanner scanner = new Scanner(System.in);
        int decisao = scanner.nextInt();

        switch (decisao) {
            case 1:
                destruirArtefato();
                break;
            case 2:
                levarArtefato();
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                momentoDecisao();
                break;
        }
    }
//Se escolher destruir o artefato
    private void destruirArtefato() {
        System.out.println(nomeJogador+ ": \"Nós não podemos deixar algo tão perigoso intacto. Destruí-lo é a melhor escolha. Nem toda magia é a solução.\"");


        System.out.println("Isabelle franze o cenho, claramente incomodada, e seus olhos brilham com um toque de tristeza misturado à relutância. ");

        System.out.println("Ela observa o artefato com um olhar de fascínio e cautela, como se estivesse diante de uma relíquia antiga e poderosa que ainda guarda segredos valiosos.");

        System.out.println("Isabelle: \"Eu não gosto da ideia de destruir algo tão poderoso sem ao menos entendê-lo. Este artefato poderia nos ensinar tanto, talvez até algo que nos ajude em futuras batalhas! Mas… se você acha que essa é a única escolha, eu… respeitarei.\"");

        System.out.println("Ela baixa a cabeça por um momento, hesitante, mas recua para o lado, permitindo que você prossiga.");

        System.out.println("Kimberly bate a mão no ombro de Isabelle com um toque reconfortante, um pequeno sorriso em seu rosto.");

        System.out.println("Kimberly: \"A magia pode ser grandiosa, Isabelle, mas o que aconteceu aqui nos mostra como ela pode sair do controle. Se algo tem o potencial de corromper uma vila inteira, não podemos correr o risco de mantê-lo por perto\"");

        System.out.println("Julya se aproxima, de braços cruzados e olhar sério, mantendo os olhos no artefato que ainda emite uma leve aura sombria.\n" + "\n");

        System.out.println("Julya: \"Confiar cegamente na magia pode nos fazer esquecer de algo essencial: equilíbrio. Existe uma linha tênue entre o uso e o abuso do poder. Eu não digo para ignorarmos a magia… mas às vezes, os riscos são maiores do que os benefícios. E este artefato? Parece mais um fardo do que um presente.\"");

        System.out.println("Isabelle olha para ambas com um semblante misto de indignação e entendimento, lutando com as próprias emoções enquanto tenta encontrar o equilíbrio entre o respeito pelos amigos e sua própria crença na magia.");

        System.out.println("Com um olhar determinado, você e Kimberly levantam suas armas, e com um golpe certeiro, o artefato é destruído");

        System.out.println("No instante em que ele se despedaça, uma explosão silenciosa de energia se dissipa no ar. A aura maligna ao redor da vila começa a se desvanecer lentamente.");

        System.out.println("Julya solta um longo suspiro de alívio, relaxando ao ver que o mal se dispersa.");

        System.out.println("Julya: \" A vila pode finalmente descansar em paz...talvez isso seja o que Ravendel realmente precisava.\"");

        System.out.println("Isabelle: \"Espero que algum dia vocês possam ver a magia pelo que ela também é - uma força que pode curar e transformar, e não apenas ferir ou corromper.\"");

        System.out.println("Apesar de tudo, você se mantém firme em sua escolha!");
    }
//Se escolher levar o artefato
    private void levarArtefato() {
        System.out.println(nomeJogador+ ": ");

        System.out.println("Acho que devemos levar este artefato conosco. Ele pode ser útil no futuro. Toda magia pode ser benéfica, se soubermos como usá-la.");

        System.out.println("Isabelle abre um sorriso de satisfação, seus olhos brilhando com entusiasmo. Ela olha para você com admiração e reconhecimento.");

        System.out.println("Isabelle: \"Você está absolutamente certo. Conhecimento é poder, e cada fonte de magia é uma oportunidade para aprendermos mais.\"");

        System.out.println("Julya e Kimberly, entretanto, trocam olhares inquietos. Julya dá um passo à frente, franzindo as sobrancelhas, claramente desconfortável com a escolha. Ela cruza os braços e suspira, lançando um olhar sério na sua direção.\n" + "\n");

        System.out.println("Julya: \"Não estou tão certa disso… Este artefato já mostrou seu lado sombrio. Vimos o que ele fez com esta vila, com as pessoas. Como podemos garantir que ele não se voltará contra nós, mesmo que o estudemos? Algumas coisas são melhores deixadas para trás.\"");

        System.out.println("Kimberly coloca a mão no ombro de Julya, assentindo em concordância. Sua expressão é tensa, e ela olha para o artefato como se ele fosse uma ameaça latente.\n" + "\n");

        System.out.println("Kimberly: \"Levar algo tão perigoso conosco parece arriscado, e francamente, imprudente. Nem toda magia está aqui para ser dominada. Algumas forças são traiçoeiras demais para serem controladas.\"");

        System.out.println("Julya:  Levar um artefato amaldiçoado como este é como carregar uma chama em meio a um campo de trigo seco. Um único descuido, e estaremos todos queimados. Eu não confio em nada que corrompe tão facilmente.");

        System.out.println("Apesar de tudo, você se mantém firme em sua escolha!");

    }
}

