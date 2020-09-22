package main.java;

public class Words {
    String s = "It is a String. I need to count the number of words in this sentence.";

    public static void countWords(String s) {
        String[] arr = s.split(" ");
        int cnt = arr.length;
        System.out.println("There are " + cnt + " words in this sentence.");
    }
}
