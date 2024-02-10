package com.serenitydojo;

public class Cat extends Pet {

    private String favoriteFood;

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

}

