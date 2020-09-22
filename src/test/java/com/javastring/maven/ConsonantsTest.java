package com.javastring.maven;

import org.junit.Assert;
import org.junit.Test;

public class ConsonantsTest {

    @Test
    public void countConsonants() {
        String s = "It is a String.";
        int numOfConsonants = Consonants.countConsonants(s);
        Assert.assertEquals(7, numOfConsonants);
    }
}