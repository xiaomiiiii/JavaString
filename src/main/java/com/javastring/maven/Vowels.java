package com.javastring.maven;

import java.util.HashSet;
import java.util.Set;

public class Vowels {
    public String s = "It is a String. I need to count all the vowels in this sentence.";

    public static int countVowels(String s) {
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        s = s.toLowerCase();
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                cnt++;
            }
        }

        System.out.println("There are " + cnt + " vowels in this sentence.");
        return cnt;
    }
}
