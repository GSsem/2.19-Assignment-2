package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        // Вывести на консоль переменные, значения которых делятся на 5
        StringBuilder result = new StringBuilder();
        result.append(a % 5 == 0 ? "a=" + a + "\n" : "")
                .append(b % 5 == 0 ? "b=" + b + "\n" : "")
                .append(c % 5 == 0 ? "c=" + c + "\n" : "");

        System.out.println(result.isEmpty() ? "нет значений, кратных 5" : result);

        if(b != 0){
            // Вывести на консоль значение от целочисленного деления a на b (результат - целое число)
            System.out.printf("Результат целочисленного деления a на b: %d\n", a / b);

            // Вывести на консоль значение от деления a на b (результат - число с плавающей запятой)
            System.out.printf("Результат деления a на b: %f\n", (double) a / b);

            // Вывести на консоль значение от деления a на b, округленного до ближайшего целого в большую сторону
            System.out.printf("Результат деления a на b с округлением в большую сторону: %d\n", (int) Math.ceil(a * 1D / b));

            // Вывести на консоль значение от деления a на b, округленного до ближайшего целого в меньшую сторону
            System.out.printf("Результат деления a на b с округлением в меньшую сторону: %d\n", (int) Math.floor(a * 1D / b));

            // Вывести на консоль значение от деления a на b, округленного до ближайшего целого математическим округлением
            System.out.printf("Результат деления a на b с математическим округлением: %d\n", Math.round(a * 1D / b));
        }
        if(c != 0){
            // Вывести на консоль остаток от деления b на c
            System.out.printf("Остаток от деления b на c: %d\n", b % c);
        }
        // Вывести на консоль наименьшее значение из a и b
        System.out.printf("Наименьшее значение из a и b: %d\n", Math.min(a, b));

        // Вывести на консоль наибольшее значение из b и c
        System.out.printf("Наибольшее значение из b и c: %d\n", Math.max(b,c));
    }
}