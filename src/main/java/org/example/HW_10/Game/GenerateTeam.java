package org.example.HW_10.Game;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class GenerateTeam {
    private static final Faker FAKER = new Faker();

    public static <T> T makerTeam(Participant participant) {
        List<T> teamAdult = new ArrayList<>();
        //List<Teenager> teamTeenager = new ArrayList<>();
        //List<Pupil> teamPupil = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            teamAdult.add((T) (teamAdult + FAKER.team().name()));
        }
        return (T) teamAdult;
    }

    public static void main(String[] args) {
       // System.out.println(makerTeam(Adult));
    }
}




/*
List<String> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add("L: " + FAKER.name().name());
        }
 */