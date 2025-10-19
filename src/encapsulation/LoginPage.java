package encapsulation;

	

	// Encapsulation Example in Automation Testing
	public class LoginPage {

	    // Step 1: Private data members (data hidden)  
	    private String username;
	    private String password;

	    // Step 2: Public getter and setter methods (controlled access)
	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getPassword() {
	        return password;
	    }

	    // Step 3: Behavior (simulate login)
	    public void performLogin() {
	        System.out.println("Entering Username: " + username);
	        System.out.println("Entering Password: " + password);
	        System.out.println("Clicking Login button...");
	        System.out.println("Login Successful!");
	    }
	}

/*
 
 💡 Correct and Polished Explanation:

Encapsulation is the combination of data hiding and data control.
We don’t give direct access to a class’s data (variables).
Instead, we access and modify the data through getter and setter methods.

The variables (like username and password) are declared as private — meaning they are hidden from outside the class.
We use public getter and setter methods to read and update these variables in a controlled way.

In code,

The private variables and their getter/setter methods are defined in one class,

and the main method (execution logic) is written in another class.

This ensures data security, controlled access, and a clean structure — which is the main purpose of encapsulation.
 
 
✅ In short:

Encapsulation = Data Hiding (private variables) + Controlled Access (getter/setter)
Implementation = One class for data, another class for execution 
 
📝 Encapsulation – Short Answer:

Encapsulation is the combination of data hiding and controlled access in Java.
We make class variables private to hide the data and use public getter and setter methods to access or modify it safely.
It helps to protect data and maintain security. 
 
 
 */

