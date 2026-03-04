package _16;

public class Main {
    public static void main(String[] args) {
        Wizard gandalf = new Wizard(60);
        try{
            gandalf.castSpell("Fireball", 50);

            gandalf.castSpell("Fireball", 50);
        }catch(NotEnoughManaException e){
            System.out.println("Spell failed: " +e.getMessage());
        }

    }
}
