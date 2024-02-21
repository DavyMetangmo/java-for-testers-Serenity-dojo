package com.serenitydojo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {

    @Test
    public void creatingAMap() {
        Map<String, Integer> numberOfBallsByColor = new HashMap<>();

        numberOfBallsByColor.put("Red", 3);
        numberOfBallsByColor.put("Green", 2);
        numberOfBallsByColor.put("Yellow", 6);

        Integer numberOfRedBalls = numberOfBallsByColor.get("Red");

        System.out.println(numberOfRedBalls);
    }
}
