package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class FelineParameterisedTest {

    private final int kittensCount;
    private final int expected;

    public FelineParameterisedTest(int kittensCount, int expected) {

        this.kittensCount = kittensCount;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                { 0, 0},
                { 1, 1},
                { 501, 501}
        };
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals(expected, actual);
    }
}