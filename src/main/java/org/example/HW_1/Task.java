package org.example.HW_1;

import java.util.Arrays;

public class Task {

        public static void main(String[] args) {
            int [] array = {1,23,-4,56,7,89};
            System.out.println("массив " + Arrays.toString(array));
            showArray(array);
            System.out.println("обратный порядок " + Arrays.toString(array));

        }

        // Инвертировать массив, то есть изменить порядок элементов в массиве на обратный.
        public static void showArray (int [] arr) {
            int ar;
            for (int i = 0; i < arr.length/2; i++) {
                ar = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = ar;
            }
        }

        // Поиск третьего по величине числа в массиве
        public static void getThird (int[] arr) {
            int num1;
            int num2;
            for (int i = 0; i < arr.length; i++) {
                num1 = arr[i];
                if (arr[i]>num1) {
                    num2 = arr[i];
                }
            }
        }
    }

