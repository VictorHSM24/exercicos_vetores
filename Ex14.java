package com.victor.avaliacao_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> questions = new ArrayList<>();
        questions.add("Telefonou para a vítima?");
        questions.add("Esteve no local do crime?");
        questions.add("Mora perto da vítima?");
        questions.add("Devia para a vítima?");
        questions.add("Já trabalhou com a vítima?");

        int positiveAnswers = 0;
        System.out.println("Responda às perguntas a seguir com s para sim ou n para não");
        for (String question : questions) {
            System.out.print(question + " ");
            String answer = sc.nextLine().toLowerCase();
            if (answer.equals("s")) {
                positiveAnswers++;
            }
        }

        String classification;
        if (positiveAnswers == 2) {
            classification = "Suspeita";
        } else if (positiveAnswers >= 3 && positiveAnswers <= 4) {
            classification = "Cúmplice";
        } else if (positiveAnswers == 5) {
            classification = "Assassino";
        } else {
            classification = "Inocente";
        }

        System.out.println("\nClassificação: " + classification);

        sc.close();
    }
}
