package solution.shop;

import solution.food.EngChips;
import solution.food.EngFish;
import solution.food.EngJumboSausage;
import solution.food.Food;

public class EngChippy extends Chippy {

    Food createFood(String type) {
        if (type.equals("fish")) {
            return new EngFish();
        } else if (type.equals("jumbo sausage")) {
            return new EngJumboSausage();
        } else if (type.equals("chips")) {
            return new EngChips();
        } else {
            System.out.println("item not on the menu");
            return null;
        }
    }
}
