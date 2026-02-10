package constructor;

public class Employee {    // calling one constructor from another constructor example

    // No-argument constructor
    public Employee()
    {
        System.out.println("No-argument constructor called");;

    }


    // with parameter constructor

    public Employee(int id,String name) {

        this();   // Calling the no arguments constructor in to the parameterized constructor
        System.out.println("Parameterized constructor called");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    public static void main(String[]args)
    {

        Employee e = new Employee(10740399, "Vishal Pujari");   // we can change the values of id and name as per our choice


    }

}


/*

👉 By using this(), we can call one constructor from another constructor
within the same class.



 */