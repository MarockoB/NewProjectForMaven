package org.example;

public class Pig extends Pet {
    public Pig(String name) {
        super(name);
    }
    @Override
    public String makeSound() {
        return "Sniff-Sniff";
    }
}
