package _15;

public class RoombaVacuum implements Movable {
    int dirtCollected;

    public RoombaVacuum(int dirtCollected) {
        this.dirtCollected = dirtCollected;
    }

    @Override
    public void move() {
        dirtCollected += 5;
        System.out.println("Roomba spins its brushes, moves 1 meter and bumps into a wall. Dirt collected: " + dirtCollected + "g.");
    }
}
