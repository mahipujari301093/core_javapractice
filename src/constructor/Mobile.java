package constructor;

public class Mobile {

    // With Arguments Constructor

    String brand;
    int price;


    public Mobile(String brand, int price )  //  defined Constructor
    {

        this.brand = brand;
        this.price = price;

    }

    public void displayInfo()  // Normal method to display the information of the mobile
    {

        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }


    public static void main(String[]args)
    {
        Mobile m = new Mobile("Samsung", 50000); // Creating an object of the Mobile class and passing arguments to the constructor
    
        m.displayInfo(); // Displaying the information of the mobile
    }


}
