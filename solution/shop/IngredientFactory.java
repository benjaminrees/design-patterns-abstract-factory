package solution.shop;

public interface IngredientFactory {
  public Fish createFish();
  public Sauce createSauce();
  public Salt createSalt();
  public Vinegar createVinegar();
}
