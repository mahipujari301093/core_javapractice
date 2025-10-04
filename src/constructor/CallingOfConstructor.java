package constructor;


public class CallingOfConstructor {
    int num1;
    int num2;

    // 1️⃣ No-argument constructor
    public CallingOfConstructor() {
        this(100, 200); // Calls with arguments constructor
        System.out.println("No-argument constructor called");
    }

    // 2️⃣ Constructor with arguments
    public CallingOfConstructor(int a, int b) {
        num1 = a;
        num2 = b;
        System.out.println("Constructor with arguments called: num1 = " + num1 + ", num2 = " + num2);
    }

    public static void main(String[] args) {
    	CallingOfConstructor obj = new CallingOfConstructor(); // Calls no-argument constructor
    }
}





