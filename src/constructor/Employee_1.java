package constructor;

public class Employee_1 {
   // Instance Variables
	String name;                  
	int id;
	String profile;
	String companyname;

	// 🏗️ 2️⃣ Parameterized constructor
	public Employee_1(String empName, int empId, String empProfile, String empCompany) {
		name = empName;
		id = empId;
		profile = empProfile;
		companyname = empCompany;
		System.out.println("Employee object created using Parameterized Constructor!");

	}

	// 📋 Method to display employee info
	public void displayEmployeeInfo() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Profile: " + profile);
		System.out.println("Company: " + companyname);
		System.out.println("----------------------------------");

	}

	public static void main(String[] args) {

		// Using parameterized constructor
		Employee_1 obj = new Employee_1("Maruti Pujari", 10740399, "Automation tester", "LTI");
		Employee_1 obj1 = new Employee_1("Avinash Mali", 10540399, "Automation tester", "Capgemini");
		
//		 Calling method to display values
		obj.displayEmployeeInfo();
		obj1.displayEmployeeInfo();

	}
}