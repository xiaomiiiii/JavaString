package com.javastring.maven;

import java.util.HashSet;
import java.util.Set;

public class Consonants {
    public String s = "It is a String. I need to count all the consonants in this sentence.";

    public static int countConsonants(String s) {
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        String str = s.toLowerCase();
        String newS = s;
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (!vowels.contains(letter) && Character.isLetter(letter)) {
                newS = newS.replace(letter, '*');
                newS = newS.replace(Character.toUpperCase(letter), '*');
                cnt++;
            }
        }

        System.out.println("The String after replacement: " + s);
        System.out.println("There are " + cnt + " consonants in this sentence.");
        System.out.println("The new String is: " + newS);

        return cnt;
    }
}
