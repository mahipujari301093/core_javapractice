package polymorphism;

public class Child extends Parent {


    // Method Overriding because same method name and same parameters in both parent and child class


   @Override
  public void property()
    {
        System.out.println(" Show Child Property: Bike, Mobile, Laptop");
    }



  public static void main(String[] args)
  {



      Parent p = new Child(); 
        p.property();

  }

        /*
        
        
        📌 Reference Type = Parent
        📌 Object Type = Child

➡️ Since property() method is overridden by child class, Java executes the Child's property() method.



Easy Interview Answer

It is called Runtime Polymorphism because the JVM decides which overridden method to execute while the program is running, based on the actual object, not the reference type.

Easy Trick to Remember
📝 Compile Time → Checks whether the method exists.
▶️ Runtime → Decides which overridden method to execute.
             
        
*/



}
