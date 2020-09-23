package com.javastring.maven;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsTest {

    @Test
    public void countVowels() {
        String s = "It is a String. I need to count all the vowels in this sentence.";
        int result = Vowels.countVowels(s);
        Assert.assertEquals(19, result);

    }
}