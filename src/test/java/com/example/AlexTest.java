package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class AlexTest {

    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {

        Alex alex = new Alex(feline, "Алекс");
        int actual = alex.getKittens();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void testGetFriends() throws Exception {

        Alex alex = new Alex(feline, "Алекс");
        List<String> actual = alex.getFriends();
        List<String> expected = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
        assertEquals(expected, actual);

    }

    @Test
    public void testGetPlaceOfLiving() throws Exception{

        Alex alex = new Alex(feline, "Алекс");
        String actual = alex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";
        assertEquals(expected, actual);

    }

}