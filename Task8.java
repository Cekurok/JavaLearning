package ru.jborn.core.chekurova.julia.lesson2;

public class Task8 {
    // Дано трехзначное число. Определить, есть ли среди его цифр одинаковые.

    public static void main(String[] args) {
        returnResult(323);
        returnResult(111);
        returnResult(123);

    }
    public static void returnResult(int a){
        int hundred = a / 100;
        int tenths = a / 10 % 10;
        int lastNumber = (a % 100) %10;
        if ((hundred == lastNumber) ||(hundred == tenths) || (tenths == lastNumber)){
            System.out.println("Есть совпадения в числах");
        }else  {
            System.out.println("Числа разные");
        }

    }

}
