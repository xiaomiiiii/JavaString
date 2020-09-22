package com.javastring.maven;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LastLetterCountTest {

    @Test
    public void countAndSwitch() {
        String s = "It is a String. I need to count all words that end in s and y and to switch the first instance of word that ends in s and y";
        int[] result = LastLetterCount.countAndSwitch(s);
        Assert.assertEquals(9, result[0]);
        Assert.assertEquals(2, result[1]);
    }
}