package interface_practice;

public class Dog implements Animal {
	
	public void eat() // implementing the abstract method from the interface
	{
		
		System.out.println("Dog is eating");
	}
	
	public void sound() //
	{
		
		System.out.println("Dog says Woof!");
	}
	
	public static void main(String[]args)
	{
		
		Animal a = new Dog();  //  here we are creating an interface reference and class object to achieve polymorphism
	
		a.eat();
		a.sound();
		
		
	}

}


/*

🔑 In short:

✅ Final One-Line Summary -> Animal a = new Dog();
👉 We create a child object with a parent reference so that the program can work with any
implementation without changing existing code.


✅ Real-Time Example (Selenium)
Interface: WebDriver
Implementing Classes: ChromeDriver, FirefoxDriver, SafariDriver, EdgeDriver


✅ What client says
👉 "Run tests in Firefox instead of Chrome."

✅ Current implementation
WebDriver driver = new ChromeDriver(); // Current implementation

✅ What we change
WebDriver driver = new FirefoxDriver(); // New implementation without changing existing code

✅ What remains SAME

✔ Interface → WebDriver
✔ Test scripts
✔ Methods → get(), findElement(), click()
✔ Framework design

Only object creation changes.

*/