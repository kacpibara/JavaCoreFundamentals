package _24;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Exploring the Dungeon ---");

        try (MagicDoor door = new MagicDoor()) {

            door.enter();

            System.out.println("This line will never be printed because of the trap.");

        } catch (Exception e) {
            System.out.println("Hero is hurt: " + e.getMessage());
        }

        System.out.println("--- Adventure ended ---");
    }
}
