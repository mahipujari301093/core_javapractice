package inheritance;

public class Child_1 extends Parent_1 {


     public void car()
     {
         System.out.println("Child owns car");

     }

    public static void main (String[]args)
    {

        Child_1 c1 = new Child_1();
        c1.land();  // grandparent property access in child class
        c1.house(); // parent property access in child class
        c1.car();   // child property access in child class


    }

}
