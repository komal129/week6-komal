package week6_komal;

//Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).

import java.util.Scanner;

public class Program6 {

    public static void main(String[] args) {
        Program6 obj = new Program6();
        obj.area();
    }


    public void area() {
        // Calculate area of circle form radius
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius of the circle:");
        double r = scanner.nextDouble();
        System.out.println("Area of the circle is: " + (3.14 * r * r)); //Pi = 3.14
        scanner.close();
    }
}