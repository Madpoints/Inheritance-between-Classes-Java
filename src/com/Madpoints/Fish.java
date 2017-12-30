package com.Madpoints;

public class Fish extends Animal {

    private  int gils;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gils, int eyes, int fins) {

        super(name, 1, 1, size, weight);
        this.gils = gils;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        System.out.println(super.getName() + " is resting.");
    }

    private void moveMuscles() {
        System.out.println(super.getName() + " is moving its muscles.");
    }

    private void moveTailFin() {
        System.out.println(super.getName() + " is moving its tail fin.");
    }

    private void swim() {
        moveMuscles();
        moveTailFin();
        System.out.println(super.getName() + " is swimming");
    }

    @Override
    public void move(double speed) {
        swim();
        super.move(speed);
    }
}
