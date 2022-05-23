package com.mycompany.projetogrupo9;

import java.util.Scanner;

public class ProjetoGrupo9 {

    private static String persona;
    private static String jogador;
    private static int vidas;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuJogo;
        int escolha;
        String[] vetor = {"Voce matou o inimigo", "Voce morreu"};
        System.out.println("\nSeja bem-vindo");
        System.out.println("-------------Return of the hero: The Dragons Death-------------");

        do {
            escolha = 0;
            menuJogo = menuPrincipal(input);
            if (menuJogo == 2) {
                escolha = Historia(input);
            } else if (menuJogo == 3) {
                escolha = creditos(input);
            } else if (menuJogo == 4) {
                System.exit(0);
            }

        } while (escolha == 1);

        do {
            System.out.println("\n\"Essa voz, a voz que você e trouxe você até aqui, somos nós,\\n os assolados flagelos que escutamos nossas vidas roubadas pelo demônio.\n A esta altura você deve saber a fonte do seu poder, estamos com você concedendo o que nos resta de energia vital para acabar com este pesadelo.\nAgora adentramos dentro do covil, demônio demônio com você afim de cumprir nossa profecia. Existem salas intimamente ligadas com o herói, assim como somos com você, herói.\n");
            System.out.println("Voce esta preparado");
            System.out.println("1 - Sim\n 2 - Não");

            escolha = input.nextInt();

            if (escolha == 1) {
            } else {
                System.out.println("Volte quando estiver preparado");
                System.exit(0);

            }

        } while (escolha != 1);

        System.out.println("\nVocê tem coragem!\n");

        personagem(input);
        jogador(input);

        System.out.println(jogador + persona);

        System.out.println("Vamos Começar!");
        pressEnter();
        do {
            do {
                vidas = 3;
                int opção_porta1;
                int atak;

                System.out.println("O chão começa a tremer e você cai em uma sala parecida com um hall.");
                System.out.println("Você se sente tonto com a queda e com a visão turva.");
                System.out.println("Você olha em volta e vê uma estrutura parecida com a de um castelo");
                System.out.println("Depois de olhar a sala por completo, se depara com dois caminhos.");
                System.out.println("O medo existe em você, mas com coragem você decide escolher um caminho.");
                pressEnter();
                System.out.println("Qual caminho você deseja escolher? ");
                System.out.println("1- Caminho da esquerda");
                System.out.println("2- Caminho da direita");
                escolha = input.nextInt();
                if (escolha == 1) {
                    System.out.println("Ao entrar na sala você se depara com algo escuro, que se encontra imóvel.");
                    System.out.println("Você olha um pouco mais de perto e parece ser uma criatura.");
                    System.out.println("Você vê a criatura e ela aparenta estar adormecida.");
                    System.out.println("(alma)" + jogador + ", o que faremos? ");
                    pressEnter();

                    System.out.println("1 - Ataque com a espada:");
                    System.out.println("2 - Ataque com fogo:");
                    System.out.println("3 - Feitiço imobilizador:");
                    System.out.println("4 - Tentar passar pela sala sem acorda-la");

                    do {

                        vida();
                        escolha = input.nextInt();
                        //caminho da esquerda
                        switch (escolha) {
                            case 2:
                                if (escolha == 2) {

                                    System.out.println("\n" + vetor[0]);
                                    System.out.println("O ambiente se encontrava lotado de teias, com isso tudo se queima e o ataque é super efetivo.");
                                    System.out.println("A aranha tenta revidar mesmo em chamas, mas já afetada pelo ataque, você devia e desfere o golpe final com a sua espada.");
                                    System.out.println("Com isso você passa pela sala em chamas e chega a um novo sagoão.");
                                }

                                break;

                            case 1:
                            case 3:
                            case 4:
                                System.out.println("\n" + jogador);

                                System.out.println("O ataque atinge a criatura, quando ela se levanta é notável que trata-se de uma aranha.");
                                System.out.println("Ela te ataca e com isso voce perde uma vida");

                                vidas = vidas - 1;
                                System.out.println("\n" + vetor[1]);

                                gameOver();
                                System.out.println("\nApós escolher a alternativa errada, você leva um dano da aranha e perde uma vida. Então lhe é dada mais uma chance para tentar de novo, mas tome cuidado, ja que agora você só possui " + vidas + " vidas.\n");
                                break;
                            default:
                                System.out.println("\nResposta inválida, tente novamente!");

                        }
                    } while (true);
                } else if (escolha == 2) {

                    System.out.println("Você escolhe o caminho da direita...");
                    System.out.println("Você segue pelo corredor e nota não ver o final dele, será algo da sua cabeça? ");
                    System.out.println("A energia do local é pesada e você sente já estar andando horas em linha reta...");
                    System.out.println("Você vai perdendo a noção do tempo que está andando, pensa em voltar mas quando olha para trás já não consegue identificar a saída.");
                    pressEnter();
                    System.out.println("Com isso, você já não sabe mais qual a direção correta e está completamente perdido.");
                    System.out.println("Você decide caminhar na mesma direção em que já estava, em algum lugar você iria chegar...");
                    System.out.println("Você avista uma porta enorme, uma cruz invertida na porta e uma cesta de morangos, também havia água...");
                    System.out.println("Você decide entrar na sala...");
                    System.out.println();
                    System.out.println("Ao entrar na sala uma adaga é lançada sobre você, mas com seus reflexos apurados você desvia e a adaga fica presa na porta");
                    System.out.println("Quem te ataca é um esqueleto demoniáco, um rei antigo que foi corronpido com riqueza e poder, concedidos pelo demônio.");
                    System.out.println("Ele veste uma armadura dourada e uma coroa de espinhos folheados a ouro.");
                    System.out.println("(O esqueleto diz) Meu jovem, vejo sua determinação, creio que possamos fazer um trato amigável!");
                    System.out.println("(O esqueleto diz) Aquela cesta de morangos e água na entrada representa o poder do nosso senhor, depois de um longo caminho sempre existe a recompensa!");
                    System.out.println("(O esqueleto diz) Mas caso o contrário, roubarei sua vida e você acabará em ruina, junto com as outras almas tomadas pelo nosso senhor.");
                    pressEnter();
                    System.out.println("(alma)" + jogador + ", precisamos de você!");
                    System.out.println("(alma) Não se deixe enganar, o que faremos?");
                    pressEnter();
                    System.out.println("1) Aceitar o trato");
                    System.out.println("2) Retirar a adaga presa na parede, imbuir um feitiço de exorção e arremesar de volta");
                    System.out.println("3) Arremesar uma bola de fogo");
                    System.out.println("4) Desembainhar sua espada e partir para o combate");

                    do {
                        vida();
                        escolha = input.nextInt();

                        switch (escolha) {
                            case 1:
                                if (escolha == 1) {

                                    vidas = vidas - 1;
                                    System.out.println("\n" + vetor[1]);
                                    gameOver();
                                    System.out.println("Ao aceitar o trato, você acaba se tornando um carrasco a mando do senhor dos demônios.\nVocê dizima até o último habitante da ilha.\n Então lhe é dada mais uma chance para tentar de novo, mas tome cuidado, ja que agora você só possui " + vidas + " vidas.\n");
                                    break;

                                }
                            case 2:
                                if (escolha == 2) {

                                    System.out.println("\n" + vetor[1]);
                                    vidas = vidas - 1;
                                    gameOver();
                                    System.out.println("Você arremessa a adaga com um feitiço de exorção.\n O esqueleto utilizava um feitiço de controle sobre ela, ela faz a volta e atinge seu pescoço.\n Então lhe é dada mais uma chance para tentar de novo, mas tome cuidado, ja que agora você só possui " + vidas + " vidas.\n");
                                    break;

                                }
                            case 3:
                                if (escolha == 3) {

                                    System.out.println("\n" + vetor[1]);
                                    vidas = vidas - 1;
                                    gameOver();
                                    System.out.println("Você arremessa uma bola de fogo.\n O esqueleto é atingido.\n O esqueleto já morreu anteriormente, portanto não pode morrer! Ele contra ataca com as mãos no seu pescoço e te sufoca até a morte.\n Então lhe é dada mais uma chance para tentar de novo, mas tome cuidado, ja que agora você só possui " + vidas + " vidas.\n");
                                    break;

                                }
                            case 4:
                                if (escolha == 4) {

                                    System.out.println("\n" + vetor[0]);
                                    System.out.println("Você ataca o esqueleto com uma série de ataques.\n Ele é ótimo com espadas e defende todos.\n Com um chute nas pernas você arranca uma delas.\nQuando ele desequilibra, você desfere uma série de mil golpes, o cortando em mil pedaços.\n");
                                    break;

                                }

                        }

                    } while (true);

                }

            } while (false);

            //Heron 
            //Italo 
            do {
                vidas = 3;
                int opção_porta1;
                int atak;
                // italo que mecheu abaixo, se tiver errado tenho o codico antigo....
                System.out.println("Ao entra na sala, você se depara com um grande corredor repleto de esqueletos de antigos guerreiros.");
                System.out.println("Ao seguir em frente você se escutar um suspiro");
                System.out.println("e de um guerreiro paladino que se encontra a beira da morte!");
                System.out.println("ao te ver o guerreiro grita e Peder para você se aproximar");
                System.out.println("quando você se aproxima o paladino diz");
                System.out.println("- Guerreiro paladino - Diz suas últimas palavras- Por favor no meu último momento de vida");
                System.out.println("te peço Mate o Rei Dragão que se encontra a frente, ele o responsável por trazer todos o mau para nossa querida terra natal.");
                System.out.println("te entregou meu querido escudo para você enfrentar o Demônio...");
                System.out.println("após das suas últimas palavras, o Guerreiro paladino vem a falecer......");
                System.out.println("Ao seguir em frente depois de horas de caminha sobre ossos de antigos Gueiros que tentaram derrotar o maligno Rei Dragão");
                System.out.println(" Der repente você avista o Infame Rei Dragão que matou o Paladino que você encontrou no meio do caminho e o responsável por sugar toda energia vital da população da ilha.");
                System.out.println("ao te ver o Rei Dragão vem correndo na sua direção com sede de sangue e fome de carne humana.");
                System.out.println("Fugir não é uma opção!!! Você tem que atacar para sobreviver e vingar o paladino");
                System.out.println("Rápido Escolha seu ataque com cuidado, se não escolher com rapidez você morrera.");
                System.out.println("com sabedoria porque essa decisão pode ser fatal:");
                System.out.println("1 - Ataque com a espada + Escudo Paladino");
                System.out.println("2 - Feitiço imobilizador");
                System.out.println("3 - Arremesar uma bola de fogo");
                System.out.println("4 - Defender o Ataque do dragão");
                System.out.println("6 - Feitiço das Sombras");
                System.out.println("7 - Fúria Motal");
                System.out.println("8 - Dragão Flamejante");
                System.out.println("9 - Lâmina Mortal");
                vida();
                opção_porta1 = input.nextInt();
                //caminho da esquerda
                switch (opção_porta1) {
                    case 1:
                        if (opção_porta1 == 1) {

                            System.out.println("\n" + vetor[0]);
                            System.out.println(" ");
                            System.out.println("Ao te atacar você conseguiu bloquear o ataque do demônio com o escudo do paladino");
                            System.out.println("contra tacando com sua espada você, furo o seu coração matando o infame Demônio.");
                            System.out.println("Parabéns, você conseguiu!!!!");
                            System.out.println("Derem pente aparecer o espírito do paladino na sua frente sorrindo e agradecendo");
                            System.out.println("pela sua vingança...");

                        }
                        break;
                    case 2:
                        if (escolha == 2) {

                            System.out.println("\n" + vetor[1]);
                            vidas = vidas - 1;
                            gameOver();
                            System.out.println("você lançou um feitiço no dragão.... mas não teve efeito no dragão " + vidas + " vidas.\n");
                            System.out.println("Ele atacaou com todas a s suas forças e te matou...");
                            break;
                        }
                    case 3:
                        if (escolha == 3) {

                            System.out.println("\n" + vetor[1]);
                            vidas = vidas - 1;
                            gameOver();
                            System.out.println("O Rei Dragão e imuner a qual quer ataque de fogo.. " + vidas + " vidas.\n");
                            System.out.println("Ele atacaou com todas a s suas forças e te matou...");
                            break;
                        }
                    case 4:
                        if (escolha == 4) {
                            System.out.println("\n" + vetor[1]);
                            vidas = vidas - 1;
                            gameOver();
                            System.out.println("infelizmente seu escudo nao suportou o ataque.");
                            System.out.println("GAMEOVER");
                            break;
                        }
                    case 5:
                        if (escolha == 5) {
                            System.out.println("\n" + vetor[1]);
                            vidas = vidas - 1;
                            gameOver();
                            System.out.println("O guerreiro realiza o feitiço das sombras, deixando o ambiente ainda mais sombrio , numa tentativa desesperada de se esconder.");
                            System.out.println("O guerreiro se esqueceu que o rei vive nas sombras da escuridão, tendo assim , facilidade para se locomover nas sombras");
                            System.out.println("Em uma tentativa frustada de se esconder , o rei e o guerreiro ficam cara a cara.");
                            System.out.println("O guerreiro, com a sua visão prejudicada , recebe uma bola de fogo conjurada pelo rei demônio");
                            break;

                        }
                    case 6:
                        if (escolha == 6) {
                            System.out.println("\n" + vetor[1]);
                            vidas = vidas - 1;
                            gameOver();
                            System.out.println("O guerreiro já estava exausto e decide desferir seu último ataque , usando toda sua força e vitalidade.");
                            System.out.println("O guerreiro então corre em direção ao seu inimigo");
                            System.out.println("Para sua surpresa, ele acerta o golpe, mas a armadura do rei era resistente, o inimigo apenas bambeou.");
                            System.out.println("A luta foi árdua, porém, ao utilizar o restante de sua força, o guerreiro desaba , se tornando assim um oponente vulnerável para o rei");
                            System.out.println("O ardiloso rei demônio pisa sobre o corpo do guerreiro e desfere com sua espada um golpe fatal no coraçao do guerreiro");
                            break;
                        }
                    case 7:
                        if (escolha == 7) {
                            System.out.println("\n" + vetor[1]);
                            vidas = vidas - 1;
                            gameOver();
                            System.out.println("Após anos de treinamento e estudos , o guerreiro adquiri incríveis poderes mágicos .");
                            System.out.println("O guerreiro que ansiava pela luta, ao avistar seu inimigo , declara :");
                            System.out.println("- Você está morto , hoje irei honrar todos aqueles que depositaram sua esperança em minhas mãos !");
                            System.out.println("O guerreiro começa então a conjurar um feitiço que tinha como matéria prima, o fogo !");
                            System.out.println("O rei demônio então se espanta com tamanha força de seu oponente");
                            System.out.println("Ambos correm de encontro um ao outro , e então , o guerreiro arremessa seu poder secreto , conhecido como Dragão Flamejante.");
                            System.out.println("Para sua surpresa, o rei então se transforma na temida criatura , o rei dragão , absorvendo todo aquele poder lançado pelo guerreiro, tendo em vista que o poder utilizava o elemento fogo como principal elemento");
                            System.out.println("O contra ataque foi certeiro, o dragão absorveu toda aquela energia lançada e cuspiu a mesma contra o guerreiro");
                            System.out.println("O corajoso guerreiro havia foi atingido pelo seu próprio feitiço e não resistiu");
                            break;
                        }
                    case 8:
                        if (escolha == 8) {
                            System.out.println("\n" + jogador);

                            System.out.println("Acostumado com sangue e dono de uma coragem imensurável, o guerreiro tira de suas costas um poderoso objeto afiado");
                            System.out.println("O demônio com tom de surpresa diz : OH, a espada do rei Antares!");
                            System.out.println("Um objeto herdado de um guerreiro que o rei demônio havia enfrentado e havia lhe deixado diversas cicatrizes pelo seu corpo.");
                            System.out.println("O combate começa ! O guerreiro disfere um golpe certeiro no seu inimigo , levando o rei demônio ao chão.");
                            System.out.println("Nesse momento , passa um filme em sua cabeça, ele havia então terminado com a maldição que assombrava aquele lugar.");
                            System.out.println("Passa em sua memória então as cenas , falas, escritas de todas as pessoas que confiaram em seu legado, confiaram a vida em suas mãos");
                            System.out.println("Por um momento de descúido, o guerreiro deixa cair sua espada próximo ao corpo do rei que estava ali no chão.");
                            System.out.println("O rei demônio então , mesmo que atordoado, pega a espada e realiza um golpe fatal no coração do guerreiro");
                            System.out.println("O rei então , com sua aparência malígna, pisa sobre o corpo do guerreiro e gargalha.");
                            System.out.println("Eu sou invencível!");

                            vidas = vidas - 1;
                            System.out.println("\n" + vetor[1]);
                            System.out.println("Tente novamente");
                            gameOver();
                            break;
                        }
                    default:
                        System.out.println("\nResposta inválida, tente novamente!");

                    //heron
                    //italo
                }
                while (true);
            } while (true);
        } while (true);

    }

    public static int menuPrincipal(Scanner input) {
        int menuInicial;

        do {
            System.out.println("\nMENU");
            System.out.println("1- Jogar\n2- Historia\n3- Créditos\n4- Sair\n");
            menuInicial = input.nextInt();
            if (((menuInicial == 1 || menuInicial == 2) || menuInicial == 3) || menuInicial == 4) {
            } else {
                System.out.println("\nResposta inválida, tente novamente!");
                menuInicial = 5;
            }
        } while (menuInicial == 5);

        return menuInicial;
    }

    public static int Historia(Scanner input) {
        int escolha = 0;

        do {
            System.out.println("\nHistoria");
            System.out.println("\nAqui vai a historia!");
            System.out.println("A muitos anos, numa ilha isolada no norte do oceano índico, existia um povo assolado pela fome e pela doença, uma energia sinistra e demoníaca pairava sobre aquele lugar.\n Um sábio da ilha uma vez disse “a causa dos nossos infortúnios é um demônio, o rei dos demônios.”, “ele vive e se alimenta da nossa energia, da nossa alma”.\n “Em seu último suspiro o sábio alertou: “Nosso sofrimento não será eterno, em mil anos renasceremos em uma semente de esperança. Mas antes virá a guerra”.\n Na ilha havia um vulcão adormecido onde ninguém se atrevia a pisar, o medo e o terror era tão latente que todos os resquícios de vida em volta do vulcão tinham se acabado.\n Os relatos do sábio eram verdadeiros, o rei demônio que assumiu a forma do dragão, drenava energia da população da ilha e a energia natural do ambiente, enquanto se fortalecia para a sua batalha final.\n A lenda verdadeira dizia que após mil anos de sofrimento e dor, iria nascer a semente de esperança, um herói talentoso que herdou os dons das almas subjugadas pelo demônio, cujo o único propósito seria matar o demônio e livrar a ilha.\n O jogo se passa na resolução do conflito, que se inicia após a erupção do vulcão, que também desencadeia o despertar do herói para a sua missão.\n As heranças recebidas dos antepassados para o herói não garantem a vitória, ele precisará de VOCÊ: A ÚLTIMA HERANÇA para desenvolver o herói e derrotar o rei Dragão demônio.");

        } while (escolha == 2);
        System.out.println("\n1- Voltar ao menu\n2- Sair do jogo\n");
        escolha = input.nextInt();
        if (escolha != 2) {
        } else {
            System.exit(0);
        }

        return escolha;
    }

    public static int creditos(Scanner input) {
        int escolha;

        System.out.println("\n-------CRÉDITOS-------");

        System.out.println(" - Bruno Henrique Souza;");
        System.out.println(" - Guilherme de Souza Ferreira;");
        System.out.println(" - Italo Santos Silva;");
        System.out.println(" - Heron Ramos");
        System.out.println();
        System.out.println("\n1- Voltar ao menu\n2- Sair do jogo\n");
        escolha = input.nextInt();
        if (escolha == 2) {
            System.exit(0);
        }

        return escolha;
    }

    public static void personagem(Scanner input) {
        int escolha;

        System.out.println("\nPERSONAGENS");
        do {
            System.out.println("\nEscolha seu personagem para jogar:");
            System.out.println("1- Guerreiro\n2- Sacerdote\n3- Mestre de Escudo\n");
            escolha = input.nextInt();
            switch (escolha) {
                case 1 -> {
                    System.out.println("\nO Guerreiro...");
                    System.out.println("É um ponto de equilibrio entre força e defesa,\n naturalmente mais resistente e móvel,\n o guerreiro tem como base o ímpeto pela batalha e a coragem,\n mas inteligência não é seu ponto forte, portanto não pode utilizar magias.");
                    do {
                        System.out.println("\nVocê deseja ser O Guerreiro?\n1- Sim\n2- Não\n");
                        escolha = input.nextInt();

                        switch (escolha) {

                            case 1 ->
                                persona = "Agora voce é um guerreiro";
                            case 2 ->
                                escolha = 4;
                            default -> {
                                System.out.println("\nResposta inválida, tente novamente!");
                                escolha = 0;
                            }
                        }
                    } while (escolha == 0);
                }
                case 2 -> {
                    System.out.println("\nO Sacerdote...");
                    System.out.println("O sacerdote nasceu do conhecimento e sabedoria,\n é extremamente habilidoso com a arte das magias e tem poderes curativos,\n tem alto poder de dano mas é vulnerável.\n OBS: Possui mana");
                    do {
                        System.out.println("\nVocê deseja ser O Sacerdote?\n1- Sim\n2- Não\n");
                        escolha = input.nextInt();

                        switch (escolha) {
                            case 2 ->
                                escolha = 4;
                            case 1 ->
                                persona = "Agora voce é um sacerdote";
                            default -> {
                                System.out.println("\nResposta inválida, tente novamente!");
                                escolha = 0;

                            }
                        }
                    } while (escolha == 0);
                }
                case 3 -> {
                    System.out.println("\nO Mestre de escudo...");
                    System.out.println("É um subgênero da classe de guerreiro, trata-se de um herói que dedicou sua vida treinando a arte da evasão, defesa e provocação,\n para atuar nas linhas de frente das batalhas, sua arma é um grande escudo, ou escudo médio e maça,\n pode aguentar grandes quantidades de dano, mas devido sua especialização, não consegue causar grandes quantidades de dano.");
                    do {
                        System.out.println("\nVocê deseja ser O Mestre de escudo?\n1- Sim\n2- Não\n");
                        escolha = input.nextInt();

                        switch (escolha) {
                            case 2 ->
                                escolha = 4;
                            case 1 ->
                                persona = "Agora voce é um mestre de escudo";

                            default -> {
                                System.out.println("\nResposta inválida, tente novamente!");
                                escolha = 0;
                            }
                        }
                    } while (escolha == 0);
                }
                default -> {
                    System.out.println("\nResposta inválida, tente novamente!");
                    escolha = 4;
                }
            }
        } while (escolha == 4);
    }

    public static void jogador(Scanner input) {
        int escolha;

        do {
            System.out.println("\nDigite um nome para o seu personagem:\n");
            jogador = input.next();

            System.out.println("\n" + jogador + " é o nome que você deseja utilizar?");
            do {
                System.out.println("\n1- Sim\n2- Não\n");
                escolha = input.nextInt();
                if (escolha == 1 || escolha == 2) {
                } else {
                    System.out.println("\nResposta inválida, tente novamente!");
                    escolha = 3;
                }
            } while (escolha == 3);
        } while (escolha == 2);
    }

    private static int menuJogo(Scanner input) {

        return 0;

    }

    public static void vida() {

        for (int i = 0; i < vidas; i++) {
            String coracao = " S2 ";
            System.out.print(coracao);
        }
        System.out.print("\n");
    }

    public static void gameOver() {
        if (vidas <= 0) {
            System.out.println("\nGAME OVER!\n");
            System.out.println("Você perdeu todas as suas vidas!\n");
            System.out.println("Até a proxima");
            System.exit(0);
        }
    }

    public static void pressEnter() {
        Scanner input = new Scanner(System.in);
        System.out.print("(press ENTER)\n");

        input.nextLine();
    }
}
