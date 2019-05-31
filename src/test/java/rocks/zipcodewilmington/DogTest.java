package rocks.zipcodewilmington;

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

    Date date=new Date("12/15/06");

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        String expected = "bark!";

        // When
        Dog dog = new Dog(null, null ,null);

        // Then
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate() {
        Date expected = date;

        // When
        Dog dog = new Dog(null, date ,null);
        dog.setBirthDate(expected);
        // Then
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {

        Dog dog = new Dog(null, null ,null);

        int before = dog.getNumberOfMealsEaten();
        dog.eat(new Food());
        int after = dog.getNumberOfMealsEaten();

        Assert.assertEquals(before +1 , after);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        int expected = 1;

        // When
        Dog dog = new Dog(null, null ,1);

        // Then
        int actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalinheritanceTest() {

        Cat cat = new Cat(null, null, null);

        Assert.assertEquals(cat instanceof Animal, true);
    }
        // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test public void mammalinheritanceTest () {

        Cat cat = new Cat(null, null, null);

        Assert.assertEquals(cat instanceof Mammal, true);
    }

}
