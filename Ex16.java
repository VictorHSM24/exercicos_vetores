package com.victor.avaliacao_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        List<Double> salaries = new ArrayList<>();
        int[] salaryRanges = new int[9];
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os salários dos vendedores (digite um valor negativo para finalizar):");
        double salary;
        do {
            System.out.print("Salário do vendedor: R$");
            salary = sc.nextDouble();

            if (salary >= 0) {
                salaries.add(salary);
            }
        } while (salary >= 0);

        for (double s : salaries) {
            int index = (int) ((s - 200) / 100);

            if (index >= 0 && index < salaryRanges.length) {
                salaryRanges[index]++;
            } else if (index >= salaryRanges.length) {
                salaryRanges[salaryRanges.length - 1]++;
            }
        }

        System.out.println("\nNúmero de vendedores em cada faixa salarial:");
        for (int i = 0; i < salaryRanges.length; i++) {
            if (i == salaryRanges.length - 1) {
                System.out.println("$" + (200 + i * 100) + " em diante: " + salaryRanges[i]);
            } else {
                System.out.println("$" + (200 + i * 100) + " - $" + (299 + i * 100) + ": " + salaryRanges[i]);
            }
        }
        sc.close();
    }
}
