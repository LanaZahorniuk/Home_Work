package org.example.HW_3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
- Реализовать метод, который удаляет все вхождения заданной строки из List строк.
*/
public class Task5 {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("java","hello","llama","alpaca"));
        deleteString(stringList, "hello");
        System.out.println(Arrays.toString(stringList.toArray()));

    }

    public static void deleteString(List<String> stringList, String string){
        stringList.removeIf(str -> str.equals(string));
    }
}
