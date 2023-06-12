package com.victor.avaliacao_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Double> monthlyTemperatures = new ArrayList<>();

        for (int month = 1; month <= 12; month++) {
            System.out.print("Entre com a média de temperatura para o mês " + month + ": ");
            double temperature = sc.nextDouble();
            monthlyTemperatures.add(temperature);
        }

        double annualAverage = calculateAnnualAverage(monthlyTemperatures);

        System.out.println("\nTemperaturas acima da média anual:");
        for (int month = 0; month < monthlyTemperatures.size(); month++) {
            double temperature = monthlyTemperatures.get(month);
            if (temperature > annualAverage) {
                String monthName = getMonthName(month + 1);
                System.out.println(monthName + " - " + temperature);
            }
        }

        sc.close();
    }

    public static double calculateAnnualAverage(List<Double> temperatures) {
        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        return sum / temperatures.size();
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                               "Julio", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return monthNames[month - 1];
    }
}
