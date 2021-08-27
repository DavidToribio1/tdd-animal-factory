package rocks.zipcodewilmington;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "rudy";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName); //
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog();
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest() {
        // Given
        String expected = "bark!";

        // when
        String actual = Dog.speak();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest() {
        // given
        Dog dog = new Dog(null,null,null);
        Date expected = new Date();

        // when
        Dog.setBirthDate(expected);

        // then
        Dog actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eat() {
        // given
        Food food = new Food();
        int initialMealsEaten = Dog.getNumberOfMealsEaten();
        int expected = initialMealsEaten + 1;


        // when
        Dog.eat(food);
        int actual = Dog.getNumberofEatenMeals();


        // then

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getId(){


        //when we construct & given
        String givenName = "tyson";
        Date bday = new Date();
        Integer givenId = 13;
        Dog dog = new Dog(givenName, bday, givenId);
        //actual
        Integer actualId = dog.getId();
        //assertEquals
        Assert.assertEquals(givenId, actualId);
    }

    @Test
    public void implementTest() {
        // given
        Dog dog = new Dog();

        // when
        boolean outcome = dog instanceof Animal;

        // then
        Assert.assertTrue(outcome);
    }

    @Test
    public void inheritanceTest() {
        // given
        Dog dog = new Cat();

        // when
        boolean outcome = dog instanceof Mammal;

        // then
        Assert.assertTrue(outcome);
    }

}




