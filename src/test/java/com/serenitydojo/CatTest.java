package com.serenitydojo;

import org.junit.Test;

public class CatTest {

    @Test
    public void creatingACat() {
        Cat felix = new Cat("Felix", "Tuna", 4);

        //felix.setName("Felix");
        //felix.setFavoriteFood("Tuna");
        //felix.setAge(4);

        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());
        System.out.println(felix.getAge());


        Cat kriki = new Cat("Kriki", "Fish", 8);
        System.out.println(kriki.getName());
        System.out.println(kriki.getFavoriteFood());
        System.out.println(kriki.getAge());

    }
}
