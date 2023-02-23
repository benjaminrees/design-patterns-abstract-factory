package solution;

import solution.food.Food;
import solution.shop.Chippy;
import solution.shop.EdiChippy;
import solution.shop.EngChippy;

public class RunShop {

    public static void main(String[] args) {

        Chippy engChippy = new EngChippy();
        Chippy ediChippy = new EdiChippy();

        Food food;
        food = engChippy.orderFood("chips");
        System.out.println("Phil got " + food.getName());

        food = ediChippy.orderFood("fish");
        System.out.println("James got a " + food.getName());
        food = ediChippy.orderFood("mars bar");
        System.out.println("Gabi got a " + food.getName());

        food = engChippy.orderFood("doughnut");
        System.out.println("Phil tried to order a doughnut");

    }

}
