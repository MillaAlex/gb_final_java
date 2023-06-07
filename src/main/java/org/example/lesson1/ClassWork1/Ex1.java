/**
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 * Example 1:
Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
 */

package org.example.lesson1.ClassWork1;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("subtractProductAndSum = " + subtractProductAndSum(n));
        scanner.close();
    }

    /**
     * @param n заданное число
     * @return результат
     * @apiNote Заданное целое число возвращает разность между произведением его цифр на сумму его цифр. n
     */

    private static int subtractProductAndSum(int n) {
        int sum = 0, pr = 1;
        while (n != 0) {
            pr *= n % 10;
            sum += n % 10;
            n = n / 10;
        }
        return pr - sum;
    }
}