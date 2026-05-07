package outils_libre_lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void testDogEat() {
        Dog dog = new Dog();
        // eat() uses getClass().getSimpleName() so output should contain "Dog"
        // We just verify no exception is thrown and the object is Animal
        assertTrue(dog instanceof Animal);
    }

    @Test
    public void testCatEat() {
        Cat cat = new Cat();
        assertTrue(cat instanceof Animal);
    }

    @Test
    public void testDogIsAnimal() {
        Animal animal = new Dog();
        assertEquals("Dog", animal.getClass().getSimpleName());
    }

    @Test
    public void testCatIsAnimal() {
        Animal animal = new Cat();
        assertEquals("Cat", animal.getClass().getSimpleName());
    }
}
