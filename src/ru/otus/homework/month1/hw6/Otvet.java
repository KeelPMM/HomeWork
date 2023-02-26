package ru.otus.homework.month1.hw6;

public class Otvet {
    public int numberAnswer;
    public String[] answerOptions = {"1) 6371км 2) 3353км 3) 42970км", "1) Три 2) Один 3) Шесть", "1) Вторая 2) Четвертая 3) Третья"};

    public void printAnswer() {
        System.out.println(answerOptions[numberAnswer]);
    }
}
