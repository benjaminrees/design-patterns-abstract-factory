package problem.shop;

import problem.food.Chips;
import problem.food.Fish;
import problem.food.Food;
import problem.food.JumboSausage;
import problem.food.MarsBar;

public class Chippy {

    public Food orderFood(String type) {
        Food food;
        System.out.println("##########");
        System.out.println("Beginning new order");

        if (type.equals("fish")) {
            food = new Fish();
        } else if (type.equals("jumbo sausage")) {
            food = new JumboSausage();
        } else if (type.equals("chips")) {
            food = new Chips();
        } else if (type.equals("mars bar")) {
            food = new MarsBar();
        } else {
            System.out.println("item not on the menu");
            return null;
        }

        food.batter();
        food.fry();
        food.serve();
        return food;
    }
}
