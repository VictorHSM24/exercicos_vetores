package com.victor.avaliacao_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Formatter;

public class Ex22 {

    public static String report(List<Integer> id, List<Integer> stateNumber) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Quantidade de mouses: ").append(id.size()).append("\n");
        sb.append("\n");
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;

        String[] stateString = {
            "Necessita da esfera",
            "Necessita de limpeza",
            "Necessita de troca do cabo ou conector",
            "Quebrado ou inutilizado"
        };

        for (int i = 0; i < id.size(); i++) {
            int state = stateNumber.get(i);
            switch (state) {
                case 1 ->
                    count1++;
                case 2 ->
                    count2++;
                case 3 ->
                    count3++;
                case 4 ->
                    count4++;
                default -> {
                }
            }
        }

        sb.append("Situação                                   Quantidade    Percentual\n");

        int total = id.size();
        double percent1 = (double) count1 / total * 100;
        double percent2 = (double) count2 / total * 100;
        double percent3 = (double) count3 / total * 100;
        double percent4 = (double) count4 / total * 100;

        Formatter formatter = new Formatter(sb);

        formatter.format("%-3d%-42s%-14d%-8.2f%%\n", 1, " - " + stateString[0], count1, percent1);
        formatter.format("%-3d%-42s%-14d%-8.2f%%\n", 2, " - " + stateString[1], count2, percent2);
        formatter.format("%-3d%-42s%-14d%-8.2f%%\n", 3, " - " + stateString[2], count3, percent3);
        formatter.format("%-3d%-42s%-14d%-8.2f%%\n", 4, " - " + stateString[3], count4, percent4);

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> id = new ArrayList<>();
        List<Integer> stateNumber = new ArrayList<>();

        System.out.println("Insira os dados referentes a cada mouse\n");
        System.out.println("ATENÇÃO: deve-se, primeiramente, inserir o número de identificação do mouse"
                + " e, depois, o número referente à condição em que ele se encontra. A seguir está uma lista com"
                + " os  possíveis números de condição: ");
        System.out.println("\nEstado:");
        System.out.println("""
                           1 - Necessita da esfera
                           2 - Necessita de limpeza
                           3 - Necessita de troca do cabo ou conector
                           4 - Quebrado ou inutilizado""");
        while (true) {
            System.out.print("Número de identificação: ");
            int idIn = sc.nextInt();
            if (idIn == 0) {
                break;
            } else {
                id.add(idIn);
            }
            System.out.print("Condição: ");
            int stateNumberIn = sc.nextInt();
            stateNumber.add(stateNumberIn);
            System.out.println("");
        }

        System.out.print(report(id, stateNumber));

        sc.close();
    }
}
