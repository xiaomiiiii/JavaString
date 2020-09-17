public class Main {

    public static void main(String[] args) {
        // Q1. Count vowels
        String s1 = "It is a String. I need to count all the vowels in this sentence.";
        Vowels.countVowels(s1);

        // Q2. Check Palindrome
        String s2 = "Was it a car or a cat I saw?";
        Palindrome.isPalindrome(s2);

        // Q3. Count words
        String s3 = "It is a String. I need to count the number of words in this sentence.";
        Words.countWords(s3);

        // Q4. Count consonants and do replacement
        String s4 = "It is a String. I need to count all the consonants in this sentence.";
        Consonants.countConsonants(s4);

        // Q5. LastLetterCount
        String s5 = "It is a String. I need to count all words that end in s and y and to switch the first instance of word that ends in s and y";
        LastLetterCount.countAndSwitch(s5);
    }
}
