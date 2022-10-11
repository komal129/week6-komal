package week6_komal;

//10. Write a Java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class Program10 {

    public static void main(String[] args) {
        Program10 obj = new Program10();
        obj.multiplication();
    }

    public void multiplication() {
        //Multiplication table
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = scanner.nextInt();
        System.out.println(num + " * 1 = " + num);
        System.out.println(num + " * 2 = " + (num * 2));
        System.out.println(num + " * 3 = " + (num * 3));
        System.out.println(num + " * 4 = " + (num * 4));
        System.out.println(num + " * 5 = " + (num * 5));
        System.out.println(num + " * 6 = " + (num * 6));
        System.out.println(num + " * 7 = " + (num * 7));
        System.out.println(num + " * 8 = " + (num * 8));
        System.out.println(num + " * 9 = " + (num * 9));
        System.out.println(num + " * 10 = " + (num * 10));
        scanner.close();
    }
}

