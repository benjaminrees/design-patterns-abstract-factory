package solution.food;

import solution.shop.IngredientFactory;
import solution.shop.Salt;
import solution.shop.Fish;

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
