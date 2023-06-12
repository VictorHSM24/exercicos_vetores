package com.victor.avaliacao_3;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Entre com 5 números inteiros:");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + " número: ");
            array[i] = sc.nextInt();
        }

        int sum = 0;
        int mult = 1;

        System.out.println("\nNúmeros informados:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            sum += array[i];
            mult *= array[i];
        }

        System.out.println("\nSoma: " + sum);
        System.out.println("Multiplicação: " + mult);

        sc.close();
    }
}
