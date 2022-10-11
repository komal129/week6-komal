package week6_komal;

//Write a program for a calculator with addition, subtraction, multiplication
//and division methods all with parameters and use string concatenation
//methods.(Note: Two static and Two instance methods.)

public class Program5 {

    int num1 = 20;
    int num2 = 10;

    public static void main(String[] args) {

        System.out.println("------------------------------");
        System.out.println("      Calculator              ");
        System.out.println("------------------------------");
        Program5 program5 = new Program5();
        program5.addition();
        program5.subtraction();
        multiplication();
        division();

    }


    public void addition(){
        System.out.println("Addition of given numbers: " + (num1+num2));

    }

    public void subtraction(){
        System.out.println("Subtraction of given numbers: " + (num1-num2));

    }

    public static void multiplication(){
        Program5 obj1 = new Program5();
        System.out.println("Multiplication of given numbers: " + (obj1.num1*obj1.num2));

    }

    public static void division(){
        Program5 obj2 = new Program5();
        System.out.println("Division of given numbers: " + (obj2.num1/ obj2.num2));


    }
}
