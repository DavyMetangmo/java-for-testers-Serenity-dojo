package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);

        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void when_a_dog_barks() {
        Dog fido = new Dog();
        String dogSound = fido.makeNoise();
        Assert.assertEquals(dogSound,"Woof");
    }

    @Test
    public void when_a_dog_gets_fed() {
        Dog fido = new Dog();
        fido.feed();
        Assert.assertTrue(fido.isFed());
    }
}
