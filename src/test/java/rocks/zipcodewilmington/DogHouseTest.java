package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    // TODO - Create tests for `void remove(Integer id)`


    @Test
    public void addTest() {
        DogHouse dogH = new DogHouse();
        Dog dog = new Dog("", new Date(), 1);
        Dog expected = dog;
        // Then
        dogH.add(dog);
        Dog actual = DogHouse.getDogById(1);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void reTest() {
        DogHouse dogH = new DogHouse();
        Dog dog = new Dog("", new Date(), 1);
        int expected = 0;
        // Then
        DogHouse.add(dog);
        dogH.remove(1);

        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {

        Dog dog = new Dog("", new Date(), 1);
        int expected = 0;
        // Then
        DogHouse.add(dog);
        DogHouse.remove(dog);

        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void getDogById() {

        Dog dog = new Dog("", new Date(), 1);
        Dog expected = dog;
        // Then
        DogHouse.add(dog);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void getDogNumberTest() {
        Dog dog = new Dog("", new Date(), 1);
        int expected = 1;
        // Then
        DogHouse.add(dog);


        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

}


