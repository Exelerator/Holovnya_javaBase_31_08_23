package ua.hillel.Holovnya.lessons.lesson13.good.obstacle;

import ua.hillel.Holovnya.lessons.lesson13.good.participant.Participant;
import ua.hillel.Holovnya.lessons.lesson13.good.participant.ParticipantCat;
import ua.hillel.Holovnya.lessons.lesson13.good.participant.ParticipantDog;

public class ObstacleWall extends  Obstacle{

    @Override
    public void start(Participant patricipant) {
        System.out.println(patricipant.getName() + " start jump");

    }
}
