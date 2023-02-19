package ru.otus.homework.month1.hw6;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        //объявляю переменные
        final int NUMBER_OF_QUESTIONS = 3; //Количество вопросов в тесте
        int percentAnswer; //процент верных ответов от общего количества, вывожу в конце теста, намеренно int, чтобы отбросить числа после запятой
        int counterAnswer = 0; //счетчик количества верных ответов, по умолчанию 0
        int questionAnswer; //пользовательский ввод

        //объявляю массивы
        int[] correctAnswers = {1, 2, 3};
        String[] questions = {"Каков радиус земли? Введите номер верного ответа:", "Сколько спутников у Земли? Введите номер верного ответа:", "Какая по счету планета Земля от солнца? Введите номер верного ответа:"};
        String[] answerOptions = {"1) 6371км 2) 3353км 3) 42970км", "1) Три 2) Один 3) Шесть", "1) Вторая 2) Четвертая 3) Третья"};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(answerOptions[i]);

            questionAnswer = scanner.nextInt();

            if (questionAnswer == correctAnswers[i]) {
                counterAnswer++;
                System.out.println("Правильно");
            } else if (questionAnswer <= NUMBER_OF_QUESTIONS) {
                System.out.println("Неправильно");
            } else if (questionAnswer > NUMBER_OF_QUESTIONS) {
                System.out.println("Неверный ввод");
            }
        }

        //Считаю процент верных ответов пользователя после прохождения тестирования
        percentAnswer = (counterAnswer*100) / NUMBER_OF_QUESTIONS;
        System.out.println("Тест закончен! Набранное количество баллов - " + counterAnswer + ", " + "что составляет " + percentAnswer + "% от максимального количества баллов.");
    }
}