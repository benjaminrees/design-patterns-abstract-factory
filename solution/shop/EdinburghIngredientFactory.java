package solution.shop;

public class EdinburghIngredientFactory implements IngredientFactory {

  @Override
  public Fish createFish() {
    return new Cod();
  }

  @Override
  public Sauce createSauce() {
    return new ChippySauce();
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