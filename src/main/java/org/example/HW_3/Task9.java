package org.example.HW_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task9 {
    //- Разработать метод, который возвращает новый List, содержащий только уникальные
    // элементы из исходного списка строк.

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "java", "hello", "llama", "llama", "llama", "alpaca");
        System.out.println(getUnique(list));
    }

    public static Set<String> getUnique(List<String> str) {
        Set<String> set = new HashSet<>();
        for (String s :
                str) {
            if (s != null) {
            }
            set.add(s);
        }
        return set;
    }
}
