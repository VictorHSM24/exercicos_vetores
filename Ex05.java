package com.victor.avaliacao_3;

import java.util.Scanner;

/**
 * Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
 * Armazene os números pares no vetor PAR e os números IMPARES no vetor impar.
 * Imprima os três vetores
 */
public class Ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[20];
        int[] even = new int[20];
        int[] odd = new int[20];

        System.out.println("Entre com 20 números inteiros:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + "º número: ");
            numbers[i] = sc.nextInt();
        }

        int indexEven = 0, indexOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even[indexEven] = numbers[i];
                indexEven++;
            } else {
                odd[indexOdd] = numbers[i];
                indexOdd++;
            }
        }

        System.out.println("\nVetor original:");
        for (int n : numbers) {
            System.out.println(n);
        }

        System.out.println("\nNúmeros pares:");
        for (int e : even) {
            if (e != 0) {
                System.out.println(e);
            }
        }
        System.out.println("\nNúmeros ímpares:");
        for (int o : odd) {
            if (o != 0) {
                System.out.println(o);
            }
        }

        sc.close();
    }
}
