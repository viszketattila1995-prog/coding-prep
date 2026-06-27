package com.attila.taskmanager.strings;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

    public static void main(String[] args) {

        System.out.println(charFreq("banana"));

        System.out.println(charFreqTwo("banana"));

    }

    public static Map<Character, Integer> charFreq(String input) {
        Map<Character, Integer> charFrq = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            if (!charFrq.containsKey(current)) {
                charFrq.put(current, 1);
            } else {
                charFrq.put(current, charFrq.get(current) + 1);
            }
        }
        return charFrq;
    }

    public static Map<Character, Integer> charFreqTwo(String input) {
        Map<Character, Integer> charFrq = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);

            charFrq.put(current, charFrq.getOrDefault(current, 0) + 1);
        }
        return charFrq;
    }
}
