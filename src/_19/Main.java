package _19;

public class Main {

    public static class Sword {
        @Override
        public String toString() {
            return "Sharp Iron Sword";
        }
    }

    public static class Potion {
        @Override
        public String toString() {
            return "Red Health Potion";
        }
    }

    // Generic Class - universal pouch for types T
    public static class MagicPouch<T> {
        private T item;

        public MagicPouch(T item) {
            this.item = item;
        }

        // reutyrn T types instead of Object
        public T getItem() {
            return item;
        }
    }

    // 2. Generic Method - parameters types T
    public static <T> void inspectItems(T[] items) {
        System.out.println("--- Inspecting array ---");
        for (T item : items) {
            System.out.println("Found: " + item.toString());
        }
    }

    public static void main(String[] args) {
        Sword sword = new Sword();
        Potion potion = new Potion();

        MagicPouch<Sword> swordPouch = new MagicPouch<>(sword);
        MagicPouch<Potion> potionPouch = new MagicPouch<>(potion);

        System.out.println("What's in the pouch? " + swordPouch.getItem().toString());

        Potion[] myPotions = {
                new Potion(),
                new Potion()
        };
        inspectItems(myPotions);

        String[] magicWords = { "Abra", "Kadabra" };
        inspectItems(magicWords);
    }
}