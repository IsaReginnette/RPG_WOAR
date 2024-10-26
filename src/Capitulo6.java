import java.util.Scanner;

public class Capitulo6 {
    private final String nomeJogador;
    private final Personagem personagemEscolhido;
    private Sinergia sinergia; // Instância da classe Sinergia
    private final Scanner scanner; // Scanner como instância

    public Capitulo6(String nomeJogador, Personagem personagemEscolhido, Sinergia sinergia) {
        this.nomeJogador = nomeJogador;
        this.personagemEscolhido = personagemEscolhido;
        this.sinergia = this.sinergia; // Atribui a instância de Sinergia
        this.scanner = new Scanner(System.in); // Inicializa o Scanner aqui no construtor
    }

    public void Capitulo6parte1() {
     DesenhoCapitulo6.mostrarDesenho();
        System.out.println("O campo de batalha está coberto por fumaça,");
        System.out.println("o cheiro de magia e aço no ar. Você está exausto,");
        System.out.println("e as guerreiras ao seu lado também estão perto de seus limites,");
        System.out.println("mas o Rei de Haset, ferido e debilitado, ainda se mantém de pé.");
        System.out.println("Sua armadura está quebrada, e seu rosto, antes altivo e imponente,");
        System.out.println("agora revela cansaço e desespero.");

        System.out.println("O rei solta um grito de raiva, segurando sua espada,");
        System.out.println("que brilha com o poder da entidade maligna que o consome.");
        System.out.println("Seu corpo está tremendo, a corrupção o devorando por dentro.");
        System.out.println("Ele tenta mais um ataque, mas sua força o abandona no meio do golpe,");
        System.out.println("e ele cai de joelhos diante de você.");

        System.out.println("Rei de Haset: \"Isso... não pode... acabar assim... Eu... fui escolhido... pela entidade... o poder deveria ser meu!\"");

        System.out.println("Sua voz falha, enquanto o brilho em seus olhos começa a desvanecer.");
        System.out.println("A entidade que uma vez o fortaleceu agora o abandona.");
        System.out.println("Você se aproxima, sentindo o peso de sua próxima decisão.");
        System.out.println("Sua espada está pronta, o rei indefeso diante de você.");

        System.out.println("Isabelle: ");
        System.out.println("Isabelle:\"É o fim... Mas o que você vai fazer agora,"+nomeJogador+"? Ele ainda está vivo.\"");

        System.out.println("Julya: \"Ele não tem mais forças para lutar. Mas será que ele tem informações sobre a entidade? Talvez possamos extrair mais dele.\"");

        System.out.println("Kimberly: \"Acabe logo com isso! Ele já causou destruição demais! Não podemos correr o risco de deixá-lo viver.\"");

        System.out.println("O rei levanta a cabeça, respirando com dificuldade.");
        System.out.println("Seus olhos encontram os seus, e por um breve momento,");
        System.out.println("há uma súplica silenciosa em seu olhar. Ele sabe que perdeu.");

        System.out.println("Rei de Haset:\"Andoshire... não está... a salvo... mesmo agora... a entidade... ainda existe...\"");

        System.out.println("Você se prepara para o golpe final.");
        System.out.println("Mas algo o faz hesitar. As palavras dele ressoam em sua mente,");
        System.out.println("e por um momento, você percebe que há algo além desse conflito imediato.");
        System.out.println("A entidade maligna ainda está à espreita,");
        System.out.println("e derrotar o rei não necessariamente acabará com a ameaça.");

        System.out.println("Você escuta sussurros, que ecoam dentro de sua mente e parecem tocar em sua alma.");
        System.out.println("???: \"Você sabe que matá-lo não irá acabar comigo, eu só irei me apoderar de outra pessoa...\"");

        System.out.println(nomeJogador+": \"Quem é você? De onde vem essa voz?!\"");

        System.out.println("???: \"Eu sou a canalização dos seus desejos, eu consigo ver através de você...");
        System.out.println("Eu sei o que você realmente quer.\"");

        System.out.println(nomeJogador+": \"Você não sabe nada sobre mim!\"");

        System.out.println("???: \"Eu sei tudo sobre você. Estive te observando na sua volta para Andoshire, na floresta, na vila, no caminho até aqui...");
        System.out.println("Eu sou o personagem misterioso que esteve te acompanhando.");
        System.out.println("???: \"E eu sei que você merece mais do que ser apenas um simples"+personagemEscolhido+".");
        System.out.println("Me diga, o que fará depois de terminar essa luta?");
        System.out.println("Você voltará para Andoshire, deixando toda a glória para os governantes de sua terra natal e dessas guerreiras que dizem ser suas amigas...\"");

        System.out.println(nomeJogador+": \"...\"");

        System.out.println("???: \"Se o meu poder estivesse em você, teria tudo que quisesse... Força, inteligência, velocidade, magia, respeito, admiração.");
        System.out.println("Seria o governante de algo muito maior do que Haset e Andoshire juntos.\"");

        System.out.println(nomeJogador+": \"...E-eu...\"");

        System.out.println("???: \"Junte-se a mim, e todas as portas se abrirão para você...\"");

        System.out.println(nomeJogador+": \"O que eu devo fazer?\"");


        System.out.println("1 - Prosseguir com a luta e dar o golpe final no Rei.");
        System.out.println("2 - Hesitar e seguir a voz da entidade.");

        int escolha = scanner.nextInt(); // Agora usa o scanner de instância

        if (escolha == 1) {
            prosseguirComALuta();
        } else if (escolha == 2) {
            hesitarESeguirEntidade();
        } else {
            System.out.println("Escolha inválida.");
        }
    }

    private void prosseguirComALuta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(nomeJogador+": \"Não! Não há poder maligno que possa mudar meu caráter ou ser mais importante do que a paz!\"");

        System.out.println("???: \"Você vai se arrepender de ter feito isso! Poderíamos ter sido brilhantes juntos.\"");

        System.out.println(nomeJogador+": \"Eu vou terminar o que já deveria ter terminado há muito tempo, vou trazer paz à Andoshire e Haset!\"");

        System.out.println(nomeJogador+": \"Esse é o fim para você, rei. Mesmo que não seja o fim da entidade.\"");

        System.out.println("Com um último impulso, você golpeia o rei, mas evita matá-lo.");
        System.out.println("A lâmina corta sua armadura e o derruba, sem, no entanto, tirar sua vida.");
        System.out.println("Ele cai ao chão, a espada dele escapando de suas mãos.");

        System.out.println("Rei de Haset: \"Então... eu... falhei...\"");

        System.out.println("Ele perde a consciência, derrotado, mas ainda vivo.");

        System.out.println("Você sente que é o momento de fazer uma escolha, baseado em tudo que você vivenciou e aprendeu...");
        System.out.println(nomeJogador+":Eu sinto que...");

        System.out.println("1 - 'A paz só poderá ser verdadeiramente alcançada através da diplomacia, eu sei que há uma maneira melhor de resolver as coisas.'");
        System.out.println("2 - 'A magia pode ser algo harmônico e transformador, ela é a verdadeira chave para a paz neste mundo.'");
        System.out.println("3 - 'Precisamos de limites e disciplina para vivemos de forma equilibrada, ás vezes alguns devem ser sacrificados pelo bem da maioria.'");
        System.out.println("4 - 'Podemos seguir nosso próprio caminho sem amarras ou expectativas, vamos ver o que futuro nos reserva.'");

        int escolhaFinal = scanner.nextInt();

        switch (escolhaFinal) {
            case 1:
                DiplomataDaPaz diplomataDaPaz = new DiplomataDaPaz();
                diplomataDaPaz.mostrarFinal();
                break;
            case 2:
                ControleMagico controleMagico = new ControleMagico();
                controleMagico.mostrarFinal();
                break;
            case 3:
                SolucaoMilitar solucaoMilitar = new SolucaoMilitar();
                solucaoMilitar.mostrarFinal();
                break;
            case 4:
                FinalNeutro finalNeutro = new FinalNeutro();
                finalNeutro.mostrarFinal();
                break;
            default:
                System.out.println("Escolha inválida. Por favor, escolha um número de 1 a 4.");
                prosseguirComALuta();  // Chama novamente o método para repetir a escolha
                break;
        }

    }

    private void hesitarESeguirEntidade() {
        System.out.println("Se escolher hesitar");

        System.out.println(nomeJogador+": \"Todas as portas se abrirão para mim...\"");

        System.out.println("???: \"Exatamente, você poderá moldar esse mundo à sua vontade... só precisa se entregar para mim.\"");

        System.out.println("Você ergue sua arma, pronto para dar o golpe final e acabar com o Rei de Haset,");
        System.out.println("mas a voz da entidade te impede de seguir em frente.");
        System.out.println("O brilho sombrio nos olhos dele e as palavras sobre a entidade ainda ecoam dentro de você.");
        System.out.println("O campo de batalha está em silêncio. Isabelle, Julya e Kimberly aguardam, confiando em sua decisão.");

        System.out.println("Você baixa a espada lentamente, sem realizar o golpe fatal.");
        System.out.println("As guerreiras ao seu lado reagem imediatamente.");

        System.out.println("Kimberly: \"O que você está fazendo?! Termine logo com isso!\"");

        System.out.println("Isabelle: \"Há algo errado... Eu sinto... uma mudança na sua aura.\"");

        System.out.println("Julya: \"Você não pode hesitar agora! Ele vai se recuperar!\"");

        System.out.println("O Rei de Haset, ainda de joelhos, percebe sua hesitação e sorri, um sorriso fraco, mas cheio de malícia.");

        System.out.println("Rei de Haset: \"Você sente isso, não sente? O poder... você o quer. Eu posso ver em seus olhos.\"");

        System.out.println("Nesse momento, tudo se alinha, você sente como se o mundo estivesse na palma de sua mão.");

        System.out.println(nomeJogador+": \"Não... eu não vou acabar com isso. O poder da entidade é meu para tomar.\"");

        System.out.println("As guerreiras olham para você com horror, percebendo a gravidade de sua decisão.");

        System.out.println("Kimberly: \"Traidor! Eu sabia que não podíamos confiar em você!\"");

        System.out.println("Julya: \"Por quê? Nós lutamos juntos! Como pode fazer isso?\"");

        System.out.println("Isabelle: \"Você não entende! O poder da entidade vai te consumir! Isso é loucura!\"");

        System.out.println("Mas é tarde demais. Você estende a mão em direção ao rei,");
        System.out.println("e uma conexão se forma entre você, o Rei de Haset e a entidade.");
        System.out.println("O poder sombrio começa a fluir através de você, um calor intenso preenchendo cada fibra do seu ser.");
        System.out.println("O Rei de Haset começa a se levantar, a vitalidade retornando a ele,");
        System.out.println("mas agora, ele não é mais seu mestre — você é o verdadeiro dono do poder.");

        System.out.println("Kimberly: \"Você planejou isso o tempo todo! Como você pôde nos trair assim?\"");

        System.out.println("Julya: \"Você... nos usou... para se fortalecer.\"");

        System.out.println("Isabelle: \"A magia dentro de você... é perigosa demais. Não podemos permitir que você continue assim.\"");

        System.out.println(nomeJogador+": \"Vocês não entendem... Isso não é o fim. Isso é o começo de algo muito maior.\"");

        FinalTraidor finalTraidor = new FinalTraidor();
        FinalTraidor.mostrarFinal();


        // Adicione mais lógica de consequência aqui, se necessário
    }

    // Método para fechar o Scanner ao final
    public void fecharScanner() {
        scanner.close();
    }
}
