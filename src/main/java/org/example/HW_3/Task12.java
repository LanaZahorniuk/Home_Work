package org.example.HW_3;

import java.util.*;

public class Task12 {
    //- Разработать метод, который объединяет строки из List в одну строку, разделяя их запятой

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("java", "hello", "llama", "alpaca"));
        System.out.println(getOneString(stringList));
    }

    public static List<String> getOneString(List<String> strings) {
        StringJoiner joiner = new StringJoiner(", ");
        for (String s :
                strings) {
            joiner.add(s);
        }
        return Collections.singletonList(joiner.toString());
    }
}
