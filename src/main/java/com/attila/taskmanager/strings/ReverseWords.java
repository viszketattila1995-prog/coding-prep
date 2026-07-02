package com.attila.taskmanager.strings;

public class ReverseWords {

    public static void main(String[] args) {

        String sentence = "a gyors barna róka";

        System.out.println(reverseWords(sentence));

    }

    public static String reverseWords(String sentence) {

        String[] words = sentence.split("\\s+");

        StringBuilder returnedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            String x = words[i];

            returnedSentence.append(" ").append(x);
        }
        return returnedSentence.toString();
    }
}
