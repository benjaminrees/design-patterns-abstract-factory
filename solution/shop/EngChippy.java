package solution.shop;

import solution.food.EngSupper;
import solution.food.Supper;

public class EngChippy extends Chippy {

  IngredientFactory ingredientFactory = new EngIngredientFactory();

    public Supper createFood(String type) {
      System.out.println("Making English supper");
        return new EngSupper(ingredientFactory);
    }

}
