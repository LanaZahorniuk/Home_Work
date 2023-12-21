package org.example.HW_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
    //- Составить метод, который объединяет все строки из List в одну большую строку.
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("java", "hello", "llama", "alpaca"));
        System.out.println("все строки из List: " + Arrays.toString(stringList.toArray()));
        String longString = getOneBigString(stringList);
        System.out.println("List в одну большую строку: " + longString);
    }

    public static String getOneBigString(List<String> s) {
        return String.join("", s);
    }
}
