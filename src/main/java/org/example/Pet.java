package org.example;

abstract public class Pet {
    protected String name;
    public abstract String makeSound();

    public String getName() {
        return name;
    }

    public Pet(String name) {
        this.name = name;
    }

}
