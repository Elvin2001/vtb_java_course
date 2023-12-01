package edu.vtb.java.homework.second.entity;

public abstract class Obstacle {
    public void overcomeAnObstacle(Participant participant) {
        System.out.println("Участник -  " + participant.getClass().getSimpleName() + " прошёл испытание!");
    }

    public abstract boolean checkAbilityToOvercome(Participant participant);
}
