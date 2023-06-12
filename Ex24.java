package com.victor.avaliacao_3;

import java.util.Random;

public class Ex24 {

    public static String report(int[] releases) {
        StringBuilder sb = new StringBuilder();

        int[] count = new int[6];

        for (int i = 0; i < releases.length; i++) {
            switch (releases[i]) {
                case 1 ->
                    count[0]++;
                case 2 ->
                    count[1]++;
                case 3 ->
                    count[2]++;
                case 4 ->
                    count[3]++;
                case 5 ->
                    count[4]++;
                case 6 ->
                    count[5]++;
            }
        }

        sb.append("Nº  Lançamentos\n");

        for (int i = 0; i < count.length; i++) {
            sb.append(String.format("%-5d", (i + 1)))
                    .append(String.format("%-5d", count[i]))
                    .append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] releases = new int[100];

        for (int i = 0; i < releases.length; i++) {
            releases[i] = random.nextInt(6) + 1;
        }

        System.out.print(report(releases));
    }
}
