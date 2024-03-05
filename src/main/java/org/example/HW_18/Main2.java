package org.example.HW_18;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

        public static void main(String[] args) {
            int size = 23;
            List<Integer> list = new ArrayList<>(size);

            // Находим середину списка
            int middleIndex = size / 2;

            // Если размер списка нечетный
            if (size % 2 != 0) {
                list.add(middleIndex); // Добавляем первый элемент в середину списка
            } else {
                list.add(middleIndex - 1); // Добавляем первый элемент между двумя центральными элементами
            }

            // Заполняем список элементами через один, начиная с первого элемента
            for (int i = 1; i < size; i++) {
                int nextIndex = (list.get(i - 1) + (size - 1)) % size; // Вычисляем индекс следующего элемента
                list.add(nextIndex);
            }

            System.out.println(list);
        }
    }

