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

        Scanner scanner = new Scanner(System.in);

        Vopros Vopros1 = new Vopros();
        Otvet Otvet1 = new Otvet();

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            Vopros1.printQuestion();
            Otvet1.printAnswer();

            questionAnswer = scanner.nextInt();
        }
    }
}

