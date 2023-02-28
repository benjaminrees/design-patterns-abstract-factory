package abstractSolution.food;

public class EdiChips extends Chips {

    public EdiChips() {
        name = "chips";
        requiresBatter = false;
        condiments.add("salt");
        condiments.add("sauce");
    }
}
