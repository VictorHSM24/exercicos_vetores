package com.victor.avaliacao_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Faça um Programa que leia um vetor de 10 caracteres, e diga quantas
 * consoantes foram lidas. Imprima as consoantes.
 */
public class Ex04 {

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] array = new char[10];

        System.out.println("Entre com 10 caracteres:");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + "º caractere: ");
            array[i] = sc.next().charAt(0);
        }

        int count = 0;
        System.out.println("\nConsoantes:");
        for (int i = 0; i < array.length; i++) {
            if (!isVowel(Character.toLowerCase(array[i]))
                    && Character.isLetter(array[i])) {
                System.out.println(array[i]);
                count++;
            }
        }

        System.out.println("\nForam lidas " + count + " consoantes");

        sc.close();
    }
}
