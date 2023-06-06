package com.victor.avaliacao_3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex20 {

    public static int listingAllowances(List<Double> incomes, List<Double> allowances,
            int index, int countMinCollaborators) {
        double allowance = incomes.get(index) * 0.2;
        if (allowance < 100) {
            allowances.add(100.00);
            countMinCollaborators++;
        } else {
            allowances.add(allowance);
        }
        return countMinCollaborators;
    }

    public static double sumAllowances(List<Double> allowances) {
        double sum = 0;
        for (double a : allowances) {
            sum += a;
        }
        return sum;
    }

    public static double biggestAllowance(List<Double> allowances) {
        double biggest = allowances.get(0);
        for (double a : allowances) {
            if (biggest < a) {
                biggest = a;
            }
        }
        return biggest;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        List<Double> incomes = new ArrayList<>();
        List<Double> allowances = new ArrayList<>();
        double income;
        int countCollaborators = 0;
        int countMinCollaborators = 0;

        System.out.println("Entre com os salários:");
        while (true) {
            System.out.print("Salário: ");
            income = sc.nextDouble();
            if (income == 0) {
                break;
            } else {
                incomes.add(income);
                countCollaborators++;
            }
        }

        System.out.println("\nSalário\t\tAbono");
        for (int i = 0; i < incomes.size(); i++) {
            countMinCollaborators = listingAllowances(incomes, allowances, i, countMinCollaborators);
            System.out.printf("R$ %.2f\tR$ %.2f\n", incomes.get(i), allowances.get(i));
        }

        System.out.println("\nForam processados " + countCollaborators + " colaboradores");
        System.out.printf("Total gasto com abonos R$ %.2f", sumAllowances(allowances));
        System.out.println("\nValor mínimo pago a " + countMinCollaborators + " colaboradores");
        System.out.print("Maior valor de abono pago: R$ " + df.format(biggestAllowance(allowances)));
        sc.close();
    }
}
