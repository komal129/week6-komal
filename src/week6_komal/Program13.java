package week6_komal;

//13. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Program13 {

    public static void main(String[] args) {
        Program13 obj = new Program13();
        obj.average();

    }

    //Calculating average of three numbers
    public void average(){

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        System.out.println("Average of the given numbers is: " + ((num1+num2+num3)/3));
        s.close();
    }
}
