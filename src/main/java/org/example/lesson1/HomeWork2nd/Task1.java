package org.example.lesson1.HomeWork2nd;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("task1(n, scanner) = " + task1(n, scanner));
    }
    /**
     * @apiNote Дана последовательность N целых чисел. Найти сумму простых чисел.
     * @param n длинна последовательности
     * @param scanner вспомогательный класс
     * @return сумму простых чисел
     */
    private static int task1(int n, Scanner scanner) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int n1 = scanner.nextInt();
            boolean isSimple = true;
            for (int j = 2; j <= n1 / 2; j++) {
                if (n1 > 1 && n1 % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                sum += n1;
                count++;
            }
        }
        return sum;
    }
}
