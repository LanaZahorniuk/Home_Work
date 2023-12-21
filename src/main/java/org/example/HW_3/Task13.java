package org.example.HW_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task13 {
    //- Создать метод, который вычисляет среднее значение, медиану и стандартное отклонение для списка целых чисел.

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 10, 20, 15, 122);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 10, 20, 15);
        System.out.println("среднее значение = " + getAverageValue(list));

        System.out.println("медиана нечетного листа: " + getMedian(list));
        System.out.println("медиана четного листа: " + getMedian(list2));

        System.out.println("стандартное отклонение = " + getStandardDeviation(list2));
    }

    public static double getAverageValue(List<Integer> list) {
        double sum = 0;
        for (Integer i :
                list) {
            sum += i;
        }
        return sum / list.size();
    }

    public static double getMedian(List<Integer> list) {
        Collections.sort(list);
        int size = list.size();

        if (size % 2 == 1) { // нечетное
            return list.get(size / 2);
        } else {
            int center = size / 2; // четное
            return 0.5 * (list.get(center - 1) + list.get(center));
        }
    }

    public static double getStandardDeviation(List<Integer> list) {

        double averageValue = getAverageValue(list); //среднее значение
        double difference = 0;
        for (Integer i :
                list) {
            difference += Math.pow(i - averageValue, 2); // сумма квадратов разницы эл.и ср.значения
        }
        double result = difference / (list.size() - 1);
        return Math.sqrt(result); //извлечь корень
    }
}
