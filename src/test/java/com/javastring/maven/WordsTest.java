package com.javastring.maven;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordsTest {

    @Test
    public void countWords() {
        String s = "It is a String. I need to count the number of words in this sentence.";
        int result = Words.countWords(s);
        Assert.assertEquals(15, result);
    }
}