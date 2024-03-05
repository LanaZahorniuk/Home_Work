package org.example.HW_11;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi");


        /**
         * 1 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         * * //     * -- Отфильтровать на четные или не четные
         * * //     * -- Просуммировать все числа
         */

        Optional<Integer> even = numbers.stream()
                .filter(el -> el % 2 == 0)
                .reduce(Integer::sum);
        System.out.println(even.stream().toList());


        /** 2 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         * //
         * //     * -- Найти суммы чисел кратных 3 и 5
         */

        Stream<Integer> num = numbers.stream()
                .filter(el -> el % 3 == 0 && el % 5 == 0);
        System.out.println(num.toList());


        /** 3 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         *  * -- Получить среднее значение
         */
        double averageValue = numbers.stream()
                .collect(Collectors.averagingInt(el -> el));
        System.out.println(averageValue);

        /**
         * 4 List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
         * //     * -- Преобразовать список строк в список чисел
         */
        List<Integer> integerStream = strings.stream()
                .map(Integer::parseInt) //.map(el -> Integer.parseInt(el))
                .collect(Collectors.toList());

        System.out.println(integerStream);


        /** 5 List<String> words = Arrays.asList("apple", "banana", "apricot", "cherry", "kiwi")
         * //     * -- Отфильтровать строки на те которые начинаются на 'a' и преобразовать из в верхний регистр
         * //     * -- Получить список слов которые содержат только уникальные символы
         * */

        List<String> stringList = words.stream()
                .filter(el -> el.startsWith("a"))
                .map(String::toUpperCase) //.map(el->el.toUpperCase())
                .toList();
        System.out.println(stringList);


        List<String> uniqueList = words.stream()
                .filter(el -> el.chars().distinct().count() == el.length())
                .collect(Collectors.toList());
        System.out.println(uniqueList);
    }

    //Задание 1: Фильтрация списка целых чисел на нечетные числа
    private static void m1() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    }
}
