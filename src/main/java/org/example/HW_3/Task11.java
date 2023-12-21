package org.example.HW_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task11 {
    //- Разработать метод, который создает List, содержащий первые уникальные элементы исходного List до первого повторения.

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,2,3,3,3,4,5,5);
        System.out.println(getUnique(list));
    }

    public static Set<Integer> getUnique(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for (Integer i :
                list) {
            set.add(i);
        }
        return set;
    }
}
