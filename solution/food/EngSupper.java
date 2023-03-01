package solution.food;

import solution.ingredients.Fish;
import solution.ingredients.Salt;
import solution.shop.IngredientFactory;

public class EngSupper extends Supper {
  IngredientFactory ingredientFactory;

  public EngSupper(IngredientFactory ingredientFactory){
    this.ingredientFactory = ingredientFactory;
  }

  public void prepare(){
    System.out.println("Preparing");
    salt = ingredientFactory.createSalt();
    fish = ingredientFactory.createFish();
    vinegar = ingredientFactory.createVinegar();
    sauce = ingredientFactory.createSauce();
    
    
  }


}
