package com.victor.avaliacao_3;

import java.util.Locale;
import java.util.Scanner;

import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Entre com o nome do atleta (deixe em branco para sair): ");
            String athleteName = sc.nextLine();

            if (athleteName.isEmpty()) {
                break;
            }

            double[] jumps = new double[5];

            for (int i = 0; i < 5; i++) {
                System.out.print("Entre com a distância do " + (i + 1) + "º salto: ");
                jumps[i] = sc.nextDouble();
            }

            double jumpsAverage = calculateAverage(jumps);

            System.out.println("\nResultado final:");
            System.out.println("Atleta: " + athleteName);
            System.out.print("Saltos: ");
            for (int i = 0; i < jumps.length; i++) {
                System.out.print(jumps[i]);
                if (i != jumps.length - 1) {
                    System.out.print(" - ");
                }
            }
            System.out.println();
            System.out.printf("Média dos saltos: %.2f m", jumpsAverage);
            System.out.println("\n");
            sc.nextLine();
        }
        sc.close();
    }

    public static double calculateAverage(double[] jumps) {
        double sum = 0;
        for (double jump : jumps) {
            sum += jump;
        }
        return sum / jumps.length;
    }
}
