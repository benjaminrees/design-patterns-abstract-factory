package solution.food;

import java.util.ArrayList;

import solution.ingredients.Fish;
import solution.ingredients.Salt;
import solution.ingredients.Sauce;
import solution.ingredients.Vinegar;

public abstract class Supper {
    String name;
    boolean requiresBatter;
    ArrayList<String> condiments = new ArrayList<String>();

    Fish fish;
    Salt salt;
    Sauce sauce;
    Vinegar vinegar;
  

    // gets ingredients
    public abstract void prepare();

    void fry(){
      System.out.println("cooking");
    }

    void box(){System.out.println("boxing");}
}