package ua.hillel.Holovnya.lessons.lesson13.good;

import ua.hillel.Holovnya.lessons.lesson13.good.obstacle.ObstaclePool;
import ua.hillel.Holovnya.lessons.lesson13.good.obstacle.ObstacleWall;
import ua.hillel.Holovnya.lessons.lesson13.good.participant.ParticipantCat;
import ua.hillel.Holovnya.lessons.lesson13.good.participant.ParticipantDog;

public class Main {
    public static void main(String[] args) {

        ObstaclePool obstaclePool = new ObstaclePool();
        ObstacleWall obstacleWall = new ObstacleWall();

        ParticipantCat cat = new ParticipantCat("cat1");
        ParticipantDog dog = new ParticipantDog("dog1");


        obstaclePool.start(cat);
        obstaclePool.start(dog);
//        obstaclePool.start(frog);
//
        obstacleWall.start(cat);
        obstacleWall.start(dog);
//        obstacleWall.start(frog);
    }

}
