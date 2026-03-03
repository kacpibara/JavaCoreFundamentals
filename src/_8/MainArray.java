package _8;

public class MainArray {
    public static void main(String[] args) {
        int[] myNumber = {5};

        System.out.println("Before modification: " + myNumber[0]);

        increase(myNumber);

        System.out.println("After modification: " + myNumber[0]);
    }

    public static void increase(int[] liczbaWTablicy) {
        liczbaWTablicy[0]++;
    }
}