import java.util.Scanner;
public class CoffeeKlatsch {

    public static void main(String[] args) {
        // creating scanner
        Scanner sc = new Scanner(System.in);
        // Declare a reference to a CoffeeMachine.
        CoffeeMachine machine1;
        // Create a new CoffeeMachine and make the variable refer to it.
        machine1 = new CoffeeMachine();
        // Add water and beans to the CoffeeMachine.
        machine1.addWater();
        machine1.addBeans();
        // Get ready to grind some strong coffee in the CoffeeMachine.
        System.out.println("What strength would you like your coffee (weak/regular/strong)?");
	machine1.setStrength(sc.nextLine());
        // Grind the beans.
        machine1.grindBeans();
        // Declare a reference to a CoffeeCup.
        CoffeeCup cup1;
        // Asking for name
        System.out.println("Who's the owner of this cup of coffee?");
        String name = sc.nextLine();
        // Create a new CoffeeCup and make the variable refer to it.
        cup1 = new CoffeeCup(name);
        // Have your CoffeeMachine brew coffee into the coffee cup.
        machine1.brew(cup1);
        // Drink from the cup.
        cup1.drink();
        // Try to drink again --the cup is now empty.
        cup1.drink();
        // Declare ANOTHER coffee cup reference and initialize it.
	CoffeeCup cup2 = new CoffeeCup(name);
        // Brew coffee into the new cup.
        machine1.brew(cup2);
        // Try to drink from the first cup --it's still empty!
        cup1.drink();
        // Drink from the second cup.
        cup2.drink();
        // Print a sigh of satisfaction.
	System.out.println("You breathe a sigh of satisfaction.");
        // closing scanner
        sc.close();
    }
}
