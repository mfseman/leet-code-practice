package com.company.src.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FruitShuffler {

    // Dynatrace Question 2 - Shuffle a list and make sure there are no repeating values
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Banana");
        fruits.add("Pineapple");
        System.out.println(fruits);

        // Easy way with Collections library
        Collections.shuffle(fruits);
        System.out.println(fruits);

        Random r = new Random();
        for (int i = 0; i < fruits.size(); i++) {
            // Gives random number between 0-4
            int randomNumber = r.nextInt(fruits.size());
            // Gets Fruit from the index from random
            String fruitHolder = fruits.get(randomNumber);
            // Gets the Fruit which index is about to be replaced
            String forgottenFruit = fruits.get(i);
            // Sets the index to the fruit that was taken
            fruits.set(i, fruitHolder);
            // Swap the value that was overridden by the fruit that was replaced
            fruits.set(randomNumber, forgottenFruit);
        }
        System.out.println(fruits);
    }
}