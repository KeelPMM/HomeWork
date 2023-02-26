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

        Vopros VoprosSerial[] = new Vopros[2];
        Otvet OtvetSerial[] = new Otvet[2];

        for (int i = 0; i < VoprosSerial.length; i++) {
            VoprosSerial.printQuestion();
            OtvetSerial.printAnswer();

            questionAnswer = scanner.nextInt();
        }
    }
}

