package com.victor.avaliacao_3;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        final int MAX_PLAYERS = 23;
        int[] votes = new int[MAX_PLAYERS];
        int playerNumber;
        int totalVotes = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enquete: Quem foi o melhor jogador?");

        while (true) {
            System.out.print("Número do jogador (0 = fim): ");
            playerNumber = sc.nextInt();

            if (playerNumber == 0) {
                break;
            }

            if (playerNumber < 1 || playerNumber > 23) {
                System.out.println("Informe um valor entre 1 e 23 ou 0 para sair!");
                continue;
            }

            votes[playerNumber - 1]++;
            totalVotes++;
        }

        System.out.println("\nResultado da votação:\n");
        System.out.println("Foram computados " + totalVotes + " votos.\n");

        System.out.println("Jogador\tVotos\t%");
        for (int i = 0; i < MAX_PLAYERS; i++) {
            if (votes[i] > 0) {
                double percentual = (double) votes[i] / totalVotes * 100;
                System.out.printf("%d\t%d\t%.1f%%\n", i + 1, votes[i], percentual);
            }
        }

        int bestPlayer = 0;
        int votesBestPlayer = 0;

        for (int i = 0; i < MAX_PLAYERS; i++) {
            if (votes[i] > votesBestPlayer) {
                bestPlayer = i + 1;
                votesBestPlayer = votes[i];
            }
        }

        double percentualMelhorJogador = (double) votesBestPlayer / totalVotes * 100;
        System.out.println("\nO melhor jogador foi o número " + bestPlayer + ", com "
                + votesBestPlayer + " votos, correspondendo a " + percentualMelhorJogador
                + "% do total de votos.");

        sc.close();
    }
}
