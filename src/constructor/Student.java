package constructor;

public class Student {   // No-argument constructor example

    String name;
    int age;

    // No-argument constructor (written by programmer)

    public Student()
    {
        this.name = "Vishal Pujari";
        this.age = 32;


    }

    // create Method to display Student info
    public void displayStudentInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[]args)
    {

        Student s = new Student(); // Constructor is called automatically when object is created
        s.displayStudentInfo();

    }


/*

✅ One Line Interview Definition 🥇

👉 A no-argument constructor is a constructor that does not take any parameters and is used to initialize objects with default values.


✅ Interview Golden Line 🥇

👉 this keyword refers to the current object and is mainly used to access instance variables inside constructors or non-static methods.



 */












}
