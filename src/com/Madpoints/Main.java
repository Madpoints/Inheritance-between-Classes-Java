package com.Madpoints;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Golden Retriever", 10, 70, 2,4,1,25, "Red");
        dog.eat();
        dog.walk();
        dog.run();

        Fish fish = new Fish("Tuna", 6, 20, 6, 2, 3);
        fish.move(.5);
    }
}
