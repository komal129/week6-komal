package week6_komal;

//Write a Java program to add two binary numbers.

import java.util.Scanner;

public class Program16 {

    public static void main(String[] args) {
        Program16 obj = new Program16();
        obj.addbinarynum();
    }

    // Adding two binary numbers
    public void addbinarynum() {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter two binary numbers");
        String b1 = s.nextLine();
        String b2 = s.nextLine();

        int num1 = Integer.parseInt(b1, 2);
        int num2 = Integer.parseInt(b2, 2);
        int sum = num1 + num2;

        System.out.println("The Sum of given binary numbers is : ");
        System.out.println(Integer.toBinaryString(sum));
        s.close();

    }
}
