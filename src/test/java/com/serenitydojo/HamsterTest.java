package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class HamsterTest {

    @Test
    public void creating_a_hamster() {
        Hamster rusty = new Hamster("Rusty", "Wheel", 3);

        Assert.assertEquals("Rusty", rusty.getName());
        Assert.assertEquals("Wheel", rusty.getFavoriteGame());
        Assert.assertEquals(3, rusty.getAge());
    }


    @Test
    public void when_a_hamster_makes_noise() {
        Pet rusty = new Hamster("Rusty","wheels",5);
        Assert.assertEquals(rusty.makeNoise(),"Squeek");
    }
}

