package org.example.HW_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// - Написать метод, который преобразует List<String> в List<Integer>, представляющих длину каждой строки.
public class Task8 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "hello", "Verkehrsordnungswidrigkeit", "Reisekrankenversicherung");
        List<Integer> list2 = fromStringToInteger(list);
        System.out.println(list2);
    }

    public static List<Integer> fromStringToInteger(List<String> string) {
        List<Integer> integerList = new ArrayList<>();
        for (String str :
                string) {
            if (str != null) {
                integerList.add(str.length());
            }
        }
        return integerList;
    }
}
