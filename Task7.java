package ru.jborn.core.chekurova.julia.lesson2;

public class Task7 {
    //Дано трехзначное число. Выяснить, является ли оно палиндромом ("перевертышем"),
    // т. е. таким числом, десятичная запись которого читается одинаково слева направо и справа налево.
    public static void main(String[] args) {
        returnResult(323);
        returnResult(111);
        returnResult(123);

    }
    public static void returnResult(int a){
        int hundred = a / 100;
        int tenths = a / 10 % 10;
        int lastNumber = (a % 100) %10;
        if (hundred == lastNumber){
            System.out.println("Число палиндромом");
        }else {
            System.out.println("Число не палиндромом");
        }

    }

}
