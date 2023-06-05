package com.victor.avaliacao_3;

import java.util.Locale;
import java.util.Scanner;

/*
* Faça um Programa que leia um vetor de 10 números reais
* e mostre-os na ordem inversa.
 */
public class Ex02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] array = new double[10];
        System.out.println("Entre com 10 números reais:");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + "º número: ");
            array[i] = sc.nextDouble();
        }

        System.out.println("\nNúmeros digitados (na ordem inversa): ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println((i + 1) + "º número: " + array[i]);
        }

        sc.close();
    }
}
