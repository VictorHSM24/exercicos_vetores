package com.victor.avaliacao_3;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

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

        int index = 0;
        for (int i = 0; i < 10; i++) {
            C[index++] = A[i];
            C[index++] = B[i];
        }

        System.out.println("\nValores intercalados:");

        for (int i = 0; i < C.length; i++) {
            System.out.println((i + 1) + "º número: " + C[i]);
        }
        System.out.println("\n" + C[0]);

        sc.close();
    }
}
