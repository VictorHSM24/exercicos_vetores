package com.victor.avaliacao_3;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Digite as notas (digite -1 para encerrar):");

        double grade;
        int indexGrade = 1;
        while ((grade = sc.nextDouble()) != -1) {
            grades.add(grade);
            indexGrade++;
        }

        System.out.println("\na) Quantidade de valores lidos: " + grades.size());

        System.out.println("b) Valores informados: ");
        for (double g : grades) {
            System.out.print(g + "\n");
        }

        System.out.println("\nc) Valores informados (ordem inversa):");
        for (int i = grades.size() - 1; i >= 0; i--) {
            System.out.println(grades.get(i));
        }

        double sum = 0;
        for (double g : grades) {
            sum += g;
        }

        double average = sum / grades.size();

        System.out.println("d) Soma dos valores: " + sum);
        System.out.printf("e) Média dos valores: %.2f\n", average);

        int aboveAverage = 0;
        int belowAverage = 0;

        for (double g : grades) {
            if (g > average) {
                aboveAverage++;
            }
            if (g < 7) {
                belowAverage++;
            }
        }

        System.out.println("f) Quantidade de valores acima da média: " + aboveAverage);
        System.out.println("g) Quantidade de valores abaixo de sete: " + belowAverage);

        System.out.println("\nPrograma encerrado.");

        sc.close();
    }
}
