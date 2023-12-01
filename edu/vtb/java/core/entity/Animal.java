package edu.vtb.java.core.entity;

public abstract class Animal implements Movementable {
    protected String name;
    protected int runningLimit;
    protected int swimmingLimit;
    private static int counter;

    public Animal(int runningLimit, int swimmingLimit) {
        this.runningLimit = runningLimit;
        this.swimmingLimit = swimmingLimit;
        counter++;
    }

    @Override
    public abstract void run(int distance);

    @Override
    public abstract void swim(int distance);
}
