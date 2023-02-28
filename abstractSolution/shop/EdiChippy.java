package abstractSolution.shop;

import abstractSolution.food.*;


public class EdiChippy extends Chippy {

    @Override
    Chips createChips(String type) {
        return new EdiChips();
    }
    @Override
    Fish createFish(String type){
        return new EdiFish();
    }

}
