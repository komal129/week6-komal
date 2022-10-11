package week6_komal;

//Write a Java program to swap two variables.

public class Program15 {

    int a = 10;
    int b = 20;
    int temp;

    public static void main(String[] args) {
        Program15 obj = new Program15();
        obj.swap();
    }

    //Swap method
    public void swap(){
        System.out.println("Before swapping : a,b = " +a+ "," +b);
        temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping :  a,b = "+a+ "," +b);



    }
}
