package org.example.HW_3;

import java.util.*;

/*
- Дан массив/коллекция целых чисел. Необходимо переставить элементы массив/коллекции в обратном порядке.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 4, 2, 3, 5, 6, 8, 7, 9, 10};
        reverseArray(array);

        System.out.println("--------------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 2, 3, 5, 6, 8, 7, 9, 10));
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void reverseArray(int[] arr) {
        int a;
        for (int i = 0; i < arr.length / 2; i++) {
            a = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }
}

