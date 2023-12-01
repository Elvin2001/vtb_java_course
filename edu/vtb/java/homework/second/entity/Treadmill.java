package edu.vtb.java.homework.second.entity;

public class Treadmill extends Obstacle {
    private final int MAX_LENGTH = 50;

    public Treadmill() {
        super();
    }

    public int getMAX_LENGTH() {
        return MAX_LENGTH;
    }

    @Override
    public void overcomeAnObstacle(Participant participant) {
        if (checkAbilityToOvercome(participant)) {
            System.out.println(participant.getClass().getName() + " пробежал беговую дорожку!");
        } else {
            System.out.println(participant.getClass().getName() + " не пробежал беговую дорожку!");
        }
    }

    public boolean checkAbilityToOvercome(Participant participant) {
        return participant.run(MAX_LENGTH);
    }
}
