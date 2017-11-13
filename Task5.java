package ru.jborn.core.chekurova.julia.lesson2;

public class Task5 {
    // Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?
    public static void main(String[] args) {
        System.out.println(whoBigger(25,15));
        System.out.println(whoBigger(9,115));
    }

    private static String whoBigger(double x, double y){
        if (areaCircle(x) > areaSquare(y)){
            return "the Circle is big";
        } else {
            return "the Square is big";
        }
    }

    private static double areaCircle(double a){
        return Math.PI * Math.pow(a,2);
    }
    private static double areaSquare(double b){
        return Math.pow(b,2);
    }


}
