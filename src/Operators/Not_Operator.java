package Operators;

public class Not_Operator {
	
	    public static void main(String[] args) {


			boolean UserloggedIn = false;  // Change this to false to test the "not logged in" scenario

			if (!UserloggedIn)   // !UserloggedIn means user is NOT logged in

			{
				System.out.println("The User is not loggedIn Please login");
			}

			else
			{
				System.out.println("Welcome user");
			}


		}
	}

/*

✅ Real Meaning in Application

If user is NOT logged in → ask to login
If user already logged in → welcome them

✅ One Line Summary ⭐

👉 !loggedIn means user is NOT logged in.


✅ Interview Gold Line 🎯

👉 ! operator is used to check negative scenarios like not logged in, not visible, not enabled.

 */

