package week6_komal;

//Write a Java program to display the following pattern.

public class Program11 {

    public static void main(String[] args) {
            Program11 program11 = new Program11();
            program11.line4();
    }

    public void line1(){
        System.out.println("J  a v  v  a");
    }

    public void line2(){
        line1();
        System.out.println("J aa v v aa");
    }

    public void line3(){
        line2();
        System.out.println("J J aaaa V V aaaa");

    }

    public void line4(){
        line3();
        System.out.println("J J a  a V a  a");

    }
}
