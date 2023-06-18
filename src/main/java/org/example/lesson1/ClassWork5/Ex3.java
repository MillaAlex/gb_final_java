package org.example.lesson1.ClassWork5;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 6};
        System.out.println("chekArrayDuble(array) = " + chekArrayDuble(array));
    }

    /**
     * @apiNote 2)Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
     * В противном случае (false).
     * @param array входной массив
     * @return результат
     */
    private static boolean chekArrayDuble(int[] array) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (integerMap.containsKey(array[i])) {
                return true;
            } else {
                integerMap.put(array[i], 1);
            }
        }
        return false;
    }
}

/**
 * Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
 * В противном случае (false).
 */
