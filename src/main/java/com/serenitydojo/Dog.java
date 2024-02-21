package com.serenitydojo;

public class Dog extends Pet {
    private String favoriteToy;
    private boolean isFed;

    private static final String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        super(name, age);
        this.favoriteToy = favoriteToy;
    }

    public Dog() {

    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    @Override
    public String makeNoise() {return DOG_NOISE;}

    public void feed() {
        this.isFed = true;
    }


    public boolean isFed() {
        return isFed;
    }

    public void setFed(boolean fed) {
        isFed = fed;
    }
}
