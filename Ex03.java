package com.victor.avaliacao_3;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
 */
public class Ex03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] array = new double[4];
        System.out.println("Entre com 4 notas:");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + "ª nota: ");
            array[i] = sc.nextDouble();
        }

        double sum = 0;
        int count = 0;
        System.out.println("\nNotas digitadas:");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "ª nota: " + array[i]);
            sum += array[i];
            count++;
        }

        // O laço acima foi aproveitado para o cálculo da média
        System.out.printf("\nMédia das notas: %.2f", (sum / count));

        sc.close();
    }
}
