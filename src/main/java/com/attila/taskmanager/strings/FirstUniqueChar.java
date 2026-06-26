package com.attila.taskmanager.strings;

public class FirstUniqueChar {

    public static void main(String[] args) {

        System.out.println(firstUniqueChar("bbaa"));
        System.out.println(firstUniqueChar("banán"));

    }

    public static Character firstUniqueChar(String input) {

        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (countChar(input, x) == 1) {
                return x;
            }
        }
        return null;
    }

    public static int countChar(String word, char input) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == input) {
                sum++;
            }
        }
        return sum;
    }
}
