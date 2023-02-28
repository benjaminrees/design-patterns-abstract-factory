package abstractSolution;

import abstractSolution.food.Chips;
import abstractSolution.shop.EdiChippy;
import abstractSolution.shop.EngChippy;

public class RunShop {

    public static void main(String[] args) {

        EngChippy engChippy = new EngChippy();
        Chippy ediChippy = new EdiChippy();

        Chips food;
        food = engChippy.orderFood("chips");
        System.out.println("Phil got " + food.getName());

        food = engChippy.orderFood("chips");
        System.out.println("Phil got " + food.getName());

    }

}
