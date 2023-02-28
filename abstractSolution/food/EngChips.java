package abstractSolution.food;

public class EngChips extends Chips {

    public EngChips() {
        name = "chips";
        requiresBatter = false;
        condiments.add("salt");
        condiments.add("vinegar");
    }
}
