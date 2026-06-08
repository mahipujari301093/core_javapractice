package constructor;

public class Student {


    public Student()  // No-argument constructor
    {
        System.out.println("First constructor called");
    }

    public Student(String name)  // With argument constructor
    {
        this();      // Calling first constructor inside second constructor by using this() keyword
        System.out.println("Second constructor called with name: " + name);
    }


    public static void main(String[]args)
    {
        Student s = new Student("Vishal Pujari");
    }


/*

this() keyword helps reuse one constructor inside another constructor of the same class, reducing duplicate code.

this() is used to call another constructor of the same class.




 */














}
