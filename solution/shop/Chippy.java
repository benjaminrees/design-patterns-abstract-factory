package solution.shop;

import solution.food.Supper;

public abstract class Chippy {
  // this is the factory

    public abstract Supper createFood(String type);

    public Supper orderFood(String type) {
        Supper food = createFood(type);
        if (food == null) {
            return null;
        }
        System.out.println("##########");
        System.out.println("Beginning new order");
        food.prepare();

        return food;
    }
}
