package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

/**
 * @author leon on 4/19/18.
 */
public interface Animal {
    String speak();
    Integer getNumberOfMealsEaten();
    Integer getId();
    static void eat(Food food);

}
