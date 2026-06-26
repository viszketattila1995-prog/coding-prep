package com.attila.taskmanager.strings;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }

    public static String reverse(String input) {

        String reverse = "";

        for (int i = input.length()-1; i >= 0; i--) {
            char current = input.charAt(i);
            reverse = reverse + current;
        }
        return reverse;
    }
}
