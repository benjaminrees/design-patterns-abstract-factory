package solution.food;

import solution.shop.IngredientFactory;

public class EdiSupper extends Supper {
  private IngredientFactory ingredientFactory;

  public EdiSupper(IngredientFactory ingredientFactory){
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
