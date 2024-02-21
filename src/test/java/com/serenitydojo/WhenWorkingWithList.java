package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Test;


import java.util.*;

public class WhenWorkingWithList {

    @Test
    public void tryWithArray() {
        String[] myColors = {"Red","Green","Blue","Yellow"};
        String[] myColors2 = new String[4];

        myColors2[0] = "Green 1";
        myColors2[1] = "Blue 2";
        myColors2[2] = "Yellow 2";
        myColors2[3] = "White 2";

        for (int i = 0; i < 4; i++) {
            System.out.println("My color " + i + " = " + myColors[i]);
            System.out.println("My color2 " + i + " = " + myColors2[i]);
        }

    }

    @Test
    public void tryWithList() {
        List<String> myColors = new ArrayList<>();
        List<Integer> ages = Arrays.asList(10, 20, 30);

        myColors.add("Green");
        myColors.add("Red");
        myColors.add("Yellow");
        myColors.add("Red");

        System.out.println("Size of the list = " + myColors.size());

        for(String someColor : myColors) {
            System.out.println("Color = " + someColor);
        }

        Assertions.assertThat(myColors).contains("Green", "Red");
        Assertions.assertThat(ages).contains(10,20,30);
    }

    @Test
    public void tryWithSet() {
        Set<String> myColors = new HashSet<>();

        myColors.add("Green");
        myColors.add("Red");
        myColors.add("Yellow");
        myColors.add("Red");

        System.out.println("Size of the set = " + myColors.size());

        for(String someColor : myColors) {
            System.out.println("Color = " + someColor);
        }

    }
}

