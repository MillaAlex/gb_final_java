package org.example.lesson1.ClassWork5;

import java.util.HashMap;
import java.util.Map;

public class Ex4 {
    public static void main(String[] args) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        characterIntegerMap.put('I', 1);
        characterIntegerMap.put('V', 5);
        characterIntegerMap.put('X', 10);
        characterIntegerMap.put('L', 50);
        characterIntegerMap.put('C', 100);
        characterIntegerMap.put('D', 500);
        characterIntegerMap.put('M', 1000);
        String str = "MCMXCIV";
        System.out.println("translate(characterIntegerMap, str) = " + translate(characterIntegerMap, str));
    }

    /**
     * @apiNote Записать перевод из римских цифр в арабские.
     * @param characterIntegerMap массив сопоставлений
     * @param str входная римская цифрв
     * @return арабская цифра
     */
    private static int translate(Map<Character, Integer> characterIntegerMap, String str) {
        int result = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (characterIntegerMap.containsKey(str.charAt(i))){
                if (characterIntegerMap.get(str.charAt(i)) < characterIntegerMap.get(str.charAt(i + 1))){
                    result += characterIntegerMap.get(str.charAt(i + 1)) - characterIntegerMap.get(str.charAt(i));
                    if (i + 2 < str.length()) {
                        i++;
                    }
                } else {
                    result += characterIntegerMap.get(str.charAt(i));
                }
            }
        }
        return result;
    }
}

/**
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
