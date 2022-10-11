package week6_komal;
//17. Write a Java program to convert a decimal number to binary number.

import java.util.Scanner;

public class Program17 {

    public static void main(String[] args) {
        Program17 obj = new Program17();
        obj.convert();
    }

    //Converting decimal to binary
    public void convert() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int dec = s.nextInt();
        System.out.println("Binary number is : " + (Integer.toBinaryString(dec)));
        s.close();

    }
}
