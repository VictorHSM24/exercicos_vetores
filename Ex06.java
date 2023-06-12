package com.victor.avaliacao_3;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene
 * num vetor a média de cada aluno, imprima o número de alunos com média maior
 * ou igual a 7.0.
 */
public class Ex06 {

    public static int countGreaterOrEqualsSeven(double[] media) {
        int count = 0;
        for (double m : media) {
            if (m >= 7.0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] media = new double[10];
        double[] grades = new double[4];
        double sum = 0;

        System.out.println("Entre com 4 notas:");
        for (int i = 0; i < media.length; i++) {
            System.out.println("");
            System.out.println((i+1) + "º aluno");
            for (int j = 0; j < grades.length; j++) {
                System.out.print((j + 1) + "ª nota: ");
                grades[j] = sc.nextDouble();
                sum += grades[j];
            }

            media[i] = sum / grades.length;
        }

        System.out.println("Há " + countGreaterOrEqualsSeven(media)
                + " alunos cuja média é maior ou igual a 7");

        sc.close();
    }
}
