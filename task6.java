package ru.jborn.core.chekurova.julia.lesson2;

public class Task6 {

    // Если целое число m делится нацело на целое число n, то вывести на экран частное от деления,
    // в противном случае вывести сообщение "m на n нацело не
    // делится".
    public static void main(String[] args) {
        int res;
        res =fissionResidue(12,5);
        divisionWhole(res);
    }
    private static int fissionResidue(int a, int b){
        if ( (a%b) != 0){
            return a%b;
        } else {
            return 0;
        }
    }
    private static void divisionWhole(int a){
        if (a == 0){
            System.out.println("m на n нацело не делится");
        } else {
            System.out.println("Частное от деления = " + a);
        }
    }
}
