package solution.shop;

import solution.food.EdiChips;
import solution.food.Chips;

public class EdiChippy extends Chippy {

    Chips createFood(String type) {
        return new EdiChips();
    }

}
