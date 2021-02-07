package ru.company.onetwo33.homework4lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 2. Напишите метод, который возвращает индекс первого вхождения данного целого числа в списке.
        ISearch search = (n, arr) -> {
            for (int index = 0; index < arr.length; index++) {
                if (arr[index].equals(n)) return index;
            }
            return -1;
        };

        // 3 Напишите метод, переворачивающий строку.
        IReverse reverse = (s) -> new StringBuilder(s).reverse().toString();

        // 4 Напишите метод, который возвращает наибольшее целое число в списке.
        IMaximum maximum = (arr) -> {
            int max = arr[0];
            for (Integer integer : arr) {
                if (integer > max) max = integer;
            }
            return max;
        };

        // 5. Напишите метод, который возвращает среднее значение из списка целых чисел.
        IAverage average = (list) -> {
            Double sum = 0D;
            for (Integer i : list) {
                sum += i;
            }
            return sum/list.size();
        };

        // 6. Имея список строк, напишите метод, который возвращает список всех строк, которые начинаются с буквы «а» (нижний регистр) и имеют ровно 3 буквы.
        ISearch3Letters strings = (list) -> {
            List<String> newList = new ArrayList<>();
            for (String s : list) {
                if (s.charAt(0) == 'a' && s.length() == 3) newList.add(s);
            }
            return newList;
        };

        System.out.println(search.search(3, new Integer[]{4, 6, 8, 33, 5, 3, 7, 8, 3}));
        System.out.println(reverse.reverese("java interview"));
        System.out.println(maximum.maximum(new Integer[]{4, 6, 8, 33, 5, 3, 7, 8, 3}));
        System.out.println(average.average(Arrays.asList(4, 6, 8, 33, 5, 3, 7, 8, 3)));
        System.out.println(strings.search(Arrays.asList("aoo", "awer", "work", "Aao", "aaA")));
    }
}