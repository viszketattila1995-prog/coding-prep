package com.attila.taskmanager.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("listen", "silent"));   // true
        System.out.println(isAnagram("hello", "world"));      // false
        System.out.println(isAnagram2("listen", "silent"));   // true

    }

    public static boolean isAnagram(String string1, String string2) {

        Map<Character, Integer> word1 = new HashMap<>();
        Map<Character, Integer> word2 = new HashMap<>();

        for (int i = 0; i <string1.length(); i++) {
            char current = string1.charAt(i);

            word1.put(current, word1.getOrDefault(current, 0) + 1);
        }

        for (int i = 0; i <string2.length(); i++) {
            char current = string2.charAt(i);

            word2.put(current, word2.getOrDefault(current, 0) + 1);
        }
        return word1.equals(word2);
    }

    public static boolean isAnagram2(String string1, String string2) {

        char[] a = string1.toCharArray();
        char[] b = string2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
