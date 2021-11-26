package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class LionParameterisedTest {

    @Before
    public void init() {
       MockitoAnnotations.openMocks(this);
    }

    @Mock
    Feline feline;

    private final String sex;
    private final boolean expected;

    public LionParameterisedTest(String sex, boolean expected) {

        this.sex = sex;
        this.expected = expected;

    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}

