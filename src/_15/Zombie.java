package _15;

public class Zombie implements Movable{
    private String targetBrain;

    public Zombie(String targetBrain) {
        this.targetBrain = targetBrain;
    }

    @Override
    public void move() {
        System.out.println("Zombie drags its feet slowly towards " + targetBrain + "... Braaains!");
    }
}
