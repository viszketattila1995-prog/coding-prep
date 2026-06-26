package com.attila.taskmanager.strings;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("hello"));

    }

    public static boolean isPalindrome(String input) {

        String reversedInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            char current = input.charAt(i);
            reversedInput = reversedInput + current;
        }
        return input.equals(reversedInput);
    }
}
