package org.example.lesson1.HomeWork1st;

import java.util.Scanner;

/**
 *  *  Дана последовательность целых чисел, оканчивающаяся нулем.
 *  *  Найти сумму положительных чисел, после которых следует отрицательное число.
 *  * Пример ввода:
 *  * 1 2 1 2 -1 1 3 1 3 -1 0
 *  * Логика расчета:
 *  * 2 -1 переход -> 2 в сумму
 *  * 3 -1 переход -> 3 в сумму
 *  * Пример вывода: 5
 */

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        boolean flag = true;
        int sum = 0;
        if (a == 0) flag = false;
        if (flag) {
            while (a != 0) {
                int b = scanner.nextInt();
                if (a > 0 && b < 0) {
                    sum += a;
                }
                a = b;
            }
        }
        scanner.close();
        System.out.println("sum = " + sum);
    }
}
