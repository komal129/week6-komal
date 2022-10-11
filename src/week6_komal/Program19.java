package week6_komal;

//19. Write a Java program to convert a given string into lowercase.

import java.util.Scanner;

public class Program19 {

    public static void main(String[] args) {

        Program19 obj = new Program19();
        obj.upperTolower1();
    }

    //Upper case to Lower case conversion
    public void upperTolower1() {
        // Convert Upper Case to Lower Case
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string in Upper Case:");
        String uppstrng = scanner.nextLine();
        String lowstng = uppstrng.toLowerCase();
        System.out.println("The Lower case string is: " + lowstng);
        scanner.close();
    }
}
