package week6_komal;

//Write a program to convert the upper case to lower case.

import java.util.Scanner;

public class Program9 {

    public static void main(String[] args) {
        Program9 obj = new Program9();
        obj.upperTolower();
    }

    public void upperTolower() {
        // Convert Upper Case to Lower Case
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text in Upper Case:");
        String uppstrng = scanner.nextLine();
        String lowstng = uppstrng.toLowerCase();
        System.out.println("The Lower case string is: " + lowstng);
        scanner.close();
    }
}
