package solution.shop;

import solution.food.EngChips;
import solution.food.Chips;

public class EngChippy extends Chippy {

    Chips createFood(String type) {
            return new EngChips();
    }
}
