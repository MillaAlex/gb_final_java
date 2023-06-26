package org.example.lesson1.HomeWork1st;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(Hw1(s));
        scanner.close();
    }

    /**
     *  @apiNote Given an input string s, reverse the order of the words.
     *  A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
     *  Return a string of the words in reverse order concatenated by a single space.
     *  Note that s may contain leading or trailing spaces or multiple spaces between two words.
     *  The returned string should only have a single space separating the words. Do not include any extra spaces.
     *  Input: s = "the sky is blue"
     *  Output: "blue is sky the"
     * @param s input line to be reversed
     * @return reversed line
     */
    private static String Hw1(String s) {
        String[] words = s.trim().split("\\s+");
        String reversed = "";
        for (int i = words.length - 1; i > 0; i--) {
            reversed += words[i] + " ";
        }
        return reversed + words[0];
    }
}