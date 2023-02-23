package solution.shop;

import solution.food.EdiChips;
import solution.food.EdiFish;
import solution.food.EdiJumboSausage;
import solution.food.EdiMarsBar;
import solution.food.Food;

public class EdiChippy extends Chippy {

    Food createFood(String type) {
        if (type.equals("fish")) {
            return new EdiFish();
        } else if (type.equals("jumbo sausage")) {
            return new EdiJumboSausage();
        } else if (type.equals("chips")) {
            return new EdiChips();
        } else if (type.equals("mars bar")) {
            return new EdiMarsBar();
        } else {
            System.out.println("item not on the menu");
            return null;
        }
    }

}
