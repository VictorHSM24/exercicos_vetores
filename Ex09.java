package com.victor.avaliacao_3;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[10];

        System.out.println("Entre com 10 números inteiros:");

        // Read values into the array
        for (int i = 0; i < A.length; i++) {
            System.out.print((i + 1) + "º número: ");
            A[i] = scanner.nextInt();
        }

        int sumOfSquares = 0;

        for (int i = 0; i < A.length; i++) {
            sumOfSquares += Math.pow(A[i], 2);
        }

        System.out.println("A soma dos quadrados é: " + sumOfSquares);
    }
}
