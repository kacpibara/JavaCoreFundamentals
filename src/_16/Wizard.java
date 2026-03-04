package _16;

public class Wizard {
    private int currentMana;
    public Wizard(int currentMana) {
        this.currentMana = currentMana;
    }

    public void castSpell(String spellName, int manaCost) throws NotEnoughManaException {
        if(currentMana < manaCost) {
            throw new NotEnoughManaException("Not enough mana to cast " + spellName);
        }
        currentMana -= manaCost;
        System.out.println("Casting " + spellName + " !Woooosh!");
    }
}
