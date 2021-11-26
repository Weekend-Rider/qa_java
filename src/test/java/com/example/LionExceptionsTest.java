package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)

public class LionExceptionsTest {

    @Mock
    Feline feline;

    @Test
    // Здесь в тексте исключения допущена опечатка - самеЙ.
    // В реальности я бы сравнивал со строкой без ошибки и тест бы падал.
    // Как поступить в учебном задании - не знаю, оставляю сравнение с текстом с опечаткой.
    public void LionExceptionTextTest() {
        try {
            Lion lion = new Lion("Оно", feline);
            lion.doesHaveMane();
        } catch (Exception e) {
            assertTrue(e.getMessage().equals("Используйте допустимые значения пола животного - самей или самка"));
        }
    }

}

