package com.javastring.maven;

public class Palindrome {
    String s = "Was is a car or a cat I saw?";

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^0-9|a-z]", "");

        StringBuilder sb = new StringBuilder("");
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        String newS = sb.toString();

        if (s.equals(newS)) {
            System.out.println("This String is a palindrome.");
            return true;
        } else {
            System.out.println("This String is NOT a palindrome.");
            return false;
        }
    }
}
