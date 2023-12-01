package edu.vtb.java.homework.second.entity;

public class Robot implements Participant {
    private final int RUNNING_MAX = 50;
    private final int JUMPING_MAX = 0;

    @Override
    public boolean run(int distance) {
        return RUNNING_MAX >= distance;
    }

    @Override
    public boolean jump(int distance) {
        return JUMPING_MAX >= distance;
    }

    public int getRUNNING_MAX() {
        return RUNNING_MAX;
    }

    public int getJUMPING_MAX() {
        return JUMPING_MAX;
    }

    @Override
    public String toString() {
        return "Robot";
    }
}
