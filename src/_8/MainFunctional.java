package _8;

public class MainFunctional {
    public static void main(String[] args) {
        int myNumber = 5;

        System.out.println("Before modification: " + myNumber);

        myNumber = increase(myNumber);

        System.out.println("After  modification: " + myNumber);
    }

    public static int increase(int number) {
        return number + 1;
    }
}