package thiskeyword;

public class Practice {

	int a = 10000;
	int b = 20000;

	public void NS() {

		int a = 30;
		int b = 20;

		System.out.println(a); // local variable a
		System.out.println(b); // local variable b

		System.out.println(this.a); // instance variable a (using this keyword)
		System.out.println(this.b); // instance variable b (using this keyword)

	}

	public static void main(String[] args) {

		Practice pr = new Practice();

		pr.NS();
	}

}
