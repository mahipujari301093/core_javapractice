package constructor;

public class Collage {


    int roleNumber;
    String name;

    // with parameter constructor ( Constructor store the data)
    public Collage (int roleNumber ,String name)
    {
        this.roleNumber = roleNumber;
        this.name = name;


    }

    public void displayCollageInfo() // define method to use the stored data
    {
        System.out.println("Role Number: " + roleNumber);
        System.out.println("Name: " + name);
    }

    public static void main(String[]args)
    {

        Collage c = new Collage(1001, "Vishal Pujari");   // we can change the values of roleNumber and name as per our choice
        c.displayCollageInfo();

    }








}
