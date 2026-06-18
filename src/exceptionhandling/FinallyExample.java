package exceptionhandling;

public class FinallyExample {


    public static void main(String[] args) {

        String username = "admin";
        String password = "admin123";

        try
        {

            if(username.equals("admin") && password.equals("wromg123"))

            {

                System.out.println("Login successful");

            }
            else
            {

                throw new IllegalArgumentException("Invalid username or password");

            }

        }
        catch(IllegalArgumentException e) //
        {

            System.out.println("Error: " + e.getMessage());

        }

       finally  // finally block will execute regardless of whether an exception is thrown or not
        {

            System.out.println("Closing login session");

        }


    }

/*

The finally block always executes after the try block (and after the catch block if an exception occurs),
regardless of whether an exception occurs or not.

The finally block is used to execute mandatory cleanup code. It executes whether an exception occurs or not." ✅



 */
















}
