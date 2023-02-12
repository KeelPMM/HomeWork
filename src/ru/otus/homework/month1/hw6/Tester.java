package ru.otus.homework.month1.hw6;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {

        //объявляю переменные
        final int NUMBER_OF_QUESTIONS = 3; //количество вопросов в тесте, необходимо для вывода правильности ответа после каждого вопроса
        int counter = 0; //счетчик количества верных ответов, по умолчанию 0
        int percent; //процент верных ответов от общего количества, вывожу в конце теста, намеренно int, чтобы отбросить числа после запятой
        char questionOneAnswer; //пользовательский ввод на первый вопрос теста
        char questionTwoAnswer; //пользовательский ввод на второй вопрос теста
        char questionThreeAnswer; //пользовательский ввод на третий вопрос теста

        //Вопрос 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какова скорость света? Введите номер верного ответа:");
        System.out.println("1 - ~274 тыс. км/сек");
        System.out.println("2 - ~299 тыс. км/сек");
        System.out.println("3 - ~213 тыс. км/сек");
        questionOneAnswer = scanner.next().charAt(0);
        switch (questionOneAnswer){
            case '1', '3':
                counter = counter + 0;
                System.out.println("Неправильно, в действительности ~299 тыс. км/сек.");
                break;
            case '2':
                counter = counter + 1;
                System.out.println("Правильно");
                break;
            default:
                System.out.println("Неверный ввод");
        }

        //Вопрос 2
        System.out.println("На какое расстояние отдалился самый далекий рукотворный объект человека от земли? Введите номер верного ответа:");
        System.out.println("1 - ~155 а.е.");
        System.out.println("2 - ~0,064 светового года");
        System.out.println("3 - ~458 млн. км.");
        questionTwoAnswer = scanner.next().charAt(0);
        switch (questionTwoAnswer){
            case '1':
                counter = counter + 1;
                System.out.println("Правильно");
                break;
            case '2','3':
                counter = counter + 0;
                System.out.println("Неправильно, в действительности ~155 а.е., или 23 187 669 958.5 км. от земли, Вояджер 1");
                break;
            default:
                System.out.println("Неверный ввод");
        }

        //Вопрос 3
        System.out.println("На каком расстоянии находится самый далекий наблюдаемый объект вселенной? Введите номер верного ответа:");
        System.out.println("1 - ~13,5 млрд. световых лет");
        System.out.println("2 - ~350,9 млн парсек");
        System.out.println("3 - ~458 643 a.e.");
        questionThreeAnswer = scanner.next().charAt(0);
        switch (questionThreeAnswer){
            case '1':
                counter = counter + 1;
                break;
            case '2','3':
                counter = counter + 0;
                System.out.println("Неправильно, в действительности  мы можем наблюдать лишь сферу радиусом ~13,5 млрд. световых лет от земли, ввиду ограничения распостранения скорости света.");
                break;
            default:
                System.out.println("Неверный ввод");
        }

        //Считаю процент верных ответов пользователя после прохождения тестирования
        percent = (counter*100) / NUMBER_OF_QUESTIONS;
        System.out.println("Тест закончен! Набранное количество баллов - " + counter + ", " + "что составляет " + percent + "% от максимального количества баллов.");
    }
}