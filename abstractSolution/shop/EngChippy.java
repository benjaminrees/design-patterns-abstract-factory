package abstractSolution.shop;

import abstractSolution.food.EngChips;
import abstractSolution.food.EngFish;
import abstractSolution.food.Fish;
import abstractSolution.food.Chips;

public class EngChippy extends Chippy {

  @Override
  Chips createChips(String type) {
    return new EngChips();
}
  @Override
  Fish createFish(String type){
    return new EngFish();
}

}