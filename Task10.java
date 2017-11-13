package ru.jborn.core.chekurova.julia.lesson2;

import java.util.Scanner;

public class Task10 {

    //Составить программу, которая в зависимости от порядкового номера дня недели (1, 2, ..., 7)
    // выводит на экран его название (понедельник, вторник, ..., воскресенье).
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter some namber :");
        int inp = in.nextInt();
        switch (inp){
            case 1:
                System.out.println("Сегодня понедельник");
                break;
            case 2:
                System.out.println("Сегодня вторник");
                break;
            case 3:
                System.out.println("Сегодня среда");
                break;
            case 4:
                System.out.println("Сегодня четверг");
                break;
            case 5:
                System.out.println("Сегодня ппятница");
                break;
            case 6:
                System.out.println("Сегодня суббота");
                break;
            case 7:
                System.out.println("Сегодня воскресенье");
                break;
            default:
                System.out.println("Слишком большое число");

        }

    }
}
