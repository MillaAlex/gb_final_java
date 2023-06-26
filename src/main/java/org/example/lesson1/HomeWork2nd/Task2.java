package org.example.lesson1.HomeWork2nd;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("The sequence is increasing: " + task2(n, scanner));
    }
    /**
     * @apiNote Дана последовательность из N целых чисел. Верно ли, что последовательность
     * является возрастающей.
     * @param n длинна последовательности
     * @param scanner вспомогательный класс
     * @return true / false
     */
    private static boolean task2(int n, Scanner scanner) {
        int n1 = scanner.nextInt();
        int count = 0;
        boolean increasing = true;
        for (int i = 0; i < n - 1; i++) {
            int n2 = scanner.nextInt();
            if (n1 >= n2) {
                increasing = false;
            }
        }
        return increasing;
    }
}
