package solution.food;

public class EdiChips extends Food {

    public EdiChips() {
        name = "chips";
        requiresBatter = false;
        condiments.add("salt");
        condiments.add("sauce");
    }
}
