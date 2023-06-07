package org.example.lesson1.HomeWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hw2 {

    private static Integer[] append(Integer[] arr, int element)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);

        return list.toArray(new Integer[0]);
    }

    public static void main(String[] args)
    {
        Integer[] numbers = { 1, -2, 35, -4, 1,2 };
        Integer[] newList = {};
        for (int i = 1; i < numbers.length; i++)
        {
            if ((numbers[i] > 0) && ((numbers[i] % 1 == 0)));
            {
                newList.append(numbers[i-1]);
            }
        }
        for (int i = 0; i < newList.length; i++)
        {
            int sum = 0;
            sum +=  newList[i];
            System.out.print(sum);
        }
    }
}

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