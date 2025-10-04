package constructor;

	public class Employee_This {

		// Instance Variable
	    String name;
	    int id;
	    String profile;

	    // Parameterized constructor
	    public Employee_This(String name, int id, String profile) {
	        this.name = name;       // 'this.name' refers to instance variable
	        this.id = id;           // 'this.id' refers to instance variable
	        this.profile = profile; // 'this.profile' refers to instance variable
	        System.out.println("Employee object created using 'this' keyword in constructor!");
	    }

	    // Method to display employee info
	    public void displayEmployeeInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Profile: " + profile);
	        System.out.println("----------------------------------");
	    }

	    public static void main(String[] args) {
	        // Creating objects using parameterized constructor
	        Employee_This emp1 = new Employee_This("Vishal Pujari", 108855, "Automation Tester");
	        Employee_This emp2 = new Employee_This("Maruti Pujari", 10740399, "Senior QA Engineer");

	        // Display employee details
	        emp1.displayEmployeeInfo();
	        emp2.displayEmployeeInfo();
	    }
	}

/* 🔹 Explanation

     The constructor parameter names are the same as instance variable names: name, id, profile.

     To avoid confusion, we use this.name to refer to the instance variable and name to refer to the parameter.

     This ensures the object gets the correct values.
*/

