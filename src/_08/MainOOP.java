package _08;

class MutableNumber {
    private int value;

    public MutableNumber(int value) {
        this.value = value;
    }

    public void increase(int many) {
        this.value += many;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}

public class MainOOP {
    public static void main(String[] args) {
        MutableNumber myNumber = new MutableNumber(5);

        System.out.println("Before modification: " + myNumber);

        modify(myNumber);

        System.out.println("After modification: " + myNumber);
    }

    public static void modify(MutableNumber obiektLiczbowy) {
        obiektLiczbowy.increase(1);
    }
}