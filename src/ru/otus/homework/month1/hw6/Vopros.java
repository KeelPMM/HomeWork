package ru.otus.homework.month1.hw6;

public class Vopros {
    public int numberQuestion;
    public String[] questions = {"Каков радиус земли? Введите номер верного ответа:", "Сколько спутников у Земли? Введите номер верного ответа:", "Какая по счету планета Земля от солнца? Введите номер верного ответа:"};

    public void printQuestion() {
        System.out.println(questions[numberQuestion]);
    }
}


