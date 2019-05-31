package rocks.zipcodewilmington;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.net.Socket;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    Date date=new Date("12/15/06");


    @Test
    public void setName() {
        String expected = "bob";

        // When
        Cat cat = new Cat(expected, date ,1);

        // Then
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        String expected = "meow!";

        // When
        Cat cat = new Cat("", date ,1);

        // Then
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate() {
        Date expected = date;

        // When
        Cat cat = new Cat("", null ,1);
        cat.setBirthDate(expected);
        // Then
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {

        Cat cat = new Cat("bob", date ,1);

        int before = cat.getNumberOfMealsEaten();
        cat.eat(new Food());
        int after = cat.getNumberOfMealsEaten();

        Assert.assertEquals(before +1 , after);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        int expected = 1;

        // When
        Cat cat = new Cat("", date ,1);

        // Then
        int actual = cat.getId();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalinheritanceTest() {
        Cat cat = new Cat(null,null,null);


        Assert.assertEquals(cat instanceof Animal, true);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalinheritanceTest() {
        Cat cat = new Cat(null,null,null);


        Assert.assertEquals(cat instanceof Mammal, true);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
