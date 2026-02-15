package polymorphism;

public class Child extends Parent {


    // Method Overriding because same method name and same parameters in both parent and child class

  public void property()
    {
        System.out.println(" Show Child Property: Bike, Mobile, Laptop");
    }



  public static void main(String[] args)
  {

      Parent p = new Child();  //parent reference and child object
        p.property();



  }


}
