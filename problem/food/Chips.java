package problem.food;

public class Chips extends Food {

    public Chips() {
        name = "chips";
        requiresBatter = false;
        condiments.add("salt");
        condiments.add("sauce");
    }
}
