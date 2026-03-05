package _26;

public interface MagicalItem {

    // classic old method no body
    void use();

    // default method, class can use it or ovveride
    default void repair() {
        System.out.println("Using basic magic to repair the item... Good as new!");
    }

    // static method
    // triggered on interface name
    static void identify() {
        System.out.println("[SYSTEM]: This is a standard magical artifact governed by Ancient Laws.");
    }
}
