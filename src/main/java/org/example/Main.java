package org.example;

public class Main {
    public static void main(String[] args) {
        Pet rat = new Rat("Монетка");
        System.out.println(rat.getName() + ": " + rat.makeSound());
        Pet pig = new Pig("Кабачок");
        System.out.println(pig.getName() + ": " + pig.makeSound());
    }
}