package week6_komal;

//Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C).

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        Program7 obj = new Program7();
        obj.degreeToCelsius();
    }

    // Convert Fahrenheit to degree Celsius
    public void degreeToCelsius() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature in Fahrenheit:");
        double f = scanner.nextDouble();
        System.out.println("Temperature in degree celsius is: " + ((f-32)*5/9) + " C");
        scanner.close();
    }
}
