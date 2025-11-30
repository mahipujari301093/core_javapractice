package datatype;

public class Demo {

    int a = 10;
    double b = 20.5;
    char c = 'a';

    public void display() {
        System.out.println("Integer value: " + a);
        System.out.println("Double value: " + b);
        System.out.println("Character value: " + c);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.display();
    }



}
