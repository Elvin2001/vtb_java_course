package edu.vtb.java.homework.second.entity;

public class Wall extends Obstacle {
    private static final int MAX_HEIGHT = 10;

    public Wall() {
        super();
    }

    public int getMAX_HEIGHT() {
        return MAX_HEIGHT;
    }

    @Override
    public void overcomeAnObstacle(Participant participant) {
        if (checkAbilityToOvercome(participant)) {
            System.out.println(participant.getClass().getName() + " запрыгнул на стену!");
        } else {
            System.out.println(participant.getClass().getName() + " не запрыгнул на стену!");
        }
    }

    public boolean checkAbilityToOvercome(Participant participant) {
        return participant.jump(MAX_HEIGHT);
    }
}
