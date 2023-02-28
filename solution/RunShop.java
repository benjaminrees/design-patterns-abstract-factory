package solution;

import solution.food.Supper;
import solution.shop.Chippy;
import solution.shop.EdiChippy;
import solution.shop.EngChippy;

public class RunShop {

    public static void main(String[] args) {

        Chippy engChippy = new EngChippy();
        Chippy ediChippy = new EdiChippy();

        System.out.println("adsfasdfsdfsd");

        Supper englishSupper = engChippy.createFood("any");  
        Supper scottishSupper = ediChippy.createFood("null");

    }

}
