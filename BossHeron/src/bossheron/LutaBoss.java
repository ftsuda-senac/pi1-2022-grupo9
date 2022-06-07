package bossheron;

import java.util.Scanner;

/**
 *
 * @author heron
 */
public class LutaBoss {

    void personagem(String persona) {
        switch (persona) {
            case "1":
                Guerreiro_x_Boss();
                break;
            case "2":
                Sacerdote_x_Boss();
                break;
            case "3":
                MestreDeEscudos_x_Boss();
                break;

        }

    }

    void Guerreiro_x_Boss() {
        int random;
        int bosslife = 100;
        System.out.println("Guerreiro, chegou a sua hora !");

        while (bosslife > 1) {
            Scanner input = new Scanner(System.in);
            System.out.println("Digite 1 para atacar");
            System.out.println("Digite 2 para se esconder");
            System.out.println("Digite 3 para se defender");
            System.out.println("");
            int resposta = input.nextInt();
            if (resposta == 1) {
                random = 1 + (int) (Math.random() * 100);
                if (random % 2 == 0) {
                    System.out.println("Boss perdeu -10% de vida!");
                    bosslife = bosslife - 10;
                    System.out.println("Vida atual do boss: " + bosslife + "%");

                } else {
                    System.out.println("Boss conseguiu se defender");
                }
            }
        }
        System.out.println("O Boss Morreu");

    }

    void Sacerdote_x_Boss() {

    }

    void MestreDeEscudos_x_Boss() {
    }
}
