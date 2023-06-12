package com.victor.avaliacao_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex23 {

    public static int countLines(File file) throws FileNotFoundException {
        int count = 0;
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            sc.nextLine();
            count++;
        }

        sc.close();
        return count;
    }

    public static String report(String[] names, String[] bytes, int count) {
        StringBuilder sb = new StringBuilder();

        sb.append("ACME Inc.").append("             Uso do espaço em disco pelos usuários\n");
        sb.append("---------------------------------------------------------------------------\n");

        sb.append("Nr.   Usuário         Espaço utilizado (MB)    % do uso\n");

        double[] bytesDouble = new double[count];
        double totalStorageUsed = 0;
        int countUsedStorages = 0;

        for (int i = 0; i < bytes.length; i++) {
            bytesDouble[i] = Double.parseDouble(bytes[i]);
            totalStorageUsed += bytesDouble[i];
            countUsedStorages++;
        }

        for (int i = 0; i < names.length; i++) {
            sb.append(String.format("%-5d", (i + 1)))
                    .append(String.format("%-18s", names[i]))
                    .append(String.format("%-15.2f", (bytesDouble[i] / (1024 * 1024))))
                    .append(String.format("%-8.2f", (bytesDouble[i] / totalStorageUsed) * 100))
                    .append("%\n");
        }

        sb.append("\nEspaço total ocupado: ").append(String.format("%.2f", totalStorageUsed / (1024 * 1024))).append(" MB\n");
        sb.append("Espaço médio ocupado: ").append(String.format("%.2f", (totalStorageUsed / (1024 * 1024)) / countUsedStorages))
                .append(" MB\n");

        return sb.toString();
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try {
            // COLOQUE ABAIXO O CAMINHO ONDE O ARQUIVO ESTÁ GRAVADO NO SEU COMPUTADOR
            File file = new File("");
            Scanner sc = new Scanner(file);

            int numLines = countLines(file);
            String[] names = new String[numLines];
            String[] bytes = new String[numLines];

            int indexNames = 0, indexBytes = 0;

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split("\\s+");
                String name = parts[0];
                String number = parts[1];

                names[indexNames] = name;
                indexNames++;
                bytes[indexBytes] = number;
                indexBytes++;
            }

            // Gravação do relatório num arquivo
            try {

                String reportText = report(names, bytes, countLines(file));

                // Escrever o relatório em um arquivo
                File reportFile = new File("C:\\Users\\User\\relatório.txt");
                try (FileWriter writer = new FileWriter(reportFile)) {
                    writer.write(reportText);
                }

                System.out.println("O relatório foi gerado no caminho C:\\Users\\User\\relatório.txt");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
