package ru.jborn.core.chekurova.julia.lesson2;

import java.util.Scanner;

public class Task11 {
    //Напечатать таблицу умножения на число n (значение n вводится с клавиатуры; n от 1 до 9).
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter some namber :");
        int inp = in.nextInt();
        multiplicationTable(inp);
    }
    public static void multiplicationTable(int a){
        for (int b = 1; b <10 ; b++){
            int res = a * b;
            System.out.println(a + " * " + b + " = " + res);
        }
    }
}
