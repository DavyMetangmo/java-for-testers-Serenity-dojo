package com.serenitydojo;

public class Hamster extends Pet {
    private String favoriteGame;


    public Hamster() {

    }

    public Hamster(String name, String favoriteGame, int age) {
        super(name, age);
        this.favoriteGame = favoriteGame;
    }


    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }
}