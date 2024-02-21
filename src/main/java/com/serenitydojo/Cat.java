package com.serenitydojo;

public class Cat extends Pet {

    private String favoriteFood;
    public static final String CAT_NOISE = "Meow";

    public Cat(String name, String favoriteFood, int age) {
        super(name, age);
        this.favoriteFood = favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }


    public String getFavoriteFood() {
        return this.favoriteFood;
    }

    @Override
    public String makeNoise() { return CAT_NOISE; }
}

