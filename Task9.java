package ru.jborn.core.chekurova.julia.lesson2;

public class Task9 {
    // Дано вещественное число x. Вычислить f (x)
    public static void main(String[] args) {
        System.out.println(computation(1.1));
        System.out.println(computation(-1.1));
        System.out.println(computation(0.3));

    }
    public static double computation(double a){
        if (a <= 0){
            return 0;
        } else if ( a > 0 && a<= 1){
            return a;
        }else {
            return Math.pow(a,2);
        }
    }
}
