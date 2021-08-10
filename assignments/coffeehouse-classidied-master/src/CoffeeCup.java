
/**
 * A coffee cup
 * In part 2, additional information will be added to this cup
 * @author RD
 */
public class CoffeeCup {

    private boolean isFull;  // Is this cup full?  Default value false.
    private String owner;  // variable to take name
    private int size = 250; // size of cup (can hold 250 mL)
    
    /**
     * Returns whether this cup is full (true) or empty(false);
     * @return is this cup full?
     */
    public boolean isFull() {
        return isFull;
    }
    CoffeeCup (String name) {
        owner = name;
    }
    public String getName() {
        return owner;
    }
    /**
     * Fill this cup to the top
     */
    public void fill() {
        isFull = true;
    }
    
    /**
     * Drink this cup entirely
     */
    public boolean drink() {
        if (isFull) {
            System.out.println(owner + ": You glug the coffee down.\n");
            isFull = false;
            return true;
        } else {
            System.out.println(owner + ": You sip furiously, but only suck air.\n");
            return false;
        }

    }

    /**
     * @return the size of the cup
     */
    public int getSize() { // getter method for size of cup
        return size;
    }

}
