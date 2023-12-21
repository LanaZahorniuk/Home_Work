package org.example.HW_3;

import java.util.*;

public class Task7 {
    //- Дан List 1,написать метод который создает List 2, содержащий только те числа из List 1, которые больше заданного значения.
        public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(100, 1, 4, 2, 3, 3, 5, 6, 8, 7, 9, 10, 12, 12));
        int limitNumber = 6;
        List<Integer> list2 = makeList(list1, limitNumber);
        System.out.println("Numbers more " + limitNumber + ":" + list2);
    }

    public static List<Integer> makeList(List<Integer> list, int limitNumber) {
        List<Integer> bigNumbers = new ArrayList<>();
        for (Integer num :
                list) {
            if (num > limitNumber) {
                bigNumbers.add(num);
            }
        }
        return bigNumbers;
    }
}

