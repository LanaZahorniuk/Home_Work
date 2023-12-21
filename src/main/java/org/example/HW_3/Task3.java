package org.example.HW_3;

import java.util.*;

/*
- Дан массив/коллекция. Удалить все дубликаты из массива/коллекции.
*/
public class Task3 {
    public static void main(String[] args) {
        Integer[] array = {5, 5, 6, 7, 8, 8, 9, 10, 1, 1, 1, 2, 2, 3, 4, 5};
        System.out.println("массив: " + Arrays.toString(array));

        Map<Integer, Integer> count = new HashMap<>();
        Arrays.sort(array);

        for (Integer e :
                array) {
            count.put(e, count.getOrDefault(e, 0) + 1);
        }
        List<Integer> newList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e :
                count.entrySet()) {
            if (e.getValue() == 1) {
                newList.add(e.getKey());
            }
        }
        System.out.println("массив без дубликатов: ");
        for (Integer e :
                newList) {
            System.out.println(e);
        }
    }
}


