package org.example.HW_18;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int size = 23;
        List<Integer> list = new ArrayList<>(size);

        // Заполняем список элементами через один, начиная с индекса 11
        for (int i = 0; i < size / 2; i++) {
            list.add(11 - i);
            list.add(11 + i + 1);
        }

        // Если размер списка нечетный, добавляем последний элемент на максимально удаленное место
        if (size % 2 != 0) {
            list.add(0);
        }

        System.out.println(list);

    }
}
