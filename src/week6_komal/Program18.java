package week6_komal;

//18. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

import java.util.Scanner;

public class Program18 {

    public static void main(String[] args) {
        Program18 obj = new Program18();
        obj.compute();

    }

    //sum (addition), multiply, subtract, divide and remainder of two numbers
    public void compute(){

        Scanner s = new Scanner(System.in);
        System.out.println("Input first time : ");
        int num1 = s.nextInt();
        System.out.println("Input second number : ");
        int num2 = s.nextInt();
        System.out.println(num1 + "+" + num2 + "="  + (num1+num2));
        System.out.println(num1 + "-" + num2 + "="  + (num1-num2));
        System.out.println(num1 + "*" + num2 + "="  + (num1*num2));
        System.out.println(num1 + "/" + num2 + "="  + (num1/num2));
        System.out.println(num1 + "mod" + num2 + "="  + (num1%num2));
        s.close();

    }
}
