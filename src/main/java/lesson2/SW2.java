package lesson2;public class SW2 {
    public static void main(String[] args) {
        lastDigit(7, 17);
        lastDigit(6, 17);
        lastDigit(3, 113);
    }

    public static void lastDigit(int a, int b) {
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;


        if (lastDigitA == lastDigitB) {
            System.out.println("true");
        } else {
            System.out.println("false");
            }
        }

//    public static void main(String[] args) {
//        System.out.println(lastDigit(7, 17)); // true
//        System.out.println(lastDigit(6, 17)); // false
//        System.out.println(lastDigit(3, 113)); // true
//    }
//
//    public static boolean lastDigit(int a, int b) {
//        return (a % 10 == b % 10);
//    }
//}
    }

