package inheritance;


// Multilevel inheritance example

public class GrandParent {


    public void land()
    {
        System.out.println("Grandparent owns land");
    }


}


/*

Parent extends GrandParent, and Child extends Parent
so the Child class can access the properties and methods of both Parent and GrandParent

✅ Inheritance Chain
GrandParent  →  Parent  →  Child




 */