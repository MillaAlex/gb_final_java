package org.example.lesson1.ClassWork4;

import java.util.LinkedList;
import java.util.Scanner;

import static org.example.lesson1.ClassWork4.Ex3.createList;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> linkedList = createList(n);
        System.out.println("linkedList = " + linkedList);

        zadanie3(linkedList);
    }

    private static void zadanie3(LinkedList<Integer> linkedList) {
        int sum = 0;
        for (Integer el : linkedList) {
            if (el % 2 != 0) {
                sum += el;
            }
        }
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i) % 3 != 0) {
                linkedList.set(i, sum);
            }
        }
        System.out.println("linkedList = " + linkedList);
    }
}

/**
        Заменить некратные 3 элементы списка, суммой нечетных элементов.
*/