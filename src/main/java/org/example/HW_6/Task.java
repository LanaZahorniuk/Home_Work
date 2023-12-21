package org.example.HW_6;

import java.util.HashMap;
import java.util.Map;

public class Task {


    public static void main(String[] args) {
        Map<String, Integer> nameAge = new HashMap<>();

        nameAge.put("Lana", 34);
        nameAge.put("Tom", 24);
        nameAge.put("Jana", 12);

        doubleAge(nameAge);

        Map<Integer, String> user = new HashMap<>();
        user.put(99, "Lana");
        user.put(101, "Tom");
        user.put(105, "Jana");


    }

    /*
    **Создайте HashMap<String, Integer>, заполните его парами
"имя-возраст". Используйте цикл for-each для удвоения возраста каждого человека.
     */

    public static void doubleAge(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> age : map.entrySet()) {
            System.out.println(age.getValue() * 2);
        }}
    }


     /*
    ***Создайте HashMap<Integer, String>, представляющий
"ID-имя пользователя". Используйте цикл для фильтрации
пользователей с ID больше 100 и копируйте их в TreeMap.


    public static void filterId(Map<Integer, String> map) {
        Map<Integer, String> treeMap = new TreeMap<>();

        for (Integer fl : map.keySet()) {
            int k = treeMap.keySet();
            if (fl > 100) {
                treeMap.put(fl);
            }
        }
    }
}
*/
/*
это второе задание:
public static void filterId(Map<Integer, String> map) {
        Map<Integer, String> treeMap = new TreeMap<>();
        for (Map.Entry<Integer, String> map1 : map.entrySet()) {
            if(map1.getKey() > 100){
                treeMap.put(map1.getKey(), map1.getValue());
            }
        }
        System.out.println(treeMap);
    }



это 3 задание:
package _06_12_2023;

import java.util.Objects;

class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return age == user.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.name.compareTo(o.name);
    }
}

Map<User, String> userStringMap = new TreeMap<>();
        userStringMap.put(new User("Sava", 23), "S");
        userStringMap.put(new User("Lana", 18), "L");
        System.out.println(userStringMap);
 */