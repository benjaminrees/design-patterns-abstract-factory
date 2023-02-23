package problem.food;

import java.util.ArrayList;

public abstract class Food {
    String name;
    boolean requiresBatter;
    ArrayList<String> condiments = new ArrayList<String>();

    public void batter() {
        if (this.requiresBatter) {
            System.out.println("Battering " + this.name);
        } else {
            return;
        }
    };

    public void fry() {
        System.out.println("Frying " + this.name);
    };

    public void addCondiments() {
        for (String condiment : this.condiments) {
            System.out.println("Adding " + condiment);
        }
    }

    public void serve() {
        System.out.println("Serving " + this.name);
    };

    public String getName() {
        return name;
    }
}