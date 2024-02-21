package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.AnimalType.*;
import static com.serenitydojo.model.FoodType.*;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatEatsTuna() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(CAT, false);
        Assert.assertEquals(TUNA,food);
        System.out.println(food);

    }

    @Test
    public void shouldHamsterEatsCabbage() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(HAMSTER, false);
        Assert.assertEquals(CABBAGE,food);
        System.out.println(food);

    }

    @Test
    public void shouldDogEatsDogFood() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(DOG, false);
        Assert.assertEquals(DOG_FOOD,food);
        System.out.println(food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(CAT, true);
        Assert.assertEquals(SALMON,food);
        System.out.println(food);
    }

    @Test
    public void shouldFeedPremiumDogsDeluxeDogFood() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(DOG, true);
        Assert.assertEquals(DELUXE_DOG_FOOD,food);
        System.out.println(food);
    }

    @Test
    public void shouldFeedPremiumHamsterLettuce() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(HAMSTER, true);
        Assert.assertEquals(LETTUCE,food);
        System.out.println(food);
    }

    @Test
    public void shouldReturnMessageForUnknowndAnimal(){
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(PIG, true);
        Assert.assertEquals(UNKNOWN,food);
        System.out.println(food);
    }
}
