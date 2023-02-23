package solution.shop;

import solution.food.Food;

public abstract class Chippy {

    abstract Food createFood(String type);

    public Food orderFood(String type) {
        Food food = createFood(type);
        if (food == null) {
            return null;
        }
        System.out.println("##########");
        System.out.println("Beginning new order");

        food.cook();
        return food;
    }
}
