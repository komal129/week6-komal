package week6_komal;

//Write a Java programme using the following steps.
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the
//print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme.

public class Program3 {

    int a = 10; //instance variable
    static int b = 20; //static variable

    public static void main(String[] args) {
        Program3 obj1 = new Program3();
        obj1.method1();
        method2();

    }

    //instance method
    public void method1() {
        System.out.println(a);
        System.out.println(b);

    }

    //static method
    public static void method2() {
        Program3 obj = new Program3();
        System.out.println(obj.a);
        System.out.println(b);

    }
}
