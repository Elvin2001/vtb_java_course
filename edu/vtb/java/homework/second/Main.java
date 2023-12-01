package edu.vtb.java.homework.second;

import edu.vtb.java.homework.second.entity.*;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = {
                new Treadmill(),
                new Wall()
        };

        Participant[] participants = {
                new Person(),
                new Robot(),
                new Cat()
        };

        getInfoFromCompetition(obstacles, participants);

    }

    public static void getInfoFromCompetition(Obstacle[] obstacles, Participant[] participants) {
        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.overcomeAnObstacle(participant);
                System.out.println("**************************************************");
            }
        }
    }
}
