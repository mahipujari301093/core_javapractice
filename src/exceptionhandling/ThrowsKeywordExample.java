package exceptionhandling;


import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeywordExample {


    public void uploadDocument() throws FileNotFoundException {

		FileReader file = new FileReader("policy_document.txt");  // This line may throw FileNotFoundException if the file does not exist in the specified path.

		System.out.println("Document uploaded successfully");

	}


	 public static void main(String[]args) throws FileNotFoundException {

		 ThrowsKeywordExample t = new ThrowsKeywordExample();
		 t.uploadDocument();


	 }


	 /*

throws keyword in Java:

Definition:

The throws keyword is used in a method declaration to inform the caller that the method may throw an exception,
and the caller is responsible for handling it.

public void uploadDocument() throws FileNotFoundException
throws = I am informing that an exception may come.




 */
	
	
	
	
	

}
