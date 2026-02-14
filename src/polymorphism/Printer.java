package polymorphism;

public class Printer {

    // Method overloading or compile-time polymorphism example


    public void printInfo(String name)
    {

        System.out.println("Name: " + name);

    }

    public void printInfo(int age)
    {

        System.out.println(" Age: " + age);

    }

    public void printInfo(String name, int age)
    {

        System.out.println("Name: " + name + ", Age: " + age);

    }



    public static void main(String[]args)
    {

        Printer p = new Printer();

        p.printInfo("Vishal");
        p.printInfo(30);
        p.printInfo("Vishal", 30);


    }


}
