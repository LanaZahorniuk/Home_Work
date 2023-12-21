package org.example.HW_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task10 {
    //- Реализовать метод, который удаляет из List<String> те элементы, длина которых меньше заданного числа символов.

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "java", "hello", "llama", "llama", "llama", "alpaca",
                "Verkehrsordnungswidrigkeit", "Reisekrankenversicherung");
        System.out.println(deleteElement(list, 10));

    }

    public static List<String> deleteElement(List<String> str, int num) {
        List<String> stringList = new ArrayList<>();
        for (String s :
                str) {
            if (s != null && s.length() > num) {
                stringList.add(s);
            }
        }
        return stringList;
    }
}