package lesson1;//1. Write a Java program to print 'Hello' on the screen and then print your name on a separate line.
//Expected Output :
//Hello
//Vasiliy Pupkin
//
//2. Write a Java program to print the result of the following operations.
//a. -5 + 8 * 6
//b. 20 + -3*5 / 8
//
//3. Write a java program with 5 decimal variables. Multiply all 5 of them and print results in the following format:
//number a * number b *.... equals <result>

public class HW1 {
    public static void main(String[] args) {
        String txt1 = "Hello";
        String txt2 = "Iana Fitzgerald";
        int a = -5;
        int b = 8;
        int c = 6;
        double result = (double) a + b * c;

        int a1 = 20;
        int b1 = -3;
        int c1 = 5;
        double result1 = (double) a1 + (double) (b1 * c1) / b;

        double a2 = 3.13;
        double b2 = 4.141;
        double c2 = 5.556;
        double d2 = 6.26;
        double e2 = 7.1766;
        double result2 = (double)a2 * b2 * c2 * d2 * e2;



        System.out.println(txt1);
        System.out.println(txt2);

        System.out.println("Calculation" + " " + a + "+" + b + "*" + c + "="  + result);
        System.out.println("Calculation2" + " " + a1 + "+" + "(" + b1 + "*" + c1 + ")" + "/" + b + "="  + result1);
        System.out.println("Calculation3" + " " + a2 + "*" + " " + b2 + "*" + " " + c2 + "*" + " " + d2 + "*" + " " + e2 + " " + "=" + " "  + result2);


    }

}