package week6_komal;

//14. Write a Java program to print the area and perimeter of a rectangle.

public class Program14 {

    public static void main(String[] args) {
        Program14 obj = new Program14();
        obj.rectangle();
    }

    public void rectangle(){
        System.out.println("Width = 5.5 Height = 8.5");
        System.out.println("Area of rectangle is " + (5.6*8.5));
        System.out.println("Perimeter of rectangle is " + (2*(5.6+8.5)));

    }
}
