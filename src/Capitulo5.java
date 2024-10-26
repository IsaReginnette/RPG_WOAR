import java.util.Scanner;

public class Capitulo5 {
    private String nomeJogador;
    private Personagem personagemEscolhido;
    private Sinergia sinergia; // Instância da classe Sinergia
    private Scanner scanner; // Declara o Scanner

    public Capitulo5(String nomeJogador, Personagem personagemEscolhido, Sinergia sinergia) {
        this.nomeJogador = nomeJogador;
        this.personagemEscolhido = personagemEscolhido;
        this.sinergia = sinergia; // Atribui a instância de Sinergia
        this.scanner = new Scanner(System.in);
    }
    public void iniciarCapitulo5() {
        mostrarDesenhoCapitulo5();
        introducao();
        historiaParte1();
        escolhaTipoDeAtaque();
        escolhaAtaqueFinal();
    }


    // Método para mostrar desenho do capítulo 5
    private void mostrarDesenhoCapitulo5() {
        DesenhoCapitulo5.mostrarDesenho();
    }

    private void introducao() {

        System.out.println("O céu sobre Haset está coberto por nuvens negras, pesadas com a magia sombria que domina o reino.");
        System.out.println("Relâmpagos ecoam à distância, e o vento gélido sopra pelas ruas desertas.");
        System.out.println("Você e suas amigas estão à beira da maior batalha de suas vidas.");
        System.out.println("Depois de uma longa jornada e incontáveis lutas, finalmente chegaram ao coração do reino de Haset — o castelo do rei corrompido pela entidade maligna.");

        System.out.println("À medida que avançam, o peso do momento se faz sentir.");
        System.out.println("Cada passo ecoa pelos corredores de pedra do castelo, cada respiração fica mais pesada.");
        System.out.println("No salão principal, a imensa porta de madeira se abre lentamente, revelando o trono maciço onde o Rei de Haset aguarda.");
        System.out.println("Envolto em uma aura sombria, sua armadura negra e imponente cintila à luz das chamas das tochas.");

    }

    private void historiaParte1() {
        System.out.println("Rei de Haset: 'Vocês finalmente chegaram. Acham que podem me derrotar? A entidade já me deu mais poder do que vocês jamais poderão compreender!'");
        mostrarDesenhoRei();
        System.out.println("Ele se levanta, empunhando uma espada envolta em uma energia negra pulsante.");
        System.out.println("Atrás dele, a própria sombra da entidade parece se mover, como se aguardasse o desenrolar dos eventos.");

        System.out.println("O Rei de Haset avança, golpeando com sua espada em um ataque devastador contra o grupo.");
        System.out.println("A lâmina, envolta em sombras, corta o ar com um assobio mortal.");

        System.out.println("Rei de Haset: \"A luz não tem lugar aqui! Vocês conhecerão o verdadeiro poder!\"");

        System.out.println("A magia do rei forma esferas negras que voam em direção ao grupo, explodindo no impacto.");

        System.out.println("Isabelle ergue suas mãos, conjurando um escudo mágico ao redor do grupo.");
        System.out.println("Isabelle: \"Protejam-se! A magia dele está carregada com a energia da entidade!\"");


    }

    private void mostrarDesenhoRei() {
        DesenhoRei.mostrarDesenho();
    }



    private void escolhaTipoDeAtaque() {
        System.out.println("Após a intensa batalha inicial, o Rei de Haset se transforma em uma criatura grotesca e aterrorizante.");
        System.out.println("Sua forma distorcida e corrompida reflete o poder da entidade maligna que agora o controla.");
        System.out.println("O ambiente ao redor se altera, escurecendo ainda mais, enquanto sombras se estendem como espinhos ao redor do salão, criando uma atmosfera opressiva.");

        System.out.println("Rei de Haset: \"Vocês acham que podem me vencer? A entidade agora é parte de mim! Preparem-se para a verdadeira destruição!\"");

        System.out.println("Com um gesto poderoso, ele levanta a mão, conjurando magia negra que se manifesta em espinhos que despontam do chão.");
        System.out.println("Os espinhos negros atacam o grupo com fúria, subindo rapidamente em direção a vocês.");

        System.out.println("Os espinhos se erguem, mirando diretamente em você e suas amigas.");
        System.out.println("O campo de batalha agora está repleto de riscos mortais, e cada movimento se torna crítico.");

        System.out.println("Kimberly: \"Cuidado! Esses espinhos são mortais! Precisamos encontrar uma maneira de destruí-los!\"");

        System.out.println("Julya: \"Eu posso usar flechas envenenadas para enfraquecer a magia do rei. Se ele estiver vulnerável, podemos atacá-lo com mais eficácia!\"");

        System.out.println("Isabelle: \"Eu posso conjurar escudos para nos proteger. Vamos nos manter unidos!\"");

        System.out.println("Você precisa fazer algo, e rápido!");

        System.out.println("Isabelle: 'Precisamos nos proteger! Vou conjurar escudos para bloquear os ataques.'");
        System.out.println("A proteção mágica de Isabelle se forma em torno do grupo, permitindo que vocês se recuperem enquanto o Rei de Haset ataca com seus espinhos.\n");
        System.out.println("Você não pode deixar que ele se recupere! É hora de acabar com isso!");
        System.out.println("Você avança em direção ao rei, utilizando um golpe poderoso que desvia dos espinhos e acerta o rei em seu ponto fraco. A energia sombria ao redor do rei treme, e ele grita em agonia.\n");
        System.out.println("\nRei de Haset: \"Vocês ousam se opor a mim? Tolos!\"");
        System.out.println("Sua voz ecoa pelo salão, e você sente o peso das trevas aumentar a cada palavra.");

        System.out.println("\nKimberly: \"Não nos rendemos! A paz de Andoshire está em jogo, e lutaremos até o fim!\"");
        System.out.println("Kimberly ergue sua espada com determinação, pronta para defender a todos com sua vida.");

        System.out.println("\nJulya: \"Ele pode ter poder, mas nós temos a coragem de quem protege os inocentes!\"");
        System.out.println("Ela prepara seu arco, sua postura firme e concentrada, com olhos fixos no alvo.");

        System.out.println("\nIsabelle: \"A luz sempre vence a escuridão. Rei de Haset, você enfrentará o poder da justiça!\"");
        System.out.println("Isabelle canaliza sua magia, faíscas de energia pura brilhando ao seu redor.");

        System.out.println("\nO Rei de Haset levanta sua mão, e uma onda de energia negra surge ao seu redor,");
        System.out.println("fazendo o chão tremer e as sombras dançarem nas paredes do salão.");
        System.out.println("Você sabe que a luta não será fácil, mas a esperança de Andoshire repousa em suas mãos.");

        System.out.println("Com um sinal, você e suas aliadas se posicionam para um ataque coordenado.");
        System.out.println("Cada uma, determinada a dar tudo de si, junta forças para desferir o golpe decisivo.");

        System.out.println("\nKimberly avança com sua espada brilhando intensamente, carregada com toda a força de sua determinação.");
        System.out.println("Ela desfere um golpe poderoso, quebrando a primeira barreira sombria que protege o Rei.");
        System.out.println("O impacto ecoa pelo salão, e uma fissura energética começa a surgir em sua armadura.");

        System.out.println("\nJulya então dispara uma flecha envolta em magia, que corta o ar com uma velocidade impressionante.");
        System.out.println("A flecha atinge o Rei de Haset no ponto vulnerável que Kimberly criou, causando uma explosão de energia");
        System.out.println("que abala suas defesas e o faz cambalear, suas sombras agora se dissipando lentamente.");

        System.out.println("\nIsabelle não perde tempo: ela canaliza uma tempestade de raios e a projeta sobre o Rei,");
        System.out.println("envolvendo-o em um vórtice de luz intensa que o cega e enfraquece cada vez mais.");
        System.out.println("Sua magia pura consome as sombras que o rodeiam, e o Rei cai de joelhos, com sua força claramente debilitada.");

        System.out.println("\nRei de Haset: \"Isso... não é possível! Eu sou o governante deste reino!\"");
        System.out.println("Sua voz soa enfraquecida, e o desespero é evidente enquanto ele tenta, em vão, manter o controle.");

        System.out.println("\nCom um último esforço, você e suas aliadas se reúnem, concentrando toda a energia que resta em um golpe conjunto.");
        System.out.println("A energia combinada de espada, flecha e magia converge sobre o Rei, explodindo em uma onda de luz que abala o salão.");
        System.out.println("O Rei grita em agonia, sua forma agora fraca e instável, suas sombras completamente dissipadas.");


    }

    private void escolhaAtaqueFinal() {
        System.out.println("\nRei de Haset: \"Não... Eu não posso... ser derrotado assim...\"");
        System.out.println("Ele cai ao chão, sua figura agora reduzida e incapaz de manter-se em pé.");
        System.out.println("O Rei de Haset está finalmente enfraquecido, pronto para receber o golpe final que decidirá o destino de Andoshire.");

        System.out.println("\n--- O Rei está enfraquecido! Prepare-se para o ataque final! ---");
    }

}


