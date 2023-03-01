package solution.shop;

import solution.ingredients.Fish;
import solution.ingredients.Salt;
import solution.ingredients.Sauce;
import solution.ingredients.Vinegar;

public interface IngredientFactory {
  public Fish createFish();
  public Sauce createSauce();
  public Salt createSalt();
  public Vinegar createVinegar();
}
