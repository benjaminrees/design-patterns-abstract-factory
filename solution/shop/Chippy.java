package solution.shop;

import solution.food.Chips;

public abstract class Chippy {

    abstract Chips createFood(String type);

    public Chips orderFood(String type) {
        Chips food = createFood(type);
        if (food == null) {
            return null;
        }
        System.out.println("##########");
        System.out.println("Beginning new order");

        food.cook();
        return food;
    }
}
