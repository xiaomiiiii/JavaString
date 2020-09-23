package com.javastring.maven;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void isPalindrome() {
        String s = "Was it a car or a cat I saw?";
        boolean result = Palindrome.isPalindrome(s);
        Assert.assertEquals(true, result);
    }
}