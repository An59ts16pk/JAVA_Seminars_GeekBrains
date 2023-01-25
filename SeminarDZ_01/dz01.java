package SeminarDZ_01;

// Задача 1. Написать программу вычисления n-ого треугольного числа.
// n-ое треугольное число - это сумма n первых натуральных чисел,
// T(n) = 1/2 * n * (n + 1) - формула для n-ого треугольного числа. 

import java.util.Scanner;

public class dz01 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Программа вычисления n-ого треугольного числа.");
        
        int number = getNumberByUser("\nВведите число для n-ого треугольного числа: ");
        int result = trigonalNumber(number);
        System.out.println(printResult(result));

    }

    // Ввод числа
    static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    // Вычисление n-ого треугольного числа
    static int trigonalNumber(int num) {
        int res = (num * (num + 1)) / 2;
        return res;
    }

    // Печать результата
    static String printResult(int num) {
        String output = "    Треугольное число: ";
        String res = String.format("%s %d\n", output, num);
        return res;
    }
}
