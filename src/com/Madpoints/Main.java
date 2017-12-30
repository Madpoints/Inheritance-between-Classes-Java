package com.Madpoints;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Golden Retriever", 10, 70, 2,4,1,25, "Red");
        dog.eat();
    }
}
