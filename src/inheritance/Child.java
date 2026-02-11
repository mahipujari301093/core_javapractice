package inheritance;

public class Child extends Parent{



    public static void main(String[]args)
    {

        Child c = new Child();
        c.home();   // parent class method called by child class object
        c.amount();


    }


}
