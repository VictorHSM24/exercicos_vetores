package com.victor.avaliacao_3;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votes = new int[6];
        int totalVotes = 0;

        String[] operatingSystems = {"Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro"};

        System.out.println("Enquete: Qual o melhor Sistema Operacional para uso em servidores?");
        System.out.println("As possíveis respostas são:");
        System.out.println("1- Windows Server");
        System.out.println("2- Unix");
        System.out.println("3- Linux");
        System.out.println("4- Netware");
        System.out.println("5- Mac OS");
        System.out.println("6- Outro");
        System.out.println("Digite o número correspondente ao Sistema Operacional ou 0 para encerrar a enquete:");

        int ans;
        do {
            ans = sc.nextInt();
            if (ans >= 1 && ans <= 6) {
                votes[ans - 1]++;
                totalVotes++;
            } else if (ans != 0) {
                System.out.println("Opção inválida. Digite novamente:");
            }
        } while (ans != 0);

        System.out.println("\nResultado da enquete:");
        System.out.println("Sistema Operacional\t\tVotos\t\t%");

        for (int i = 0; i < operatingSystems.length; i++) {
            System.out.printf("%-20s\t\t%d\t\t%.1f%%\n", operatingSystems[i], votes[i], (votes[i] * 100.0) / totalVotes);
        }

        System.out.println("---------------------------\t-----\t\t---");
        System.out.println("Total\t\t\t\t" + totalVotes);

        int maiorVotos = 0;
        int indiceVencedor = 0;

        for (int i = 0; i < votes.length; i++) {
            if (votes[i] > maiorVotos) {
                maiorVotos = votes[i];
                indiceVencedor = i;
            }
        }

        System.out.println("O Sistema Operacional mais votado foi o " + operatingSystems[indiceVencedor]
                + ", com " + maiorVotos + " votos, correspondendo a " + String.format("%.1f%%", (maiorVotos * 100.0) / totalVotes) + " dos votos.");

        sc.close();
    }
}
