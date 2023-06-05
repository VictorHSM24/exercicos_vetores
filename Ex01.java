package com.victor.avaliacao_3;

import java.util.Scanner;

/**
 * Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        System.out.println("Entre com 5 números inteiros:");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + "º número: ");
            array[i] = sc.nextInt();
        }

        System.out.println("\nNúmeros digitados: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "º número: " + array[i]);
        }

        sc.close();
    }
}
