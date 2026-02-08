package stringpractice;

public class Practice {


    public static void main(String[] args) {


        String s1 = "Vishal";
        String s2 = new String("Vishal");
        String s3 = new String("Avinash");
        String S4 = "Radhe";
        String S5 = "Radhe";
        String S6 = "Maruti";

        System.out.println(s1.equals(s2));  // true - both have same value/content ("Vishal")
        System.out.println(s1 == s2);       // false - different memory references
        System.out.println(s2.equals(s3));  // false - different content ("Vishal" vs "Avinash")
        System.out.println(s2 == s3);       // false - different memory references
        System.out.println(S4 == S5);       // true - both point to same string
        System.out.println(S5 == S6);       // false - different memory references

    }


}
