package problem;

import problem.food.Food;
import problem.shop.Chippy;

public class RunShop {

    public static void main(String[] args) {

        Chippy chippy = new Chippy();

        Food food;
        food = chippy.orderFood("chips");
        System.out.println("Phil got " + food.getName());
        food = chippy.orderFood("mars bar");
        System.out.println("Gabi got a " + food.getName());
        food = chippy.orderFood("doughnut");
        System.out.println("Phil tried to order a doughnut");

    }

}
