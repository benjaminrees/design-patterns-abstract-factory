package problem.food;

public class Fish extends Food {

    public Fish() {
        name = "fish";
        requiresBatter = true;
        condiments.add("salt");
        condiments.add("sauce");
    }
}
