package inheritance;

public class MultipleInheritance_Notes {


    /*

    ❌ Multiple Inheritance with Classes in Java

    Java does NOT support multiple inheritance using classes.

   👉 One class cannot extend more than one class.

   ❌ Not Allowed
   class A { }
   class B { }

   class C extends A, B { }   // ❌ Compile-time error


   Reason → Diamond problem / ambiguity.

   ************************************************************************************
   ✅ But Java supports Multiple Inheritance using INTERFACES

   package inheritance;

   interface Father
   {

    void money();
   }


  interface Mother
  {

    void gold();
  }

public class Child implements Father, Mother {    // ✅ Allowed (Father and Mother are interfaces)

    public void money()
    {
        System.out.println("Father gives money");
    }

    public void gold()

     {
        System.out.println("Mother gives gold");
     }

    public static void main(String[] args)

    {

        Child c = new Child();
        c.money();
        c.gold();
    }
}


✅ One Line Answer for Interview

Java supports multiple inheritance through interfaces, not through classes.













     */









}
