package com.example.examstuff;

import java.util.Arrays;

public class testFood {

    public static void main(String[] args) {
        JFood foodOne = new JFood();
        JFood foodTwo = new JFood(6, "Mac 'n' Cheese", 1, 125,
                new String[]{"Noodles", "Cheese", "Butter", "Milk"});
        JFood foodThree;

        if (foodOne.compareTo(foodTwo) == 1) {
            System.out.println(String.format("The food with the least calories is \n id: %d \n Name: %s \n Calories: %f \n Ingredients: ",
                    foodOne.getmQuantity(), foodOne.getmName(), foodOne.getmCalories()) + Arrays.toString(foodOne.getmIngredients()));
            foodThree = foodOne.clone();
        }
        else {
            System.out.println(String.format("The food with the least calories is \n id: %d \n Name: %s \n Calories: %f \n Ingredients: ",
                    foodTwo.getmQuantity(), foodTwo.getmName(), foodTwo.getmCalories()) + Arrays.toString(foodTwo.getmIngredients()));
            foodThree = foodTwo.clone();
        }

        foodThree.setFood(5, 300, new String[]{"Water"});
        System.out.println(String.format("New Food \n id: %d \n Name: %s \n Calories: %f \n Ingredients: ",
                foodThree.getmQuantity(), foodThree.getmName(), foodThree.getmCalories()) + Arrays.toString(foodThree.getmIngredients()));

    }

}
