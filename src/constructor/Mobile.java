package constructor;

public class Mobile {

    // With Arguments Constructor

    String brand;
    int price;


    public void Mobile(String brand, int price )  //  defined Constructor
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
        Mobile m = new Mobile();
        m.Mobile("Samsung", 50000); // Calling the method to initialize the attributes
        m.displayInfo(); // Displaying the information of the mobile
    }


}
