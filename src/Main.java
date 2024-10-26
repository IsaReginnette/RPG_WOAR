import java.util.Scanner;

public class Main {
    private static final int BARBARO = 1;
    private static final int LADRAO = 2;
    private static final int BRUXO = 3;
    private static AutoCloseable scanner;

    public static void main(String[] args) {
        // Exibe a introdução do jogo
        DesenhoIntroducao.mostrarDesenho();
        System.out.println("Seja bem-vindo ao Warriors of the Andoshire Realm (WOAR), um RPG de texto feito por Isabelle Reginnette, Julya Dias e Kimberly Germano, como trabalho para a disciplina de Programação Orientada a Objetos.");

        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do jogador
        System.out.println("Digite o seu nome:");
        String nomeJogador = scanner.nextLine();

        // Exibe uma mensagem de boas-vindas com o nome do jogador
        System.out.println("Bem-vindo, " + nomeJogador + "! Escolha sua classe:");

        // Variável para armazenar o personagem escolhido
        Personagem personagemEscolhido = null;

        // Opções de classe de personagem
        while (personagemEscolhido == null) {
            System.out.println("Escolha seu personagem:");
            System.out.println("1. Bárbaro");
            System.out.println("2. Ladrão");
            System.out.println("3. Bruxo");

            // Captura a escolha do jogador
            int escolha;

            // Validação da entrada do usuário
            try {
                escolha = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
                continue;
            }

            // Jogador escolhe sua classe
            switch (escolha) {
                case BARBARO:
                    personagemEscolhido = new Barbaro();
                    DesenhoBarbaro.mostrarDesenho();  // Exibe o desenho do Bárbaro
                    break;
                case LADRAO:
                    personagemEscolhido = new Ladrao();
                    DesenhoLadrao.mostrarDesenho();   // Exibe o desenho do Ladrão
                    break;
                case BRUXO:
                    personagemEscolhido = new Bruxo();
                    DesenhoBruxo.mostrarDesenho();    // Exibe o desenho do Bruxo
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        // Confirma a escolha do personagem
        System.out.println("Você escolheu " + personagemEscolhido.getClass().getSimpleName() + "!");

        // Exibe a descrição do personagem escolhido
        if (personagemEscolhido instanceof Barbaro) {
            System.out.println("O Bárbaro é um lutador feroz, conhecido por sua força brutal e habilidades de combate corpo a corpo. Suas habilidades são: Força: 15 ; Inteligência: 4 e Velocidade: 10.");
        } else if (personagemEscolhido instanceof Ladrao) {
            System.out.println("O Ladrão é ágil e astuto, especialista em furtos e ataques furtivos, sempre pronto para surpreender seus inimigos. Suas habilidades são: Força: 9 ; Inteligência: 6 e Velocidade: 14.");
        } else if (personagemEscolhido instanceof Bruxo) {
            System.out.println("O Bruxo manipula as forças da escuridão com suas poderosas magias, capaz de causar grande destruição com suas feitiçarias. Suas habilidades são: Força: 5 ; Inteligência: 15 e Velocidade: 8.");
        }

        // Inicia a instância de Sinergia
        Sinergia sinergia = new Sinergia();

//Inicia os capitulos
        // Inicia o capítulo 1
        Capitulo1 capitulo1 = new Capitulo1(nomeJogador, personagemEscolhido);
        capitulo1.capitulo1parte1();

        // Inicia o capítulo 2
        Capitulo2 capitulo2 = new Capitulo2(nomeJogador, sinergia);
        capitulo2.capitulo2parte1();

        // Chama o Capítulo 3
        Capitulo3 capitulo3 = new Capitulo3(nomeJogador, personagemEscolhido);
        capitulo3.Capitulo3parte1();

        // Chama o Capítulo 4 passando a instância de Sinergia
        Capitulo4 capitulo4 = new Capitulo4(nomeJogador, personagemEscolhido, sinergia);
        capitulo4.Capitulo4parte1();

        // Chama o Capítulo 5
        Capitulo5 capitulo5 = new Capitulo5(nomeJogador, personagemEscolhido, sinergia);
        capitulo5.iniciarCapitulo5();


        // Chama o Capítulo 6
        Capitulo6 capitulo6 = new Capitulo6(nomeJogador, personagemEscolhido, sinergia);
        capitulo6.Capitulo6parte1();

        // Fecha o scanner após o uso completo
        scanner.close();
    }

}
