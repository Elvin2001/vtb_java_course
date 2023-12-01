package edu.vtb.java.core.entity;

public class Dog extends Animal {
    private static int dogCounter;

    public Dog(int runningLimit, int swimmingLimit) {
        super(500, 10);
        this.name = "Собака";
        dogCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= super.runningLimit) {
            System.out.println("Бег: " + name + " пробежала " + distance + " м.");
        } else {
            System.out.println("Псу трудно пробежать " + distance + " м, он устал..");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= super.swimmingLimit) {
            System.out.println(name + " проплыла " + distance + " м.");
        } else {
            System.out.println(name + " устала плыть..");
        }
    }
}
