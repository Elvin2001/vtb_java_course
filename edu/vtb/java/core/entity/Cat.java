package edu.vtb.java.core.entity;

public class Cat extends Animal {
    private static int catCounter;

    public Cat(int runningLimit, int swimmingLimit) {
        super(runningLimit, swimmingLimit);
        this.name = "Кот";
        catCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= super.runningLimit) {
            System.out.println("Бег: " + "Кот" + " пробежал " + distance + " м.");
        } else {
            System.out.println("Коту трудно пробежать " + distance + " м, он устал..");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать..");
        return;
    }
}
