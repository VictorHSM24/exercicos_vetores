package com.victor.avaliacao_3;

import java.util.Locale;
import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[30];
        double[] heights = new double[30];

        System.out.println("Entre com a idade e a altura de 30 alunos:");

        for (int i = 0; i < 30; i++) {
            System.out.print("Idade do " + (i + 1) + "º aluno: ");
            ages[i] = sc.nextInt();
            System.out.print("Altura do " + (i + 1) + "º aluno: ");
            heights[i] = sc.nextDouble();
        }

        double sumHeights = 0;
        for (int i = 0; i < 30; i++) {
            sumHeights += heights[i];
        }
        double averageHeight = sumHeights / 30;

        int studentsAge13HeightBelowAverage = 0;
        for (int i = 0; i < 30; i++) {
            if (ages[i] > 13 && heights[i] < averageHeight) {
                studentsAge13HeightBelowAverage++;
            }
        }

        System.out.println("Número de alunos de 13 anos cuja altura é inferior à média de todos: "
                + studentsAge13HeightBelowAverage);

        sc.close();
    }
}
