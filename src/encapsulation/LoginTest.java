package encapsulation;

public class LoginTest {
	
	
	    public static void main(String[] args) {
	        
	        // Create object of LoginPage
	        LoginPage login = new LoginPage();

	        // Use setter methods to set data
	        login.setUsername("10740399");
	        login.setPassword("Nordea@04");

	        // Perform login
	        login.performLogin();

	        // Optional: use getters to verify values
	        System.out.println("Username used: " + login.getUsername());
	        System.out.println("Password used: " + login.getPassword());
	    }
	}



