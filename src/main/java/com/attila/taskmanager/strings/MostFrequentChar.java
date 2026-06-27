package com.attila.taskmanager.strings;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentChar {

    public static void main(String[] args) {

        System.out.println(mostFrqChar("pineaple"));

    }

    public static Character mostFrqChar(String string) {
        Map<Character, Integer> charFrq = new HashMap<>();

        char mostFrq = 'a';

        int currentInt = 0;

        for (int i = 0; i < string.length(); i++) {
            char current = string.charAt(i);

            charFrq.put(current, charFrq.getOrDefault(current, 0) + 1 );
        }

        for (Map.Entry<Character, Integer> entry : charFrq.entrySet()) {

            if (entry.getValue() > currentInt) {
                currentInt = entry.getValue();
                mostFrq = entry.getKey();
            }

        }
        return mostFrq;
    }
}
