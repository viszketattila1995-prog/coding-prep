package com.attila.taskmanager.strings;

public class LongestWord {

    public static void main(String[] args) {

        String sentence = "a gyors barna róka átugrik";

        System.out.println(longestWord(sentence));

    }

    public static String longestWord(String sentence) {

        String[] words = sentence.split("\\s+");

        String word = "";

        for (String w : words) {
            if (w.length() > word.length()) {
                word = w;
            }
        }
        return word;
    }

}
