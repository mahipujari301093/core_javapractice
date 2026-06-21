package constructor;

public class CoffeeMachine {

    // Without Arguments Constructor


    String coffeeType;
    String cupSize;

    public void CoffeeMachine()  //  defined Constructor
    {

        this.coffeeType = "Espresso";
        this.cupSize = "Medium";

    }

    public void displayInfo()  // Normal method to display the information of the coffee machine
    {

       System.out.println("Coffee Type: " + coffeeType);
       System.out.println("Cup Size: " + cupSize);
    }

    public static void main(String[]args)
    {
        CoffeeMachine cm = new CoffeeMachine();
        cm.CoffeeMachine(); // Calling the method to initialize the attributes
        cm.displayInfo(); // Displaying the information of the coffee machine
    }


}
