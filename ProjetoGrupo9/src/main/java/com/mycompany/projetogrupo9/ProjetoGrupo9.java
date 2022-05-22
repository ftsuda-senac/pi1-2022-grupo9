package com.mycompany.projetogrupo9;

import java.util.Scanner;

public class ProjetoGrupo9 {

    private static String persona;
    private static String jogador;
    
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuJogo;
        int escolha;
        System.out.println("\nSeja bem-vindo");
        System.out.println("-------------Return of the hero: The Dragons Death-------------");

        do {
            do {
                escolha = 0;
                menuJogo = menuJogo(input);
                switch (menuJogo) {
                    case 2:
                        escolha = Historia(input);
                        break;
                    case 3:
                        escolha = creditos(input);
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        break;
                }

            } while (escolha == 1);

            System.out.println("\nSeja bem-vindo Guerreiro!");
            do {
                System.out.println("\n\"Essa voz, a voz que você e trouxe você até aqui, somos nós,\\n os assolados flagelos que escutamos nossas vidas roubadas pelo demônio.\n A esta altura você deve saber a fonte do seu poder, estamos com você concedendo o que nos resta de energia vital para acabar com este pesadelo.\nAgora adentramos dentro do covil, demônio demônio com você afim de cumprir nossa profecia. Existem salas intimamente ligadas com o herói, assim como somos com você, herói.\n");
                System.out.println("Voce esta preparado");
                System.out.println("1 - Sim\n 2 - Não");

                escolha = input.nextInt();

                if (escolha == 1) {
                } else {
                    System.out.println("Volte quando estiver preparado");
                    System.exit(0);
                    System.out.println("\nResposta inválida, tente novamente!");
                    escolha = 3;
                }
            } while (escolha == 3);
        } while (escolha != 1);

        System.out.println("\nVocê tem coragem!\n");

        personagem(input);
        jogador(input);

        System.out.println(jogador + ", " + persona);

        System.out.println("Vamos Começar!");

        do {
            int opção_porta1;
            
            
            System.out.println("O chão começa a tremer e você cai em uma sala parecida com um hall.");
            System.out.println("Você se sente tonto com a queda e com a visão turva.");
            System.out.println("Você olha em volta e vê uma estrutura parecida com a de um castelo");
            System.out.println("Depois de olhar a sala por completo, se depara com dois caminhos.");
            System.out.println("O medo existe em você, mas com coragem você decide escolher um caminho.");
            System.out.println();
            System.out.println("Qual caminho você deseja escolher? ");
            System.out.println("1- Caminho da esquerda");
            System.out.println("2- Caminho da direita");
            opção_porta1 = input.nextInt(); 
            
            switch  (opção_porta1){
                case "1":
                    //caminho da esqueda
                    do {
                        System.out.println("Ao entrar na sala você se depara com algo escuro, que se encontra imóvel.");
                        System.out.println("Você olha um pouco mais de perto e parece ser uma criatura.");
                        System.out.println("Você vê a criatura e ela aparenta estar adormecida.");
                        System.out.println("(alma) Herói, o que faremos? ");
                        System.out.println("1 - Ataque com a espada:");
                        System.out.println("2 - Ataque com fogo:");
                        System.out.println("3 - Feitiço imobilizador:");
                        System.out.println("4 - Tentar passar pela sala sem acorda-la");
                        opção_porta1 = input.nextInt();
                        
                        switch (opção_porta1){
                            case "1":
                                if (opção_porta1 == 1) {
                                    System.out.println("O ataque atinge a criatura, quando ela se levanta é notável que trata-se de uma aranha.");
                                    System.out.println("O ambiente se encontrava lotado de teias, com isso tudo se queima e o ataque é super efetivo.");
                                    System.out.println("A aranha tenta revidar mesmo em chamas, mas já afetada pelo ataque, você devia e desfere o golpe final com a sua espada.");
                                    System.out.println();
                                    System.out.println("Com isso você passa pela sala em chamas e chega a um novo sagoão.");
                                    
                                }
                                
                        }
                            
                        
                         
                         
                        
                        
                    } while (true);
                    break;
                    
                    
            
                case 2:
                    //demonio esqueleto
                    
                   
                    
            }
            
            
            
            
            
           
            
            
            
            
            
            
            
                  
            
            
            
            
            
            

        } while (true);
        break;

    }

    public static int menuPrincipal(Scanner input) {
        int menuInicial;

        do {
            System.out.println("\nMENU");
            System.out.println("1- Jogar\n2- Instruções\n3- Créditos\n4- Sair\n");
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
}
