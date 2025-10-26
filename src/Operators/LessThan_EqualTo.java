package Operators;

public class LessThan_EqualTo {

	public class LessThanEqualTo {
		
		
		public static void main(String[] args) {

			int a = 10;
			int b = 20;
			int c = 20;

			System.out.println(a <= b);      // 10 <= 20 → true
			System.out.println(b <= a);     // 20 <= 10 → false
			System.out.println(b <= c);    // 20 <= 20 → true (equal case)
		}
	}

}
