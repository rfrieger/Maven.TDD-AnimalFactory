package rocks.zipcodewilmington;
import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.net.Socket;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void addTest() {
         CatHouse catH = new CatHouse();
         Cat cat = new Cat("", new Date(), 1);
         Cat expected = cat;
        // Then
        catH.add(cat);
        Cat actual = CatHouse.getCatById(1);
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void reTest() {
        CatHouse catH = new CatHouse();
        Cat cat = new Cat("", new Date(), 1);
        int expected = 0;
        // Then
        CatHouse.add(cat);
        catH.remove(1);

        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {

        Cat cat = new Cat("", new Date(), 1);
        int expected = 0;
        // Then
        CatHouse.add(cat);
        CatHouse.remove(cat);

        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatById() {

        Cat cat = new Cat("", new Date(), 1);
        Cat expected = cat;
        // Then
        CatHouse.add(cat);


        Cat actual = CatHouse.getCatById(1);
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
        @Test
        public void getNumberOfCats() {

        Cat cat = new Cat("", new Date(), 1);
        int expected = 1;
        // Then
        CatHouse.add(cat);


        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

}
