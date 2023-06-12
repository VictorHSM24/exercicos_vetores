package com.victor.avaliacao_3;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[5];
        double[] heights = new double[5];

        System.out.println("Digite as informações das 5 pessoas:");

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "ª pessoa:");
            System.out.print("Idade: ");
            ages[i] = sc.nextInt();
            System.out.print("Altura: ");
            heights[i] = sc.nextDouble();
            System.out.println("");
        }

        System.out.println("\nIdades na ordem inversa:");
        for (int i = ages.length - 1; i >= 0; i--) {
            System.out.println(ages[i]);
        }

        System.out.println("\nAlturas na ordem inversa:");
        for (int i = heights.length - 1; i >= 0; i--) {
            System.out.println(heights[i]);
        }
        sc.close();
    }
}
