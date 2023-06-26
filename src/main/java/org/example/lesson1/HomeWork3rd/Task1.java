package org.example.lesson1.HomeWork3rd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Подсчитать количество искомого слова, через map (наполнением значение, где
 * искомое слово будет являться ключом), вносить все слова не нужно
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * Запрос: Россия
 * Ответ: Россия - 2
 * toLoverCase().
 */

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> countWords = new HashMap<>();
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        str = str.replaceAll(".", " ");
        String[] words = str.split(" ");

        Scanner scanner = new Scanner(System.in);
        String findWord = scanner.nextLine().toLowerCase();
        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        for (String word : words) {
            if (word.toLowerCase().equals(findWord)) {
                if (word.contains(findWord)) {
                    countWords.put(word, countWords.get(findWord) + 1);
                } else {
                    countWords.put(findWord, 1);
                }
            }
        }
        System.out.print(countWords);
    }
}
