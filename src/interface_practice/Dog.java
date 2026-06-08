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

		Dog d  = new Dog();

		d.eat();
		d.sound();
		
		
	}

}


/*

🔑 In short:

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