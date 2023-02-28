package solution.shop;

import solution.food.EdiSupper;
import solution.food.Supper;

public class EdiChippy extends Chippy {
  IngredientFactory ingredientFactory = new EdinburghIngredientFactory();

  public Supper createFood(String type) {
    System.out.println("Making Scottish supper");
    return new EdiSupper(ingredientFactory);
}

}
