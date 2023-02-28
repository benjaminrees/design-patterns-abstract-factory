package abstractSolution.shop;

import abstractSolution.food.Chips;
import abstractSolution.food.Fish;

public abstract class Chippy {

    abstract Chips createChips(String type);

    abstract Fish createFish(String type);

    // public Chips orderFood(String type) {
    //     Chips food = createFood(type);
    //     if (food == null) {
    //         return null;
    //     }
    //     System.out.println("##########");
    //     System.out.println("Beginning new order");

    //     food.cook();
    //     return food;
    // }
}
