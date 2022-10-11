package week6_komal;

//Write a Java programme using the following steps.
//4.1 Declare two instance and two static variables.
//4.2 Declare one instance method.
//4.3 Declare one static method.
//4.4 Call all four instance and static variables into both instance and static methods inside the
//print statement.
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.

public class Program4 {

    int int_var = 10;
    static int st_int_var = 20;
    String str_var = "Prime";
    static String st_str_var = "Testing";

    public static void main(String[] args) {
        Program4 obj1 = new Program4();
        obj1.instanceMethod();
        staticMethod();
    }

    public void instanceMethod() {
        System.out.println(int_var);
        System.out.println(st_int_var);
        System.out.println(str_var);
        System.out.println(st_str_var);

    }

    public static void staticMethod() {
        Program4 obj = new Program4();
        System.out.println(obj.int_var);
        System.out.println(st_int_var);
        System.out.println(obj.str_var);
        System.out.println(st_str_var);

    }
}
