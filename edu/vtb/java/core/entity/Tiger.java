package edu.vtb.java.core.entity;

public class Tiger extends Animal {
    private static int tigerCounter;

    public Tiger(int runningLimit, int swimmingLimit) {
        super( runningLimit, swimmingLimit);
        this.name = "Тигр";
        tigerCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance <= super.runningLimit) {
            System.out.println("Бег: " + "Тигр" + " пробежал " + distance + " м.");
        } else {
            System.out.println("Тигру трудно пробежать " + distance + " м, он устал..");
            return;
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= super.swimmingLimit) {
            System.out.println("Тигр проплыл " + distance + " м.");
        } else {
            System.out.println("Тигр устал плыть..");
            return;
        }
    }
}
