package org.example;

public class Rat extends Pet{
    public Rat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Squeak-Squeak";
    }
}
