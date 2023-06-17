/**
 *  Дана последовательность целых чисел, оканчивающаяся нулем.
 *  Найти сумму положительных чисел, после которых следует отрицательное число.
 * Пример ввода:
 * 1 2 1 2 -1 1 3 1 3 -1 0
 * Логика расчета:
 * 2 -1 переход -> 2 в сумму
 * 3 -1 переход -> 3 в сумму
 * Пример вывода: 5
 */

package org.example.lesson1.HomeWork1;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("HomeWork2(n, scanner) = " + hw2(n, scanner));
    }

    private static int hw2(int n, Scanner scanner) {
        int sum = 0;
        int a = 0, b = 0;
        a = scanner.nextInt();
        while (n != 0) {
            for (int i = 0; i < n; i++) {
                b = scanner.nextInt();
                if ((a > 0 && b < 0))
                    sum += a;
                a = b;
            }
        }
        scanner.close();
        return sum;
    }
}
