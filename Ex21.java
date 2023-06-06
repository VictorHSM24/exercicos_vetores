package com.victor.avaliacao_3;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * @author User
 */
public class Ex21 {

    public static String mostEconomicCAr(String[] carsNames,
            double[] carAutonomy) {
        double biggestAutonomy = carAutonomy[0];
        int indexBiggestAutonomy = 0;
        for (int i = 0; i < carsNames.length; i++) {
            if (biggestAutonomy < carAutonomy[i]) {
                biggestAutonomy = carAutonomy[i];
                indexBiggestAutonomy = i;
            }
        }
        return carsNames[indexBiggestAutonomy];
    }

    public static double consumptionHundredKm(double[] consumption, int index) {
        return 1000.00 / consumption[index];
    }

    public static double priceHundredKm(double consumptionHundredKm, double pricePerLiter) {
        return consumptionHundredKm * pricePerLiter;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] carsNames = new String[5];
        double[] carAutonomy = new double[5];

        System.out.println("Comparativo de Consumo de Combustível");
        for (int i = 0; i < 5; i++) {
            System.out.println("Veículo " + (i + 1));
            System.out.print("Nome: ");
            carsNames[i] = sc.nextLine();
            System.out.print("Km por litro: ");
            carAutonomy[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("\nRelatório final\n");
        for (int i = 0; i < carsNames.length; i++) {
            String consumption = String.format("%.1f", consumptionHundredKm(carAutonomy, i));
            String price = String.format("%.2f", priceHundredKm(consumptionHundredKm(carAutonomy, i), 2.25));
            System.out.printf("%-2s - %-8s - %-5.1f - %-14s - R$ %s\n",
                    (i + 1), carsNames[i], carAutonomy[i],
                    consumption + " litros", price);
        }

    }
}
