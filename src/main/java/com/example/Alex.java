package com.example;

import java.util.List;

public class Alex extends Lion {

    String name;

    public Alex(Feline feline, String name) throws Exception {

        super("Самец", feline);
        this.name = name;

    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
    };

    String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

}
