package ru.company.onetwo33.homework3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        String[] words = {"cat", "dog", "tiger", "bear", "pig", "cat", "dog", "cow", "bull", "horse"};
        Map<String, Integer> map = new HashMap<>();

        for (String wordOut : words) {
            int count = 0;
            for (String wordIn : words) {
                if (wordOut.equals(wordIn)) count++;
            }
            map.put(wordOut, count);
        }

        map.forEach((s, integer) -> System.out.println(s + ":" + integer));

        // Задание 2
        Phonebook book = new Phonebook();
        book.add("Aleksey", "+7(999)999-99-99");
        book.add("Arseniy", "+7(999)888-88-88");
        book.add("Aleksey", "+7(999)777-77-77");

        book.get("Aleksey");
        book.get("Arseniy");
    }
}
