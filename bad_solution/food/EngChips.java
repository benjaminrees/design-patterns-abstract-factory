package bad_solution.food;

public class EngChips extends Food {

    public EngChips() {
        name = "chips";
        requiresBatter = false;
        condiments.add("salt");
        condiments.add("vinegar");
    }
}
