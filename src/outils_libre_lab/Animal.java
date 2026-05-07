package outils_libre_lab;

public abstract class Animal {
    public void eat() {
        System.out.println(getClass().getSimpleName() + " is eating");
    }

    public void sleep() {
        System.out.println(getClass().getSimpleName() + " is sleeping");
    }
}
