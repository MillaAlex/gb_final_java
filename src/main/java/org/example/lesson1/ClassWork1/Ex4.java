package org.example.lesson1.ClassWork1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println("task4(a, b) = " + task4(a, b));
        scanner.close();
    }

    /**
     * Given two binary strings a and b, return their sum as a binary string.
     * Example 1:
     * Input: a = "11", b = "1"
     * Output: "100"
     */
    private static String task4(String a, String b) {
        if (a.length() < b.length()) {
            return task4(a, b);
        }
        int carriage = 0;
        int j = b.length() - 1;
        String result = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (a.charAt(i) == '1') {
                carriage++;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                carriage++;
            }
        result = carriage % 2 + result;
        carriage /= 2;
        j--;

        }
        if (carriage > 0) {
            return  carriage % 2 + result;
        }
        return result;
    }
}
