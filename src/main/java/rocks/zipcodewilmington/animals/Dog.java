package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Dog extends Mammal {
    public Dog() {
        super(name, birthDate, id);
    }

    public Dog(String name, Date bday, Integer givenId) {
        super(name, bday, givenId);
    }

    public static String speak() {
        return "bark!";
    }







    }
}
