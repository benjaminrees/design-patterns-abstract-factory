package solution.shop;

public class EngIngredientFactory implements IngredientFactory {

  @Override
  public Fish createFish() {
    return new Haddock();
  }

  @Override
  public Sauce createSauce() {
    return new TartareSauce();
  }

  @Override
  public Salt createSalt() {
    return new Salt();
  }


  @Override
  public Vinegar createVinegar() {
    return new Vinegar();
  }
  
}