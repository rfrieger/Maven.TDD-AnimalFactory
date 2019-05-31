package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    Date date=new Date("12/15/06");

    @Test
    public void createCatNameTest() {
        AnimalFactory aninmal = new AnimalFactory();
        Cat cat = aninmal.createCat("bob", date);
        String actual = "bob";
        String expected = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createCatDateTest() {
        AnimalFactory aninmal = new AnimalFactory();
        Cat cat = aninmal.createCat("bob", date);
        Date actual = date;
        Date expected = cat.getBirthDate();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void createDogNameTest() {
        AnimalFactory aninmal = new AnimalFactory();
        Dog dog = aninmal.createDog("bob", date);
        String actual = "bob";
        String expected = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createDogDateTest() {
        AnimalFactory aninmal = new AnimalFactory();
        Dog dog = aninmal.createDog("bob", date);
        Date actual = date;
        Date expected = dog.getBirthDate();

        Assert.assertEquals(expected, actual);
    }


}
