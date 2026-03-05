package _18;

import java.util.Arrays;

public class A_NativeArray {
    public static void main(String[] args) {

        String[] topItems = new String[3];

        // Add Items
        topItems[0] = "Health Potion";
        topItems[1] = "Iron Sword";
        topItems[2] = "Elf and onion soup";

        // Search
        boolean hasSword = false;
        for(String item: topItems){
            if(item.equals("Iron Sword")){
                hasSword = true;
                break;
            }
        }
        System.out.println("Is 'Iron Sword' on the podium? " + hasSword);

        // Remove
        for(int i = 0; i < topItems.length; i++){
            if(topItems[i] != null && topItems[i].equals("Iron Sword")){
                topItems[i] = null;
            }
        }

        // Display
        System.out.println("Top items after removing weapons" + Arrays.toString(topItems));
    }
}
