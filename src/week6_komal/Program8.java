package week6_komal;

//Write a program to calculate the area of a triangle.

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        Program8 obj = new Program8();
        obj.areaOfTriangle();
    }

    public void areaOfTriangle() {
        // Calculate area of triangle Area = (width*height)/2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the width of the Triangle:");
        double b = scanner.nextDouble();
        System.out.println("Please enter the height of the Triangle:");
        double h = scanner.nextDouble();
        double area = (b*h)/2;
        System.out.println("Area of the Triangle is: " + area );
        scanner.close();
    }
}
