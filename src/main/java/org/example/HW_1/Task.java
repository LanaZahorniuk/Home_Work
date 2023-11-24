package org.example.HW_1;

import java.util.Arrays;

public class Task {

    public static void main(String[] args) {
        int[] array = {1, 23, -4, 56, 7, 89};
        System.out.println("массив " + Arrays.toString(array));
        showArray(array);
        System.out.println("обратный порядок " + Arrays.toString(array));
        getThird(array);
    }

    // Инвертировать массив, то есть изменить порядок элементов в массиве на обратный.
    public static void showArray(int[] arr) {
        int ar;
        for (int i = 0; i < arr.length / 2; i++) {
            ar = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = ar;
        }
    }

    // Поиск третьего по величине числа в массиве
    public static void getThird(int[] arr) {
        Arrays.sort(arr);
        System.out.println("третье по величине число в массиве: " + arr[2]);
    }
}

