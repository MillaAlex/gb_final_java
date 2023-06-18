package org.example.lesson1.ClassWork4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, -3, -2, -1, 4, 5, -6, 7));
        System.out.println("linkedList = " + linkedList);

        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) < 0) {
                linkedList.remove(i);
            }
        }
        System.out.println("linkedList = " + linkedList);
    }
        private static LinkedList<Integer> createList(int n) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                linkedList.add(random.nextInt(10));
            }
            return linkedList;
        }
}

/**
 * Построить однонаправленный список целых чисел. Удалить отрицательные элементы списка.
 */