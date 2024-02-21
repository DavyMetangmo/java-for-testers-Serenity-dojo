package com.serenitydojo.model;

import static com.serenitydojo.model.FoodType.*;

public class Feeder {
    public FoodType feeds(AnimalType animal, boolean isPremium) {

//        String food;

//        switch (animal) {
//            case "Cat":
//                food = (isPremium) ? "Salmon" : "Tuna";
//                break;
//            case "Hamster":
//                food = (isPremium) ? "Lettuce" : "Cabbage";
//                break;
//            case "Dog":
//                food = (isPremium) ? "Deluxe Dog Food" : "Dog Food";
//                break;
//            default:
//                food = "Don't know the animal - don't know the food";
//        }
//        return food;

        switch (animal) {
            case CAT:
                return (isPremium) ? SALMON : TUNA;
            case HAMSTER:
                return (isPremium) ? LETTUCE : CABBAGE;
            case DOG:
                return (isPremium) ? DELUXE_DOG_FOOD : DOG_FOOD;
            default:
                return UNKNOWN;
        }

//        if (animal.equals("Cat")) {
////            if (isPremium) {
////                return "Salmon";
////            }
////            else {
////                return "Tuna";
////            }
//            return (isPremium) ? "Salmon" : "Tuna";
//        }
//        else if (animal.equals("Hamster")) {
//            return (isPremium) ? "Lettuce" : "Cabbage";
//        }
//        else {
//            return (isPremium) ? "Deluxe Dog Food" : "Dog Food";
//        }
    }
}
