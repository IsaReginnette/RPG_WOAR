import java.util.InputMismatchException;
import java.util.Scanner;

public class Capitulo1 {
    private Scanner scanner = new Scanner(System.in);
    private String nomeJogador;
    private Personagem personagemEscolhido;
    private Sinergia sinergia; // Instância da classe Sinergia

    // Construtor da classe
    public Capitulo1(String nomeJogador, Personagem personagemEscolhido) {
        this.nomeJogador = nomeJogador;
        this.personagemEscolhido = personagemEscolhido;
        this.sinergia = new Sinergia(); // Inicializa a sinergia
    }

    // Ordem dos eventos do capitulo
    public void capitulo1parte1() {
        DesenhoCapitulo1.mostrarDesenho();
        introducaoAoCapitulo();
        mostrarDialogosIniciais();
        mostrarDialogoPersonagem();

        System.out.println("\nApós reencontrar suas antigas amigas, vocês seguem diretamente à Floresta de Ivalin, um lugar denso e cheio de vida, mas que agora apresenta sinais de corrupção pela magia sombria de Haset. Logo ao adentrar, vocês percebem que este não será um caminho simples.");
        DesenhoFloresta.mostrarDesenho();
        capitulo1parte2();
    }

    // Segunda parte do capítulo
    public void capitulo1parte2() {
        System.out.println("\nApós entrar na Floresta de Ivalin, vocês sentem uma tensão crescente no ar.");
        System.out.println("Kimberly: \"Antes de enfrentarmos o verdadeiro mal, talvez seja sábio treinarmos um pouco. O caminho adiante será árduo, e só o trabalho em equipe nos salvará.\"");
        System.out.println("Isabelle: \"A magia de Haset é poderosa, e não sabemos o quanto ele já corrompeu desta terra. Nos fortalecer antes de prosseguir pode ser nossa melhor chance.\"");
        System.out.println("Julya: \"A Floresta de Ivalin guarda mais do que aparenta. Eu sinto que algo nos observa... A batalha que nos espera não será só de força, mas também de astúcia e rapidez. Se estivermos prontos, podemos superar.");
        System.out.println("Você observa as três guerreiras à sua frente, cada uma com habilidades únicas e um papel crucial na jornada. O caminho à frente é traiçoeiro, e você sente que precisa estar preparado para o que está por vir. Treinar com uma delas parece ser uma escolha sensata.");
        System.out.println(nomeJogador+ ":Eu devo escolher uma delas para lutar e praticar minhas habilidades antes de embarcarmos nesta jornada. Cada uma delas pode me oferecer algo diferente, algo que possa me dar uma vantagem crucial. Eu escolho…");


        // Escolha da mentora para treinar
        System.out.println("\nEscolha sua mentora para treinar:");
        System.out.println("1. Julya");
        System.out.println("2. Kimberly");
        System.out.println("3. Isabelle");

        int escolhaMentora = -1;
        while (escolhaMentora < 1 || escolhaMentora > 3) {
            try {
                escolhaMentora = scanner.nextInt();
                if (escolhaMentora < 1 || escolhaMentora > 3) {
                    System.out.println("Opção inválida! Por favor, escolha 1, 2 ou 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.next(); // Limpa o scanner
            }
        }

        Personagem mentoraEscolhida = null;

        switch (escolhaMentora) {
            case 1:
                mentoraEscolhida = new Julya();
                break;
            case 2:
                mentoraEscolhida = new Kimberly();
                break;
            case 3:
                mentoraEscolhida = new Isabelle() {
                    @Override
                    public String getClasse() {
                        return "";
                    }
                };
                break;
        }

        System.out.println("Você escolheu treinar com " + mentoraEscolhida.getClass().getSimpleName() + "!");

        // Diálogo da mentora
        System.out.println(mentoraEscolhida.getNome() + ": \"Vamos começar o treinamento...\"");


        // Simulação de combate
        int vidaJogador = 10;
        int vidaMentora = 10;
        while (vidaJogador > 0 && vidaMentora > 0) {
            System.out.println("\nEscolha sua ação:");

            // Exibir opções dependendo da classe do jogador
            if (personagemEscolhido instanceof Julya) {
                System.out.println("1. Atacar");
                System.out.println("2. Usar habilidade especial");
                System.out.println("3. Defender");
            } else if (personagemEscolhido instanceof Kimberly) {
                System.out.println("1. Atacar");
                System.out.println("2. Usar habilidade especial");
                System.out.println("3. Defender");
            } else if (personagemEscolhido instanceof Isabelle) {
                System.out.println("1. Atacar");
                System.out.println("2. Usar habilidade especial");
                System.out.println("3. Defender");
            } else {
                System.out.println("1. Atacar");
                System.out.println("2. Usar Habilidade");
                System.out.println("3. Defender");
            }

            int acao = -1;
            while (acao < 1 || acao > 3) {
                try {
                    acao = scanner.nextInt();
                    if (acao < 1 || acao > 3) {
                        System.out.println("Ação inválida! Por favor, escolha 1, 2 ou 3.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, insira um número válido.");
                    scanner.next(); // Limpa o scanner
                }
            }

            // Variável para controlar se o jogador está defendendo
            boolean defendendo = false;

            switch (acao) {
                case 1: // Atacar
                    int dano = 2; // Dano ao atacar
                    vidaMentora -= dano;
                    System.out.println("Você atacou " + mentoraEscolhida.getNome() + " e causou " + dano + " de dano!");
                    break;
                case 2: // Usar habilidade
                    int danoHabilidade = 3; // Dano ao usar habilidade
                    vidaMentora -= danoHabilidade;
                    System.out.println("Você usou sua habilidade e causou " + danoHabilidade + " de dano!");
                    break;
                case 3: // Defender
                    System.out.println("Você se prepara para defender!");
                    defendendo = true; // O jogador está defendendo
                    break;
            }

            // A mentora ataca de volta
            int danoMentora = 2; // Dano fixo da mentora
            if (defendendo) {
                vidaJogador -= 1; // Reduz apenas 1 de vida se o jogador estiver defendendo
                System.out.println(mentoraEscolhida.getNome() + " ataca, mas você defendeu e perdeu apenas 1 de dano!");
            } else {
                vidaJogador -= danoMentora; // Dano normal se não estiver defendendo
                System.out.println(mentoraEscolhida.getNome() + " ataca e causa " + danoMentora + " de dano!");
            }

            // Mostrar a vida restante
            System.out.println("Sua vida: " + vidaJogador);
            System.out.println(mentoraEscolhida.getNome() + " - vida: " + vidaMentora);
        }

        // Resultado do combate
        if (vidaJogador <= 0) {
            System.out.println("Você foi derrotado! Treinamento finalizado.");
        } else {
            System.out.println("Você completou o treinamento com sucesso!");

            // Aumentar sinergia conforme mentora escolhida
            if (mentoraEscolhida instanceof Julya) {
                sinergia.ajustarSinergia(1); // Aumenta a sinergia de Julya
                System.out.println("Julya está satisfeita com suas habilidades de combate.");
                System.out.println("Julya: \"A verdadeira arte é a diplomacia, ela é como um arco esticado: cada escolha é um movimento, cada palavra uma flecha. Lembre-se, é na paciência e na escuta que a paz se conquista; não subestime o poder do diálogo em um campo de batalha.\"");
            } else if (mentoraEscolhida instanceof Kimberly) {
                sinergia.ajustarSinergia(1); // Aumenta a sinergia de Kimberly
                System.out.println("Kimberly está satisfeita com suas habilidades de combate.");
                System.out.println("Kimberly: \"As batalhas são como táticas em um tabuleiro de xadrez: cada movimento deve ser pensado, e cada decisão pode ser a diferença entre a vitória e a derrota. Aprenda a prever os passos de seu inimigo, e você encontrará a chave para a vitória em qualquer batalha.\"");
            } else if (mentoraEscolhida instanceof Isabelle) {
                sinergia.ajustarSinergia(1); // Aumenta a sinergia de Isabelle
                System.out.println("Isabelle está satisfeita com suas habilidades de combate.");
                System.out.println("Isabelle: \"A magia é um delicado fio que une a intenção à realização. Cada feitiço é uma dança; se você não guiar seus passos com precisão, poderá se perder na tempestade que cria. A verdadeira força vem da harmonia entre confiança e poder.\"");
            }
            System.out.println("Agora que realizaram seu primeiro treino, vocês se sentem prontos para prosseguir!");

            System.out.println("✧ ‧˚₊ ❆ ‧ ₊ ⊹˚✧ ‧Fim do Capítulo 1˚₊ ❆ ‧ ₊ ⊹˚✧ ‧˚₊ ❆ ‧ ₊ ⊹˚✧ ‧˚₊ ❆ ‧ ₊ ⊹˚");
        }

    }

    // Introdução ao capítulo
    private void introducaoAoCapitulo() {
        System.out.println("✧ ‧˚₊ ❆ ‧ ₊ ⊹˚✧ ‧˚₊ ❆ ‧ ₊ ⊹˚✧ ‧˚₊ ❆ ‧ ₊ ⊹˚✧ ‧˚₊ ❆ ‧ ₊ ⊹\"✧ ‧˚₊ ❆ ‧ ₊ ⊹˚✧ ‧˚₊ ❆ ‧ ₊ ⊹˚✧ ‧˚₊ ❆ ‧ ₊ ⊹˚✧ ‧˚₊ ❆ ‧ ₊˚");

        System.out.println("No distante reino de Andoshire, prosperava uma sociedade marcada pela paz, onde humanos e criaturas mágicas conviviam em perfeita harmonia. O reino era um refúgio de tranquilidade, um lugar onde a natureza e a magia se entrelaçavam em um equilíbrio delicado. \n");

        System.out.println("Você retornou ao reino onde nasceu e viveu grande parte da vida, onde a paz sempre reinou. Mas, algo estava diferente. Ao caminhar pelas ruas que uma vez conheceu tão bem, você percebeu que o ar estava mais pesado, as conversas eram sussurros e o medo pairava sobre o povo.\n");

        System.out.println("No coração deste reino, viviam três guerreiras mágicas, suas antigas amigas e companheiras de aventuras. Kimberly, a destemida guerreira cuja espada era mais afiada que qualquer lâmina forjada por mãos humanas; Julya, a arqueira cujos olhos enxergavam alvos a milhas de distância e cujo disparo jamais errava; e Isabelle, a fada que dominava as magias mais poderosas, emanando um brilho sereno, mas cheio de força.\n");

        System.out.println("Agora, a paz de Andoshire estava prestes a ser quebrada de maneira devastadora. Rumores sinistros se espalhavam pelos corredores das tavernas e pelas vilas do reino. Haset, o reino vizinho, uma vez pacífico e diplomático, agora atacava sem piedade. Sussurros falavam de uma entidade maligna, uma força antiga e sombria que havia corrompido o coração do rei de Haset. Alguns diziam que Haset havia encontrado uma arma de poder inimaginável, uma capaz de destruir reinos inteiros.");

        System.out.println("Você observava as sombras se estenderem sobre os campos e montanhas de Andoshire, sentindo que o tempo para agir estava se esgotando. Os ataques de Haset se tornavam mais frequentes, mais brutais. Com cada dia que passava, o caos corroía a paz que tanto amava. Kimberly, Julya e Isabelle sabiam que não poderiam esperar mais. Elas precisavam partir para Haset, enfrentar essa ameaça de frente antes que fosse tarde demais.\n");

        System.out.println("E foi então que você, após anos longe de casa, as reencontrou. O que antes era uma amizade repleta de aventuras havia se transformado em algo mais profundo, mais urgente. Elas precisavam de você, assim como você delas.\n");
    }

    // Diálogos iniciais
    private void mostrarDialogosIniciais() {
        System.out.println("\nKimberly: \"Há quanto tempo, " +nomeJogador+ " ... Achei que nunca mais te veria. Mas parece que o destino nos uniu de novo, e justamente em tempos tão sombrios.\"");
        System.out.println(nomeJogador + ": \"Não pude ignorar o que está acontecendo. O que houve com o reino?\"");
        System.out.println("Isabelle: \"Haset está sob a influência de uma força sombria. Precisamos agir, " +nomeJogador+ " , ou tudo estará perdido. A destruição já começou.\"");
        System.out.println("Agora, você não era mais um observador passivo. Unia-se a elas, não como o jovem inexperiente que partiu de Andoshire, mas como alguém que carregava consigo a sabedoria e as cicatrizes de incontáveis batalhas. \n");
        System.out.println("A jornada à frente seria repleta de perigos desconhecidos, inimigos implacáveis e armadilhas traiçoeiras. Somente a confiança mútua e o trabalho em equipe poderiam dar a elas — e a você — a chance de derrotar o grande mal que espreitava.\n");
        System.out.println("O destino de Andoshire estava em suas mãos. Estaria pronto para enfrentar os desafios que viriam?\n");
    }


    // Diálogo baseado no personagem escolhido
    private void mostrarDialogoPersonagem() {
        if (personagemEscolhido instanceof Barbaro) {
            dialogoBarbaro();
        } else if (personagemEscolhido instanceof Ladrao) {
            dialogoLadrao();
        } else if (personagemEscolhido instanceof Bruxo) {
            dialogoBruxo();
        }
    }

    // Diálogo específico do Bárbaro
    private void dialogoBarbaro() {
        System.out.println("\nJulya: \"Ora, ora... olha quem decidiu voltar para Andoshire! O que esteve fazendo todos esses anos? Lutando por aí, suponho?\"");
        System.out.println(nomeJogador + ": \"Acho que podemos dizer isso. Aprendi o valor do combate físico e o poder da força bruta em minhas jornadas.\"");
        System.out.println("Isabelle: \"Uma pena que voltou em tempos tão difíceis, " +nomeJogador+  "... mas suas habilidades podem ser a diferença entre a vitória e a derrota.\"");
        System.out.println("Kimberly: \"Se é combate direto que gosta, eu te ensinarei como derrubar seus inimigos com um único golpe. Vai precisar disso em breve!\"");
    }


    // Diálogo específico do Ladrão
    private void dialogoLadrao() {
        System.out.println("\nIsabelle: \"Bem, bem... faz eras que não vemos sua figura por Andoshire, "  +nomeJogador+  ". Diga-me, ainda usa suas... habilidades rápidas?\"");
        System.out.println(nomeJogador + ": \"Digamos que sobrevivi à base de furtividade e pegando algumas moedas perdidas no caminho.\"");
        System.out.println("Kimberly: \"Espero que suas habilidades sorrateiras sejam suficientes. Não estamos lidando com inimigos que caem facilmente nas sombras.\"");
        System.out.println("Julya: \"Ladrão, então? Interessante... se aprender as táticas certas, podemos fazer ataques invisíveis, rápidos como o vento. Eu te mostro como se esgueirar ainda melhor.\"");
    }


    // Diálogo específico do Bruxo
    private void dialogoBruxo() {
        System.out.println("\nKimberly: \"Já faz séculos... o que esteve fazendo durante todo esse tempo?\"");
        System.out.println(nomeJogador + ": \"Me isolei para estudar as artes mágicas. Agora sou capaz de conjurar feitiços que jamais imaginaria antes.\"");
        System.out.println("Julya: \"Infelizmente, talvez não tenha muito tempo para mostrar suas novas habilidades, pois o reino está em crise.\"");
        System.out.println("Isabelle: \"Então você aprendeu magia , "  +nomeJogador+  "? Fascinante... parece que temos algo em comum. Posso te ensinar alguns feitiços que talvez te interessem, se desejar.\"");
    }
}
