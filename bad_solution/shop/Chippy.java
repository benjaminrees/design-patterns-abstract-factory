package bad_solution.shop;

import bad_solution.food.EdiChips;
import bad_solution.food.EdiFish;
import bad_solution.food.EdiJumboSausage;
import bad_solution.food.EdiMarsBar;
import bad_solution.food.EngChips;
import bad_solution.food.EngFish;
import bad_solution.food.EngJumboSausage;
import bad_solution.food.Food;

public class Chippy {

    public Food orderFood(String location, String type) {
        Food food;
        System.out.println("##########");
        System.out.println("Beginning new order");

        if (location.equals("edinburgh")) {
            if (type.equals("fish")) {
                food = new EdiFish();
            } else if (type.equals("jumbo sausage")) {
                food = new EdiJumboSausage();
            } else if (type.equals("chips")) {
                food = new EdiChips();
            } else if (type.equals("mars bar")) {
                food = new EdiMarsBar();
            } else {
                System.out.println("item not on the menu");
                return null;
            }
        } else if (location.equals("england")) {
            if (type.equals("fish")) {
                food = new EngFish();
            } else if (type.equals("jumbo sausage")) {
                food = new EngJumboSausage();
            } else if (type.equals("chips")) {
                food = new EngChips();
            } else {
                System.out.println("item not on the menu");
                return null;
            }
        } else {
            return null;
        }

        food.cook();
        return food;
    }
}
