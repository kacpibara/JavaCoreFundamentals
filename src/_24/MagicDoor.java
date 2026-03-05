package _24;

class MagicDoor implements AutoCloseable {

    public MagicDoor() {
        System.out.println("--- Magic Door is CREATED. ---");
    }

    public void enter() throws Exception {
        System.out.println("- Hero enters the dungeon...");
        throw new Exception("- A fireball trap was triggered!");
    }

    @Override
    public void close() {
        System.out.println("--- Magic Door is AUTOMATICALLY CLOSED (Monsters can't escape!). ---");
    }
}
