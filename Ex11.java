package com.victor.avaliacao_3;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        int[] D = new int[30];

        System.out.println("Alimente o vetor A com 10 números inteiros:");
        for (int i = 0; i < A.length; i++) {
            System.out.print((i + 1) + "º número: ");
            A[i] = sc.nextInt();
        }

        System.out.println("\nAlimente o vetor B com 10 números inteiros:");
        for (int i = 0; i < B.length; i++) {
            System.out.print((i + 1) + "º número: ");
            B[i] = sc.nextInt();
        }

        System.out.println("\nAlimente o vetor C com 10 números inteiros:");
        for (int i = 0; i < C.length; i++) {
            System.out.print((i + 1) + "º número: ");
            C[i] = sc.nextInt();
        }

        int indexD = 0;
        for (int i = 0; i < A.length; i++) {
            D[indexD++] = A[i];
            D[indexD++] = B[i];
            D[indexD++] = C[i];
        }

        System.out.println("\nValores intercalados:");
        for (int i = 0; i < D.length; i++) {
            System.out.println((i + 1) + "º número: " + D[i]);
        }

        sc.close();
    }
}
