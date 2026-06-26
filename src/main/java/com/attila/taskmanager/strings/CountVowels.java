package com.attila.taskmanager.strings;

public class CountVowels {

    public static void main(String[] args) {
        System.out.println(countVowelTwo("hello"));
    }

    public static int countVowel(String input) {

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == 'a' || current == 'á' || current == 'e' || current == 'u' || current == 'i' ||
                    current == 'o' || current == 'ő' || current == 'ú' || current == 'é' || current == 'ű' ||
                    current == 'í' || current == 'A' || current == 'Á' || current == 'E' || current == 'U' || current == 'I' ||
                    current == 'O' || current == 'Ö' || current == 'Ú' || current == 'É' || current == 'Ű' ||
                    current == 'Í' || current == 'ó' || current == 'Ó' || current == 'ö' || current == 'Ő') {
                count++;
            }
        }
        return count;
    }

    public static int countVowelTwo(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (vowels.indexOf(current) != -1) {
                count++;
            }
        }
        return count;
    }

}
