package constructor;

public class Employee {


//Instance Variables
	String name;
	int id;
	String profile;
	String companyname;

	// 🏗️ No-argument constructor
	public Employee()

	{
		// Initialize default values
		name = "Maruti Pujari";
		id = 10740399;
		profile = "Senior quality engineer";
		companyname = "LTI Mindtree";
		System.out.println("Employee object created successfully!");
		
	}

	// Method to display info
	public void displayEmployeeInfo() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Department: " + profile);
		System.out.println("Company: "+ companyname);
	}

	public static void main(String[] args) {
		// When we create object, constructor is called automatically — no need to call it manually.
		Employee emp = new Employee();
		

//		 Calling method to display values
		emp.displayEmployeeInfo();
	}
	
/* 🧠 What is a No-Argument Constructor?

          A no-argument constructor is a constructor that doesn’t take any parameters.

          It’s used when:

          You want to assign default values to variables.

          You just want to print or initialize something automatically when an object is created.

          You don’t need to pass any data from outside.
          
          💡 Why This Is Useful

          In real automation projects (like Selenium), a no-argument constructor can be used to:

          Automatically initialize a WebDriver

          Load configuration files (URLs, credentials)

          Set up environment data (browser, timeouts)

          Print logs before test execution

          Example:

          public BaseTest() {
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://example.com");
          }


          That’s the same concept — the constructor sets everything up automatically.

*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}
