package _26;


class EnchantedSword implements MagicalItem {
        @Override
        public void use() {
            System.out.println("⚔Swinging the Enchanted Sword! Slash!");
        }
}

class ElderWand implements MagicalItem {
        @Override
        public void use() {
            System.out.println("Casting a powerful spell with the Elder Wand! BOOM!");
        }

        @Override
        public void repair() {
            System.out.println("The Elder Wand requires a Dragon's Tear to be repaired. Basic magic failed!");
        }
    }

