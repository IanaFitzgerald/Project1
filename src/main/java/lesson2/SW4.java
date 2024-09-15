package lesson2;

public class SW4 {
    public static void main(String[] args) {
        lov7(2, 7);
        lov7(6, 4);
        lov7(2, 5);
    }

    public static void lov7(int a, int b) {

        if (a == 7 || b == 7 || a + b == 7) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}
