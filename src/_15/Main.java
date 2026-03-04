package _15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Movable> movables = new ArrayList<>();
        movables.add( new CyberTruck(100));
        movables.add( new Zombie("John's brain"));
        movables.add( new RoombaVacuum(40));

        for(Movable racers : movables) {
            racers.move();
        }
    }
}