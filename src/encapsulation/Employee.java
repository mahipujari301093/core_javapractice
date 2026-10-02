package encapsulation;

public class Employee {



    private String name;       // Private variable (Data Hiding)


    public void setName(String empName)   // Setter method
    
    {
        name = empName;
    }

    
    public String getName()    // Getter method
    
    {
        return name;
    }




}


/*

Real-Time Example

Imagine an employee registration system.

HR enters the employee's name using setName().
The application displays the employee's name using getName().
No one can directly access the name variable because it is private.





*/