package solution;

import solution.food.Chips;
import solution.shop.Chippy;
import solution.shop.EdiChippy;
import solution.shop.EngChippy;

public class RunShop {

    public static void main(String[] args) {

        Chippy engChippy = new EngChippy();
        Chippy ediChippy = new EdiChippy();

        Chips food;
        food = engChippy.orderFood("chips");
        System.out.println("Phil got " + food.getName());

        food = engChippy.orderFood("chips");
        System.out.println("Phil got " + food.getName());

    }

}
