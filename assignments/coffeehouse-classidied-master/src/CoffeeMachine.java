/* A fancy coffee maker.  Makes coffee of varying strengths. */
/**
 *
 * @author RDCOMP
 */
public class CoffeeMachine {

        // The current strength of the coffee.
    private String strength = "Killer Intense";
    private String stage = ""; // counter to ensure all steps are taken
    private int waterLevel = 500; // initial water level in mL
   
    /**
     * Set the strength of the Coffee to s; affects the fineness of the
     * grind.
     * "Weak", "Regular", "Strong" are the usual options for s, but you can
     * try others.
     * @param s Text Description of Strength
     */
    public void setStrength(String s) {
        stage += "a"; // letters to differentiate stages
        strength = s;
    }
    /**
     * Grind the beans for the coffee
     */
    public void grindBeans() {
        if (!(stage.contains("a"))) { // will not grind without a set strength (stage a)
            System.out.println("Error: a strength was not specified");
            System.exit(0); // exiting program
        } else if (!(stage.contains("c"))) { // cannot grind without beans (stage c)
            System.out.println("Error: no beans to grind");
            System.exit(0);
        } 
        stage += "d"; 
        System.out.println("Grinding beans for " +
            strength + " coffee.");
    }
    
    /**
     * Brew the coffee into given cup c
     * @param c The cup of coffee to be filled
     */
    public void brew(CoffeeCup c) {
        if (!(stage.contains("b")) || !(stage.contains("d"))) { 
            // stages a, c do not need consideration because d relies on a, c
            System.out.println("Error: cannot brew because a step was skipped");
            System.exit(0); // exiting program if a step was skipped
        } else if (waterLevel < 250) { // ensuring there is enough water to brew a cup
            System.out.println("Not enough water to brew");
            System.exit(0);
        }
        System.out.println("Brewing " + strength + " coffee into coffee cup " + c.getName() + "\n");
        c.fill();
        waterLevel -= c.getSize(); // subtracting the water used from the total amount
    }

    /**
     * Add water to the machine reservoir
     */
    public void addWater() {
        stage += "b";
        System.out.println("Adding Water");
    }


    /**
     * Add Beans to the Machine
     */
    public void addBeans() {
        stage += "c";
        System.out.println("Adding Beans");
    }
    

    
}
