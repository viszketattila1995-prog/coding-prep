package com.attila.taskmanager.strings;

public class CountChar {

    public static void main(String[] args) {

        System.out.println(countChar("banán", 'n'));

        System.out.println(countChar("banán", 'b'));

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
